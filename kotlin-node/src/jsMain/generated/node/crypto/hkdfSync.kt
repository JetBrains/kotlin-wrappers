// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

import js.buffer.ArrayBuffer

/**
 * Provides a synchronous HKDF key derivation function as defined in RFC 5869\. The
 * given `ikm`, `salt` and `info` are used with the `digest` to derive a key of`keylen` bytes.
 *
 * The successfully generated `derivedKey` will be returned as an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer).
 *
 * An error will be thrown if any of the input arguments specify invalid values or
 * types, or if the derived key cannot be generated.
 *
 * ```js
 * import { Buffer } from 'buffer';
 * const {
 *   hkdfSync
 * } = await import('crypto');
 *
 * const derivedKey = hkdfSync('sha512', 'key', 'salt', 'info', 64);
 * console.log(Buffer.from(derivedKey).toString('hex'));  // '24156e2...5391653'
 * ```
 * @since v15.0.0
 * @param digest The digest algorithm to use.
 * @param ikm The input keying material. It must be at least one byte in length.
 * @param salt The salt value. Must be provided but can be zero-length.
 * @param info Additional info value. Must be provided but can be zero-length, and cannot be more than 1024 bytes.
 * @param keylen The length of the key to generate. Must be greater than 0. The maximum allowable value is `255` times the number of bytes produced by the selected digest function (e.g. `sha512`
 * generates 64-byte hashes, making the maximum HKDF output 16320 bytes).
 */
external fun hkdfSync(
    digest: String,
    ikm: Any, /* BinaryLike | KeyObject */
    salt: BinaryLike,
    info: BinaryLike,
    keylen: Number,
): ArrayBuffer
