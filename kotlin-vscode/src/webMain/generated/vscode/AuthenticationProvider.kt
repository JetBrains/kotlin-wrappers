// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import js.core.Void
import js.promise.PromiseLike

/**
 * A provider for performing authentication to a service.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProvider)
 */
external interface AuthenticationProvider {
    /**
     * An [Event] which fires when the array of sessions has changed, or data
     * within a session has changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProvider.onDidChangeSessions)
     */
    val onDidChangeSessions: Event<AuthenticationProviderAuthenticationSessionsChangeEvent>

    /**
     * Get a list of sessions.
     * @param scopes An optional list of scopes. If provided, the sessions returned should match
     * these permissions, otherwise all sessions should be returned.
     * @param options Additional options for getting sessions.
     * @returns A promise that resolves to an array of authentication sessions.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProvider.getSessions)
     */
    fun getSessions(
        scopes: ReadonlyArray<JsString>?,
        options: AuthenticationProviderSessionOptions,
    ): PromiseLike<ReadonlyArray<AuthenticationSession>>

    /**
     * Prompts a user to login.
     *
     * If login is successful, the onDidChangeSessions event should be fired.
     *
     * If login fails, a rejected promise should be returned.
     *
     * If the provider has specified that it does not support multiple accounts,
     * then this should never be called if there is already an existing session matching these
     * scopes.
     * @param scopes A list of scopes, permissions, that the new session should be created with.
     * @param options Additional options for creating a session.
     * @returns A promise that resolves to an authentication session.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProvider.createSession)
     */
    fun createSession(
        scopes: ReadonlyArray<JsString>,
        options: AuthenticationProviderSessionOptions,
    ): PromiseLike<AuthenticationSession>

    /**
     * Removes the session corresponding to session id.
     *
     * If the removal is successful, the onDidChangeSessions event should be fired.
     *
     * If a session cannot be removed, the provider should reject with an error message.
     * @param sessionId The id of the session to remove.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AuthenticationProvider.removeSession)
     */
    fun removeSession(sessionId: String): PromiseLike<Void>
}
