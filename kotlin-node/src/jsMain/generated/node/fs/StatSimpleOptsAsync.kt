package node.fs


sealed external interface StatSimpleOpts : StatOptions {
    override var bigint: Boolean?
}
