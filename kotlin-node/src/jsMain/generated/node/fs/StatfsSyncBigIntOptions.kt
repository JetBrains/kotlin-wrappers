package node.fs


external interface StatfsSyncBigIntOptions : StatFsOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
