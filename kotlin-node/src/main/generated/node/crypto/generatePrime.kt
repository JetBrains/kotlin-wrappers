// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

import kotlinx.js.ArrayBuffer
import kotlinx.js.BigInt

/**
 * Generates a pseudorandom prime of `size` bits.
 *
 * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
 *
 * The `options.add` and `options.rem` parameters can be used to enforce additional
 * requirements, e.g., for Diffie-Hellman:
 *
 * * If `options.add` and `options.rem` are both set, the prime will satisfy the
 * condition that `prime % add = rem`.
 * * If only `options.add` is set and `options.safe` is not `true`, the prime will
 * satisfy the condition that `prime % add = 1`.
 * * If only `options.add` is set and `options.safe` is set to `true`, the prime
 * will instead satisfy the condition that `prime % add = 3`. This is necessary
 * because `prime % add = 1` for `options.add > 2` would contradict the condition
 * enforced by `options.safe`.
 * * `options.rem` is ignored if `options.add` is not given.
 *
 * Both `options.add` and `options.rem` must be encoded as big-endian sequences
 * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
 *
 * By default, the prime is encoded as a big-endian sequence of octets
 * in an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
 * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) is provided.
 * @since v15.8.0
 * @param size The size (in bits) of the prime to generate.
 */
external fun generatePrime(
    size: Number,
    callback: (
        error: Error?,
        prime: ArrayBuffer,
    ) -> Unit,
)


/**
 * Generates a pseudorandom prime of `size` bits.
 *
 * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
 *
 * The `options.add` and `options.rem` parameters can be used to enforce additional
 * requirements, e.g., for Diffie-Hellman:
 *
 * * If `options.add` and `options.rem` are both set, the prime will satisfy the
 * condition that `prime % add = rem`.
 * * If only `options.add` is set and `options.safe` is not `true`, the prime will
 * satisfy the condition that `prime % add = 1`.
 * * If only `options.add` is set and `options.safe` is set to `true`, the prime
 * will instead satisfy the condition that `prime % add = 3`. This is necessary
 * because `prime % add = 1` for `options.add > 2` would contradict the condition
 * enforced by `options.safe`.
 * * `options.rem` is ignored if `options.add` is not given.
 *
 * Both `options.add` and `options.rem` must be encoded as big-endian sequences
 * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
 *
 * By default, the prime is encoded as a big-endian sequence of octets
 * in an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
 * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) is provided.
 * @since v15.8.0
 * @param size The size (in bits) of the prime to generate.
 */
external fun generatePrime(
    size: Number,
    options: GeneratePrimeOptionsBigInt,
    callback: (
        error: Error?,
        prime: BigInt,
    ) -> Unit,
)


/**
 * Generates a pseudorandom prime of `size` bits.
 *
 * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
 *
 * The `options.add` and `options.rem` parameters can be used to enforce additional
 * requirements, e.g., for Diffie-Hellman:
 *
 * * If `options.add` and `options.rem` are both set, the prime will satisfy the
 * condition that `prime % add = rem`.
 * * If only `options.add` is set and `options.safe` is not `true`, the prime will
 * satisfy the condition that `prime % add = 1`.
 * * If only `options.add` is set and `options.safe` is set to `true`, the prime
 * will instead satisfy the condition that `prime % add = 3`. This is necessary
 * because `prime % add = 1` for `options.add > 2` would contradict the condition
 * enforced by `options.safe`.
 * * `options.rem` is ignored if `options.add` is not given.
 *
 * Both `options.add` and `options.rem` must be encoded as big-endian sequences
 * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
 *
 * By default, the prime is encoded as a big-endian sequence of octets
 * in an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
 * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) is provided.
 * @since v15.8.0
 * @param size The size (in bits) of the prime to generate.
 */
external fun generatePrime(
    size: Number,
    options: GeneratePrimeOptionsArrayBuffer,
    callback: (
        error: Error?,
        prime: ArrayBuffer,
    ) -> Unit,
)


/**
 * Generates a pseudorandom prime of `size` bits.
 *
 * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
 *
 * The `options.add` and `options.rem` parameters can be used to enforce additional
 * requirements, e.g., for Diffie-Hellman:
 *
 * * If `options.add` and `options.rem` are both set, the prime will satisfy the
 * condition that `prime % add = rem`.
 * * If only `options.add` is set and `options.safe` is not `true`, the prime will
 * satisfy the condition that `prime % add = 1`.
 * * If only `options.add` is set and `options.safe` is set to `true`, the prime
 * will instead satisfy the condition that `prime % add = 3`. This is necessary
 * because `prime % add = 1` for `options.add > 2` would contradict the condition
 * enforced by `options.safe`.
 * * `options.rem` is ignored if `options.add` is not given.
 *
 * Both `options.add` and `options.rem` must be encoded as big-endian sequences
 * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
 *
 * By default, the prime is encoded as a big-endian sequence of octets
 * in an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
 * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) is provided.
 * @since v15.8.0
 * @param size The size (in bits) of the prime to generate.
 */
external fun generatePrime(
    size: Number,
    options: GeneratePrimeOptions,
    callback: (
        error: Error?,
        prime: Any, /* ArrayBuffer | bigint */
    ) -> Unit,
)
