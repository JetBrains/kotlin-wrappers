// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An [Event] which fires when an [AuthenticationSession] is added, removed, or changed.
 */
external interface AuthenticationProviderAuthenticationSessionsChangeEvent {
    /**
     * The {@link AuthenticationSession AuthenticationSessions} of the [AuthenticationProvider] that have been added.
     */
    val added: ReadonlyArray<AuthenticationSession>?

    /**
     * The {@link AuthenticationSession AuthenticationSessions} of the [AuthenticationProvider] that have been removed.
     */
    val removed: ReadonlyArray<AuthenticationSession>?

    /**
     * The {@link AuthenticationSession AuthenticationSessions} of the [AuthenticationProvider] that have been changed.
     * A session changes when its data excluding the id are updated. An example of this is a session refresh that results in a new
     * access token being set for the session.
     */
    val changed: ReadonlyArray<AuthenticationSession>?
}
