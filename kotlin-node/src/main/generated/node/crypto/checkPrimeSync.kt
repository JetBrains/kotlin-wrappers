// Automatically generated - do not modify!

@file:JsModule("node:crypto")

package node.crypto

/**
 * Checks the primality of the `candidate`.
 * @since v15.8.0
 * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
 * @return `true` if the candidate is a prime with an error probability less than `0.25 ** options.checks`.
 */
external fun checkPrimeSync(
    candidate: LargeNumberLike,
    options: CheckPrimeOptions = definedExternally,
): Boolean
