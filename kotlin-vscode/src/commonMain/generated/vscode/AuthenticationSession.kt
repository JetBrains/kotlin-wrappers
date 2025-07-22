// Automatically generated - do not modify!

package vscode

/**
 * Represents a session of a currently logged in user.
 */
external interface AuthenticationSession {
    /**
    // ORIGINAL SOURCE

    /**
     * The identifier of the authentication session.
    */
    readonly id: string;

    /**
     * The access token.
    */
    readonly accessToken: string;

    /**
     * The account associated with the session.
    */
    readonly account: AuthenticationSessionAccountInformation;

    /**
     * The permissions granted by the session's access token. Available scopes
     * are defined by the {@link AuthenticationProvider}.
    */
    readonly scopes: readonly string[];

    // ORIGINAL SOURCE
     **/
}
