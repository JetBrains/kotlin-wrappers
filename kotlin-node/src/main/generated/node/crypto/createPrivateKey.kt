// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Creates and returns a new key object containing a private key. If `key` is a
 * string or `Buffer`, `format` is assumed to be `'pem'`; otherwise, `key`must be an object with the properties described above.
 *
 * If the private key is encrypted, a `passphrase` must be specified. The length
 * of the passphrase is limited to 1024 bytes.
 * @since v11.6.0
 */
external fun createPrivateKey(
    key: Any, /* PrivateKeyInput | string | Buffer | JsonWebKeyInput */
): KeyObject
