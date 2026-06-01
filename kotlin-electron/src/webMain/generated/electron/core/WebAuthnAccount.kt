// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface WebAuthnAccount {
// Docs: https://electronjs.org/docs/api/structures/webauthn-account
    /**
     * URL-safe base64-encoded (no padding) credential ID of the discoverable
     * credential. Matches `PublicKeyCredential.id` returned by
     * `navigator.credentials.get()` in the renderer.
     */
    var credentialId: String

    /**
     * Human-palatable name for the account, intended for display.
     */
    var displayName: String?

    /**
     * Human-palatable identifier for the account (for example, an email address or
     * username).
     */
    var name: String?

    /**
     * URL-safe base64-encoded (no padding) user handle (`user.id`) that was provided
     * when the credential was created.
     */
    var userHandle: String?
}
