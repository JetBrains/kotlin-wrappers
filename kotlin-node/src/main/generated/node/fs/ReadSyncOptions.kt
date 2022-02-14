// Automatically generated - do not modify!

package node.fs

sealed external interface ReadSyncOptions {
    /**
     * @default 0
     */
    var offset: Number?

    /**
     * @default `length of buffer`
     */
    var length: Number?

    /**
     * @default null
     */
    var position: ReadPosition?
}
