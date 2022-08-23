// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import node.buffer.Buffer

/**
 * Provides a synchronous Password-Based Key Derivation Function 2 (PBKDF2)
 * implementation. A selected HMAC digest algorithm specified by `digest` is
 * applied to derive a key of the requested byte length (`keylen`) from the`password`, `salt` and `iterations`.
 *
 * If an error occurs an `Error` will be thrown, otherwise the derived key will be
 * returned as a `Buffer`.
 *
 * If `digest` is `null`, `'sha1'` will be used. This behavior is deprecated,
 * please specify a `digest` explicitly.
 *
 * The `iterations` argument must be a number set as high as possible. The
 * higher the number of iterations, the more secure the derived key will be,
 * but will take a longer amount of time to complete.
 *
 * The `salt` should be as unique as possible. It is recommended that a salt is
 * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
 *
 * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
 *
 * ```js
 * const {
 *   pbkdf2Sync
 * } = await import('crypto');
 *
 * const key = pbkdf2Sync('secret', 'salt', 100000, 64, 'sha512');
 * console.log(key.toString('hex'));  // '3745e48...08d59ae'
 * ```
 *
 * The `crypto.DEFAULT_ENCODING` property may be used to change the way the`derivedKey` is returned. This property, however, is deprecated and use
 * should be avoided.
 *
 * ```js
 * import crypto from 'crypto';
 * crypto.DEFAULT_ENCODING = 'hex';
 * const key = crypto.pbkdf2Sync('secret', 'salt', 100000, 512, 'sha512');
 * console.log(key);  // '3745e48...aa39b34'
 * ```
 *
 * An array of supported digest functions can be retrieved using {@link getHashes}.
 * @since v0.9.3
 */
external fun pbkdf2Sync(
    password: BinaryLike,
    salt: BinaryLike,
    iterations: Number,
    keylen: Number,
    digest: String,
): Buffer
