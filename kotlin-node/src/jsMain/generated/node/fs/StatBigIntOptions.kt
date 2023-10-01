package node.fs


sealed external interface StatBigIntOptions : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
