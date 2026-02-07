// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * An [Event] which fires when an [AuthenticationSession] is added, removed, or changed.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationSessionsChangeEvent)
 */
@JsPlainObject
external interface AuthenticationSessionsChangeEvent {
    /**
     * The [AuthenticationProvider] that has had its sessions change.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationSessionsChangeEvent.provider)
     */
    val provider: AuthenticationProviderInformation
}
