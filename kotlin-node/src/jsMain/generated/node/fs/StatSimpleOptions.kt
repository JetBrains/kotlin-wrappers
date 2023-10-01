package node.fs


sealed external interface StatSimpleOptions : StatOptions {
    override var bigint: Boolean?
}
