package node.fs


external interface MkdirAsyncOptions : MakeDirectoryOptions {
    override var recursive: Boolean?
}
