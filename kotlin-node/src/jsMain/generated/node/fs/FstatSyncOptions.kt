package node.fs


sealed external interface FstatSyncOptions : StatOptions {
    override var bigint: Boolean?
}
