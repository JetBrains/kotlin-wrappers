// Generated by Karakum - do not modify it manually!

package node.fs

sealed external interface ReadSyncOptions {
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
