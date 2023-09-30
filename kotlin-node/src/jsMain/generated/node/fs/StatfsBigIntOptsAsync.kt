package node.fs


external interface StatfsBigIntOpts : StatFsOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
