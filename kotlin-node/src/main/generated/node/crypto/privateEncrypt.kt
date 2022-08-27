// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import kotlinx.js.ArrayBufferView
import node.buffer.Buffer

/**
 * Encrypts `buffer` with `privateKey`. The returned data can be decrypted using
 * the corresponding public key, for example using {@link publicDecrypt}.
 *
 * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
 * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
 * @since v1.1.0
 */
external fun privateEncrypt(
    privateKey: Any, /* RsaPrivateKey | KeyLike */
    buffer: ArrayBufferView,
): Buffer
