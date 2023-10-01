package node.fs


sealed external interface WatchFileBigIntOptions : WatchFileOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
