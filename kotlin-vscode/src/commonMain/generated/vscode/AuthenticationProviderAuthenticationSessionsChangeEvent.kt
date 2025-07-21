// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * An {@link Event} which fires when an {@link AuthenticationSession} is added, removed, or changed.
*/
export interface AuthenticationProviderAuthenticationSessionsChangeEvent {
/**
 * The {@link AuthenticationSession AuthenticationSessions} of the {@link AuthenticationProvider} that have been added.
*/
readonly added: readonly AuthenticationSession[] | undefined;

/**
 * The {@link AuthenticationSession AuthenticationSessions} of the {@link AuthenticationProvider} that have been removed.
*/
readonly removed: readonly AuthenticationSession[] | undefined;

/**
 * The {@link AuthenticationSession AuthenticationSessions} of the {@link AuthenticationProvider} that have been changed.
 * A session changes when its data excluding the id are updated. An example of this is a session refresh that results in a new
 * access token being set for the session.
*/
readonly changed: readonly AuthenticationSession[] | undefined;
}

// ORIGINAL SOURCE
 **/
