package node.fs


external interface MkdirOptions : MakeDirectoryOptions {
    override var recursive: Boolean?
}
