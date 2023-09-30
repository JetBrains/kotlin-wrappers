package node.fs


external interface FileHandleStatBigIntOpts : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
