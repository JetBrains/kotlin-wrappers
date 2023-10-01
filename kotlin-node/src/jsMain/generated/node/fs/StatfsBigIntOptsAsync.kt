package node.fs


sealed external interface StatfsBigIntOpts : StatFsOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
