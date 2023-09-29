package node.fs


sealed external interface StatSyncOptions : StatOptions {
    var throwIfNoEntry: Boolean?
}
