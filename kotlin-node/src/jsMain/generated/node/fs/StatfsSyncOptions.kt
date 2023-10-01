package node.fs


sealed external interface StatfsSyncOptions : StatFsOptions {
    override var bigint: Boolean?
}
