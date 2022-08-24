// Automatically generated - do not modify!

@file:JsModule("node:crypto")
@file:JsNonModule

package node.crypto

/**
 * Checks the primality of the `candidate`.
 * @since v15.8.0
 * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
 */
external fun checkPrime(
    value: LargeNumberLike,
    callback: (
        error: Error?,
        result: Boolean,
    ) -> Unit,
)


/**
 * Checks the primality of the `candidate`.
 * @since v15.8.0
 * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
 */
external fun checkPrime(
    value: LargeNumberLike,
    options: CheckPrimeOptions,
    callback: (
        error: Error?,
        result: Boolean,
    ) -> Unit,
)
