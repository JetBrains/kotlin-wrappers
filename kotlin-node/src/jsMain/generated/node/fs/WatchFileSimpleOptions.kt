package node.fs


sealed external interface WatchFileSimpleOptions : WatchFileOptions {
    override var bigint: Boolean?
}
