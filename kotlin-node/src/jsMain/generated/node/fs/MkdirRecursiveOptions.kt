package node.fs


external interface MkdirRecursiveOptions : MakeDirectoryOptions {
    @JsName("recursive")
    var requiredRecursive: Boolean
}
