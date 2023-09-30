package node.fs


external interface LstatBigIntOpts : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
