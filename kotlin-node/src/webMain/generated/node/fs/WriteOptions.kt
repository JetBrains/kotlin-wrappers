// Automatically generated - do not modify!

package node.fs

sealed external interface WriteOptions {
    /**
     * @default 0
     */
    var offset: Double?

    /**
     * @default `buffer.byteLength - offset`
     */
    var length: Double?

    /**
     * @default null
     */
    var position: Double?
}
