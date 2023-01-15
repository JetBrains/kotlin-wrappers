// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import js.buffer.ArrayBufferView
import node.buffer.Buffer

/**
 * Decrypts `buffer` with `key`.`buffer` was previously encrypted using
 * the corresponding private key, for example using {@link privateEncrypt}.
 *
 * If `key` is not a `KeyObject`, this function behaves as if`key` had been passed to {@link createPublicKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
 *
 * Because RSA public keys can be derived from private keys, a private key may
 * be passed instead of a public key.
 * @since v1.1.0
 */
external fun publicDecrypt(
    key: Any, /* RsaPublicKey | RsaPrivateKey | KeyLike */
    buffer: ArrayBufferView,
): Buffer
