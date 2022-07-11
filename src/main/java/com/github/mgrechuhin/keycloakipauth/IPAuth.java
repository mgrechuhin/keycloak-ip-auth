package com.github.mgrechuhin.keycloakipauth;

import org.jboss.logging.Logger;
import org.jboss.resteasy.spi.HttpRequest;
import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.Authenticator;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

public class IPAuth implements Authenticator {

    private static final Logger logger = Logger.getLogger(IPAuth.class);

    public void authenticate(AuthenticationFlowContext context) {
        final HttpRequest httpRequest = context.getHttpRequest();
        final String remoteIPAddress = context.getConnection().getRemoteAddr();
        logger.info("IP: " + remoteIPAddress);

        context.attempted();

        final RealmModel realm = context.getRealm();
        final String username = "me";
        final UserModel user = context.getSession().users().getUserByUsername(realm, username);

        // @todo allow success/failure logging for brute force

        context.getAuthenticationSession().setAuthenticatedUser(user);
        context.success();
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
