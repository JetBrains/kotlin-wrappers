// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject

/**
 * An [Event] which fires when an [AuthenticationSession] is added, removed, or changed.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProviderAuthenticationSessionsChangeEvent)
 */
@JsPlainObject
external interface AuthenticationProviderAuthenticationSessionsChangeEvent {
    /**
     * The [AuthenticationSessions][AuthenticationSession] of the [AuthenticationProvider] that have been added.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProviderAuthenticationSessionsChangeEvent.added)
     */
    val added: ReadonlyArray<AuthenticationSession>?

    /**
     * The [AuthenticationSessions][AuthenticationSession] of the [AuthenticationProvider] that have been removed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProviderAuthenticationSessionsChangeEvent.removed)
     */
    val removed: ReadonlyArray<AuthenticationSession>?

    /**
     * The [AuthenticationSessions][AuthenticationSession] of the [AuthenticationProvider] that have been changed.
     * A session changes when its data excluding the id are updated. An example of this is a session refresh that results in a new
     * access token being set for the session.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProviderAuthenticationSessionsChangeEvent.changed)
     */
    val changed: ReadonlyArray<AuthenticationSession>?
}
