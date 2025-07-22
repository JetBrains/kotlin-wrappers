// Automatically generated - do not modify!

package vscode

/**
 * The options passed in to the {@link AuthenticationProvider.getSessions} and
 * {@link AuthenticationProvider.createSession} call.
 */
external interface AuthenticationProviderSessionOptions {
    /**
     * The account that is being asked about. If this is passed in, the provider should
     * attempt to return the sessions that are only related to this account.
     */
    var account: AuthenticationSessionAccountInformation?
}
