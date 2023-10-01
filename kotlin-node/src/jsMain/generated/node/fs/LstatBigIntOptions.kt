package node.fs


sealed external interface LstatBigIntOptions : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
