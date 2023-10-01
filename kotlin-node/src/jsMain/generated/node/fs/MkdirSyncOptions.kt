package node.fs


sealed external interface MkdirSyncOptions : MakeDirectoryOptions {
    override var recursive: Boolean?
}
