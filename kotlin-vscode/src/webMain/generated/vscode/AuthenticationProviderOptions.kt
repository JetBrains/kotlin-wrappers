// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Options for creating an [AuthenticationProvider].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProviderOptions)
 */
@JsPlainObject
external interface AuthenticationProviderOptions {
    /**
     * Whether it is possible to be signed into multiple accounts at once with this provider.
     * If not specified, will default to false.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProviderOptions.supportsMultipleAccounts)
     */
    val supportsMultipleAccounts: Boolean?
}
