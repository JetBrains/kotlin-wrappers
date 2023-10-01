package node.fs


sealed external interface MkdirOptions : MakeDirectoryOptions {
    override var recursive: Boolean?
}
