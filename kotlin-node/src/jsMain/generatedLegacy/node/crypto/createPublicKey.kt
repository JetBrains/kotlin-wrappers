// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Creates and returns a new key object containing a public key. If `key` is a
 * string or `Buffer`, `format` is assumed to be `'pem'`; if `key` is a `KeyObject`with type `'private'`, the public key is derived from the given private key;
 * otherwise, `key` must be an object with the properties described above.
 *
 * If the format is `'pem'`, the `'key'` may also be an X.509 certificate.
 *
 * Because public keys can be derived from private keys, a private key may be
 * passed instead of a public key. In that case, this function behaves as if {@link createPrivateKey} had been called, except that the type of the
 * returned `KeyObject` will be `'public'` and that the private key cannot be
 * extracted from the returned `KeyObject`. Similarly, if a `KeyObject` with type`'private'` is given, a new `KeyObject` with type `'public'` will be returned
 * and it will be impossible to extract the private key from the returned object.
 * @since v11.6.0
 */
external fun createPublicKey(
    key: Any, /* PublicKeyInput | string | Buffer | KeyObject | JsonWebKeyInput */
): KeyObject
