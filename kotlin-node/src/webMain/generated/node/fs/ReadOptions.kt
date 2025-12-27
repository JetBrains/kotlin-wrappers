// Automatically generated - do not modify!

package node.fs

sealed external interface ReadOptions {
    /**
     * @default 0
     */
    var offset: Double?

    /**
     * @default `length of buffer`
     */
    var length: Double?

    /**
     * @default null
     */
    var position: ReadPosition?
}
