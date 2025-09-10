// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsString

/**
 * Represents a session of a currently logged in user.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationSession)
 */
@JsPlainObject
external interface AuthenticationSession {
    /**
     * The identifier of the authentication session.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationSession.id)
     */
    val id: String

    /**
     * The access token.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationSession.accessToken)
     */
    val accessToken: String

    /**
     * The account associated with the session.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationSession.account)
     */
    val account: AuthenticationSessionAccountInformation

    /**
     * The permissions granted by the session's access token. Available scopes
     * are defined by the [AuthenticationProvider].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationSession.scopes)
     */
    val scopes: ReadonlyArray<JsString>
}
