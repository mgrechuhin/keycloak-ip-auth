package com.github.mgrechuhin.keycloakipauth;

import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.models.AuthenticationExecutionModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderConfigProperty;

import java.util.List;

public class IPHttpHeaderAuthFactory implements AuthenticatorFactory {

    public static final String ID = "ip-http-header-auth";

    private static final Authenticator AUTHENTICATOR_INSTANCE = new IPHttpHeaderAuth();

    public String getDisplayType() {
        return "Maks IP-Http-Header Authenticator";
    }

    public String getReferenceCategory() {
        return null;
    }

    public boolean isConfigurable() {
        return false;
    }

    public AuthenticationExecutionModel.Requirement[] getRequirementChoices() {
        return new AuthenticationExecutionModel.Requirement[] {
                AuthenticationExecutionModel.Requirement.REQUIRED,
                AuthenticationExecutionModel.Requirement.ALTERNATIVE
        };
    }

    public boolean isUserSetupAllowed() {
        return false;
    }

    public String getHelpText() {
        return "Auth by IP in HTTP Header";
    }

    public List<ProviderConfigProperty> getConfigProperties() {
        return null;
    }

    public Authenticator create(KeycloakSession keycloakSession) {
        return AUTHENTICATOR_INSTANCE;
    }

    public void init(org.keycloak.Config.Scope scope) {
    }

    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
    }

    public void close() {
    }

    public String getId() {
        return ID;
    }
}
