package node.fs


external interface MkdirSyncRecursiveOptions : MakeDirectoryOptions {
    @JsName("recursive")
    var requiredRecursive: Boolean
}
