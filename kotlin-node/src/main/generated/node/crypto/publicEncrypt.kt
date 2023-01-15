// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import js.buffer.ArrayBufferView
import node.buffer.Buffer

/**
 * Encrypts the content of `buffer` with `key` and returns a new `Buffer` with encrypted content. The returned data can be decrypted using
 * the corresponding private key, for example using {@link privateDecrypt}.
 *
 * If `key` is not a `KeyObject`, this function behaves as if`key` had been passed to {@link createPublicKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_OAEP_PADDING`.
 *
 * Because RSA public keys can be derived from private keys, a private key may
 * be passed instead of a public key.
 * @since v0.11.14
 */
external fun publicEncrypt(
    key: Any, /* RsaPublicKey | RsaPrivateKey | KeyLike */
    buffer: ArrayBufferView,
): Buffer
