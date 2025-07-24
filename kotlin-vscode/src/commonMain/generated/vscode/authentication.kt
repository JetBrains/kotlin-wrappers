// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsString
import js.promise.PromiseLike
import vscode.authentication.getSession
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Namespace for authentication.
 */
external object authentication {
    /**
     * Get an authentication session matching the desired scopes. Rejects if a provider with providerId is not
     * registered, or if the user does not consent to sharing authentication information with
     * the extension. If there are multiple sessions with the same scopes, the user will be shown a
     * quickpick to select which account they would like to use.
     *
     * Currently, there are only two authentication providers that are contributed from built in extensions
     * to the editor that implement GitHub and Microsoft authentication: their providerId's are 'github' and 'microsoft'.
     * @param providerId The id of the provider to use
     * @param scopes A list of scopes representing the permissions requested. These are dependent on the authentication provider
     * @param options The [AuthenticationGetSessionOptions] to use
     * @returns A thenable that resolves to an authentication session
     */
    fun getSession(
        providerId: String,
        scopes: ReadonlyArray<JsString>,
        options: JsAny, /* AuthenticationGetSessionOptions & { /** */createIfNone: true | AuthenticationGetSessionPresentationOptions } */
    ): PromiseLike<AuthenticationSession>

    /**
     * Get an authentication session matching the desired scopes. Rejects if a provider with providerId is not
     * registered, or if the user does not consent to sharing authentication information with
     * the extension. If there are multiple sessions with the same scopes, the user will be shown a
     * quickpick to select which account they would like to use.
     *
     * Currently, there are only two authentication providers that are contributed from built in extensions
     * to the editor that implement GitHub and Microsoft authentication: their providerId's are 'github' and 'microsoft'.
     * @param providerId The id of the provider to use
     * @param scopes A list of scopes representing the permissions requested. These are dependent on the authentication provider
     * @param options The [AuthenticationGetSessionOptions] to use
     * @returns A thenable that resolves to an authentication session
     */
    // getSession(providerId: string, scopes: readonly string[], options: AuthenticationGetSessionOptions & { /** literal-type defines return type */forceNewSession: true | AuthenticationGetSessionPresentationOptions | AuthenticationForceNewSessionOptions }): Thenable<AuthenticationSession>

    /**
     * Get an authentication session matching the desired scopes. Rejects if a provider with providerId is not
     * registered, or if the user does not consent to sharing authentication information with
     * the extension. If there are multiple sessions with the same scopes, the user will be shown a
     * quickpick to select which account they would like to use.
     *
     * Currently, there are only two authentication providers that are contributed from built in extensions
     * to the editor that implement GitHub and Microsoft authentication: their providerId's are 'github' and 'microsoft'.
     * @param providerId The id of the provider to use
     * @param scopes A list of scopes representing the permissions requested. These are dependent on the authentication provider
     * @param options The [AuthenticationGetSessionOptions] to use
     * @returns A thenable that resolves to an authentication session if available, or undefined if there are no sessions
     */
    fun getSession(
        providerId: String,
        scopes: ReadonlyArray<JsString>,
        options: AuthenticationGetSessionOptions = definedExternally,
    ): PromiseLike<AuthenticationSession?>

    /**
     * Get all accounts that the user is logged in to for the specified provider.
     * Use this paired with [getSession] in order to get an authentication session for a specific account.
     *
     * Currently, there are only two authentication providers that are contributed from built in extensions
     * to the editor that implement GitHub and Microsoft authentication: their providerId's are 'github' and 'microsoft'.
     *
     * Note: Getting accounts does not imply that your extension has access to that account or its authentication sessions. You can verify access to the account by calling [getSession].
     *
     * @param providerId The id of the provider to use
     * @returns A thenable that resolves to a readonly array of authentication accounts.
     */
    fun getAccounts(providerId: String): PromiseLike<ReadonlyArray<AuthenticationSessionAccountInformation>>

    /**
     * An [Event] which fires when the authentication sessions of an authentication provider have
     * been added, removed, or changed.
     */
    val onDidChangeSessions: Event<AuthenticationSessionsChangeEvent>

    /**
     * Register an authentication provider.
     *
     * There can only be one provider per id and an error is being thrown when an id
     * has already been used by another provider. Ids are case-sensitive.
     *
     * @param id The unique identifier of the provider.
     * @param label The human-readable name of the provider.
     * @param provider The authentication provider provider.
     * @param options Additional options for the provider.
     * @returns A [Disposable] that unregisters this provider when being disposed.
     */
    fun registerAuthenticationProvider(
        id: String,
        label: String,
        provider: AuthenticationProvider,
        options: AuthenticationProviderOptions = definedExternally,
    ): Disposable
}
