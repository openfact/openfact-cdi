package org.openfact.services.resources.admin;

import org.openfact.models.EmisorModel;

public class AdminAuth {

    /*private final RealmModel realm;
    private final AccessToken token;
    private final UserModel user;
    private final ClientModel client;

    public AdminAuth(RealmModel realm, AccessToken token, UserModel user, ClientModel client) {
        this.token = token;
        this.realm = realm;

        this.user = user;
        this.client = client;
    }

    public RealmModel getRealm() {
        return realm;
    }

    public UserModel getUser() {
        return user;
    }

    public ClientModel getClient() {
        return client;
    }

    public AccessToken getToken() {
        return token;
    }*/


    public boolean hasRealmRole(String role) {
        /*if (client instanceof ClientModel) {
            RoleModel roleModel = realm.getRole(role);
            if (roleModel == null) return false;
            return user.hasRole(roleModel) && client.hasScope(roleModel);
        } else {
            AccessToken.Access access = token.getRealmAccess();
            return access != null && access.isUserInRole(role);
        }*/
        return false;
    }

    public boolean hasOneOfRealmRole(String... roles) {
        /*for (String r : roles) {
            if (hasRealmRole(r)) {
                return true;
            }
        }
        return false;*/
        return false;
    }

    public boolean hasAppRole(String role) {
        /*if (client instanceof ClientModel) {
            RoleModel roleModel = app.getRole(role);
            if (roleModel == null) return false;
            return user.hasRole(roleModel) && client.hasScope(roleModel);
        } else {
            AccessToken.Access access = token.getResourceAccess(app.getClientId());
            return access != null && access.isUserInRole(role);
        }*/
        return false;
    }

    public boolean hasOneOfAppRole(String... roles) {
        /*for (String r : roles) {
            if (hasAppRole(app, r)) {
                return true;
            }
        }
        return false;*/
        return false;
    }

    public EmisorModel getEmisor() {
        // TODO Auto-generated method stub
        return null;
    }

}
