package node.fs


sealed external interface StatfsOpts : StatFsOptions {
    override var bigint: Boolean?
}
