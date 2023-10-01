package node.fs


sealed external interface MkdirRecursiveOptions : MakeDirectoryOptions {
    @JsName("recursive")
    var requiredRecursive: Boolean
}
