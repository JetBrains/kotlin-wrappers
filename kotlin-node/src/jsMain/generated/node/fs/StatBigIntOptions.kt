package node.fs


external interface StatBigIntOptions : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
