// Automatically generated - do not modify!

package node.crypto

sealed external interface CheckPrimeOptions {
    /**
     * The number of Miller-Rabin probabilistic primality iterations to perform.
     * When the value is 0 (zero), a number of checks is used that yields a false positive rate of at most 2-64 for random input.
     * Care must be used when selecting a number of checks.
     * Refer to the OpenSSL documentation for the BN_is_prime_ex function nchecks options for more details.
     *
     * @default 0
     */
    var checks: Number?
}
