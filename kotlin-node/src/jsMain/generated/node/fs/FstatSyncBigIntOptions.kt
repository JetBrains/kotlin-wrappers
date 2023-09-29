package node.fs


external interface FstatSyncBigIntOptions : StatOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
