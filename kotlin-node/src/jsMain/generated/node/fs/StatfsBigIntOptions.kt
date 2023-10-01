package node.fs


sealed external interface StatfsBigIntOptions : StatFsOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
