package node.fs


sealed external interface StatSyncFnOptions : StatSyncOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
    override var throwIfNoEntry: Boolean?
}
