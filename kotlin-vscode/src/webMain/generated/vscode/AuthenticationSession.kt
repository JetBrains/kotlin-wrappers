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
     * The access token. This token should be used to authenticate requests to a service. Popularized by OAuth.
     * @reference https://oauth.net/2/access-tokens/
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationSession.accessToken)
     */
    val accessToken: String

    /**
     * The ID token. This token contains identity information about the user. Popularized by OpenID Connect.
     * @reference https://openid.net/specs/openid-connect-core-1_0.html#IDToken
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationSession.idToken)
     */
    val idToken: String?

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
