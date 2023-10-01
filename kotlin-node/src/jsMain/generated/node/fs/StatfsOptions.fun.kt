package node.fs


sealed external interface StatfsOptions : StatFsOptions {
    override var bigint: Boolean?
}
