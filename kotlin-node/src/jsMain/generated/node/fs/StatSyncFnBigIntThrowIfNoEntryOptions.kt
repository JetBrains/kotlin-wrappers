package node.fs


sealed external interface StatSyncFnBigIntThrowIfNoEntryOptions : StatSyncOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
