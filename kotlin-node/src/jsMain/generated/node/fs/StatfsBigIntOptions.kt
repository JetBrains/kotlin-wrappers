package node.fs


external interface StatfsBigIntOptions : StatFsOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
