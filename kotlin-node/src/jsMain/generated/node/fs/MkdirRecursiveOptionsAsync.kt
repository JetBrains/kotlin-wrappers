package node.fs


external interface MkdirRecursiveAsyncOptions : MakeDirectoryOptions {
    @JsName("recursive")
    var requiredRecursive: Boolean
}
