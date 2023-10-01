package node.fs


sealed external interface StatSyncFnSimpleOptions : StatSyncOptions {
    override var bigint: Boolean?

    @JsName("throwIfNoEntry")
    var requiredThrowIfNoEntry: Boolean
}
