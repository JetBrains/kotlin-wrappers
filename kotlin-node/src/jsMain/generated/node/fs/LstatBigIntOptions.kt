package node.fs


external interface LstatBigIntOptions : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
