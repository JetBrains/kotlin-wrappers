package node.fs


sealed external interface LstatOpts : StatOptions {
    override var bigint: Boolean?
}
