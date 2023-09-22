@file:JsModule("node:crypto")

package node.crypto


/**
 * Checks the primality of the `candidate`.
 * @since v15.8.0
 * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
 */
external fun checkPrime(
    value: LargeNumberLike,
    callback: (err: Throwable /* JsError */?, result: Boolean) -> Unit,
): Unit

external fun checkPrime(
    value: LargeNumberLike,
    options: CheckPrimeOptions,
    callback: (err: Throwable /* JsError */?, result: Boolean) -> Unit,
): Unit
