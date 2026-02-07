// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import kotlin.js.JsString

/**
 * Represents parameters for creating a session based on a WWW-Authenticate header value.
 * This is used when an API returns a 401 with a WWW-Authenticate header indicating
 * that additional authentication is required. The details of which will be passed down
 * to the authentication provider to create a session.
 *
 * @note The authorization provider must support handling challenges and specifically
 * the challenges in this WWW-Authenticate value.
 * @note For more information on WWW-Authenticate please see https://developer.mozilla.org/docs/Web/HTTP/Reference/Headers/WWW-Authenticate
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationWwwAuthenticateRequest)
 */
@JsPlainObject
external interface AuthenticationWwwAuthenticateRequest {
    /**
     * The raw WWW-Authenticate header value that triggered this challenge.
     * This will be parsed by the authentication provider to extract the necessary
     * challenge information.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationWwwAuthenticateRequest.wwwAuthenticate)
     */
    val wwwAuthenticate: String

    /**
     * The fallback scopes to use if no scopes are found in the WWW-Authenticate header.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationWwwAuthenticateRequest.fallbackScopes)
     */
    val fallbackScopes: ReadonlyArray<JsString>?
}
