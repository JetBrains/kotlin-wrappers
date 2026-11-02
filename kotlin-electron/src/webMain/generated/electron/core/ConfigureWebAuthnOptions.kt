// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface ConfigureWebAuthnOptions {
    /**
     * Enables the Touch ID / Secure Enclave platform authenticator for Web
     * Authentication requests.
     */
    var touchID: TouchId?

    /**
     * Enables passkeys via Apple's `ASAuthorizationController`. When enabled, passkey
     * operations present the system credential provider sheet (iCloud Keychain,
     * 1Password, Bitwarden, etc.) and credentials sync across the user's devices.
     * Defaults to `false`. Passing `null`/`undefined` (or omitting the key) leaves the
     * previous setting unchanged.
     */
    var platformPasskeys: Boolean?
}
