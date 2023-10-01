package node.fs


sealed external interface FstatOptions : StatOptions {
    override var bigint: Boolean?
}
