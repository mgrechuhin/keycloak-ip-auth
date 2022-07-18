package com.github.mgrechuhin.keycloakipauth;

import org.jboss.logging.Logger;
import org.jboss.resteasy.spi.HttpRequest;
import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.AuthenticationFlowError;
import org.keycloak.authentication.Authenticator;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

import javax.ws.rs.core.HttpHeaders;
import java.util.List;

public class IPHttpHeaderAuth implements Authenticator {

    private static final Logger logger = Logger.getLogger(IPHttpHeaderAuth.class);

    public void authenticate(AuthenticationFlowContext context) {
        final HttpRequest httpRequest = context.getHttpRequest();
        final String remoteIPAddress = context.getConnection().getRemoteAddr();
        final HttpHeaders httpHeaders = httpRequest.getHttpHeaders();
        final List<String> authHeaders = httpHeaders.getRequestHeader(HttpHeaders.AUTHORIZATION);

        final List<String> ipHeaders = httpHeaders.getRequestHeader("MF-DEVICE-IP");
        final List<String> proofHeaders = httpHeaders.getRequestHeader("MF-DEVICE-IP-PROOF");

        context.attempted();
        // @todo allow success/failure logging for brute force

        if (ipHeaders.size() == 1 && proofHeaders.size() == 1 && "proof".equals(proofHeaders.get(0))) {
            logger.info("MF-DEVICE-IP: " + ipHeaders.get(0));
            final RealmModel realm = context.getRealm();
            final String username = "me";
            final UserModel user = context.getSession().users().getUserByUsername(realm, username);
            context.getAuthenticationSession().setAuthenticatedUser(user);
            context.success();
        } else {
            context.failure(AuthenticationFlowError.INVALID_CREDENTIALS);
        }
    }

    public void action(AuthenticationFlowContext authenticationFlowContext) {
    }

    public boolean requiresUser() {
        return false;
    }

    public boolean configuredFor(KeycloakSession keycloakSession, RealmModel realmModel, UserModel userModel) {
        return false;
    }

    public void setRequiredActions(KeycloakSession keycloakSession, RealmModel realmModel, UserModel userModel) {
    }

    public void close() {
    }
}
