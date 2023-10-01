package node.fs


sealed external interface LstatOptions : StatOptions {
    override var bigint: Boolean?
}
