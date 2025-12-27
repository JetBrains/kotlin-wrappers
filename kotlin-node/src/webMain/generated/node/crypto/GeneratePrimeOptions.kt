// Automatically generated - do not modify!

package node.crypto

sealed external interface GeneratePrimeOptions {
    var add: LargeNumberLike?
    var rem: LargeNumberLike?

    /**
     * @default false
     */
    var safe: Boolean?
    var bigint: Boolean?
}
