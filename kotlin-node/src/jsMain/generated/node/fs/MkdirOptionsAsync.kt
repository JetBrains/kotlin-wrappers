package node.fs


sealed external interface MkdirAsyncOptions : MakeDirectoryOptions {
    override var recursive: Boolean?
}
