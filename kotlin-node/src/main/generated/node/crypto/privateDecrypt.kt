// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import kotlinx.js.ArrayBufferView
import node.buffer.Buffer

/**
 * Decrypts `buffer` with `privateKey`. `buffer` was previously encrypted using
 * the corresponding public key, for example using {@link publicEncrypt}.
 *
 * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_OAEP_PADDING`.
 * @since v0.11.14
 */
external fun privateDecrypt(
    privateKey: Any, /* RsaPrivateKey | KeyLike */
    buffer: ArrayBufferView,
): Buffer
