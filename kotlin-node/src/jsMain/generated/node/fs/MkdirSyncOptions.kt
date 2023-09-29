package node.fs


external interface MkdirSyncOptions : MakeDirectoryOptions {
    override var recursive: Boolean?
}
