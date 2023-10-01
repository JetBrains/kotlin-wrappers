package node.fs


sealed external interface FstatSyncBigIntOptions : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
