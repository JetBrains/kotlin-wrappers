package node.fs


external interface WatchFileBigIntOptions : WatchFileOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
