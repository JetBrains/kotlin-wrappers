package node.fs


sealed external interface FstatBigIntOptions : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
