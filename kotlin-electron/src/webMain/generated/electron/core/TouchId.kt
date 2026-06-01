// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface TouchId {
    /**
     * The keychain access group that WebAuthn credentials will be stored under. This
     * value **must** also be present in your app's `keychain-access-groups`
     * code-signing entitlement, and is typically of the form
     * `<TEAM_ID>.<BUNDLE_ID>.webauthn`.
     */
    var keychainAccessGroup: String

    /**
     * Customizes the reason text shown in the macOS Touch ID prompt. macOS renders the
     * prompt as `"<App Name>" is trying to <promptReason>`, so the value should be a
     * lowercase sentence fragment. An optional `$1` placeholder is replaced with the
     * relying party ID (e.g. `example.com`) of the request being authenticated.
     * Defaults to `verify your identity on $1`.
     */
    var promptReason: String?
}
