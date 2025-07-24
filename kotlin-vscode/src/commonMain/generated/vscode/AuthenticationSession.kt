// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsString

/**
 * Represents a session of a currently logged in user.
 */
external interface AuthenticationSession {
    /**
     * The identifier of the authentication session.
     */
    val id: String

    /**
     * The access token.
     */
    val accessToken: String

    /**
     * The account associated with the session.
     */
    val account: AuthenticationSessionAccountInformation

    /**
     * The permissions granted by the session's access token. Available scopes
     * are defined by the {@link AuthenticationProvider}.
     */
    val scopes: ReadonlyArray<JsString>
}
