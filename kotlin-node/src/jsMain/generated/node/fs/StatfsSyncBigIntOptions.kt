package node.fs


sealed external interface StatfsSyncBigIntOptions : StatFsOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
