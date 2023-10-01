package node.fs


sealed external interface LstatBigIntOpts : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
