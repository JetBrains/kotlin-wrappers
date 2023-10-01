package node.fs


sealed external interface FileHandleStatBigIntOpts : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
