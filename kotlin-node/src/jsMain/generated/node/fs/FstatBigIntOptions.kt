package node.fs


external interface FstatBigIntOptions : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
