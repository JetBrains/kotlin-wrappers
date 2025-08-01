// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * The options passed in to the [AuthenticationProvider.getSessions] and
 * [AuthenticationProvider.createSession] call.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProviderSessionOptions)
 */
@JsPlainObject
external interface AuthenticationProviderSessionOptions {
    /**
     * The account that is being asked about. If this is passed in, the provider should
     * attempt to return the sessions that are only related to this account.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProviderSessionOptions.account)
     */
    var account: AuthenticationSessionAccountInformation?
}
