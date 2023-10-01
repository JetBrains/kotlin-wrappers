package node.fs


sealed external interface StatBigIntOpts : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
