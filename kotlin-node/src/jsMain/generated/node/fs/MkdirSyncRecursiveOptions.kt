package node.fs


sealed external interface MkdirSyncRecursiveOptions : MakeDirectoryOptions {
    @JsName("recursive")
    var requiredRecursive: Boolean
}
