// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Optional options to be used when calling [authentication.getSession] with interactive options `forceNewSession` & `createIfNone`.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationGetSessionPresentationOptions)
 */
@JsPlainObject
external interface AuthenticationGetSessionPresentationOptions {
    /**
     * An optional message that will be displayed to the user when we ask to re-authenticate. Providing additional context
     * as to why you are asking a user to re-authenticate can help increase the odds that they will accept.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationGetSessionPresentationOptions.detail)
     */
    var detail: String?
}
