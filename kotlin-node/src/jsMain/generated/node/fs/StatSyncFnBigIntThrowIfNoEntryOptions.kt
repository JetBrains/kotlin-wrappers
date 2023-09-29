package node.fs


external interface StatSyncFnBigIntThrowIfNoEntryOptions : StatSyncOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
}
