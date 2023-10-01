package node.fs


sealed external interface FileHandleStatOpts : StatOptions {
    override var bigint: Boolean?
}
