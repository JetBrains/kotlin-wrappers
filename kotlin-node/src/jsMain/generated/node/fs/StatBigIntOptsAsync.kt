package node.fs


external interface StatBigIntOpts : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
