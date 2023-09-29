package node.fs


external interface StatSyncFnOptions : StatSyncOptions {
    @JsName("bigint")
    var requiredBigInt: Boolean
    override var throwIfNoEntry: Boolean?
}
