package node.fs


sealed external interface StatSyncFnBigIntOptions : StatSyncOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean

    @JsName("throwIfNoEntry")
    var requiredThrowIfNoEntry: Boolean
}
