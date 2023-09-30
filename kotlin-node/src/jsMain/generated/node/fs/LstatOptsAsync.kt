package node.fs


external interface LstatOpts : StatOptions {
    override var bigint: Boolean?
}
