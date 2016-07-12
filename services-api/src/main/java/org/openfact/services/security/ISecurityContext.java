package org.openfact.services.security;

import java.util.Set;

import org.openfact.representations.idm.PermissionType;

public interface ISecurityContext {

    /**
     * @return the currently authentiated user.
     */
    public String getCurrentUser();

    /**
     * @return the currently authenticated user's full name
     */
    public String getFullName();

    /**
     * @return the currently authenticated user's email address
     */
    public String getEmail();

    /**
     * Returns true if the current user is an administrator.
     * 
     * @return true if admin, else false
     */
    public boolean isAdmin();

    /**
     * Returns true if the current user has permission to perform a particular
     * action for the provided organization.
     * 
     * @param permission
     *            the permission type
     * @param organizationId
     *            the org id
     * @return true if has permission, else false
     */
    public boolean hasPermission(PermissionType permission, String emisorId);

    /**
     * @param organizationId
     */
    public boolean isMemberOf(String emisorId);

    /**
     * Returns the set of organizations for which the current user is allowed to
     * perform a given action.
     * 
     * @param permission
     *            the permission type
     * @return set of permitted organizations
     */
    public Set<String> getEmisoresPermitidos(PermissionType permission);

    /**
     * Gets a request header from the current in-scope request.
     * 
     * @param headerName
     *            the header name
     * @return the request header
     */
    public String getRequestHeader(String headerName);

}
