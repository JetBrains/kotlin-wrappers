package node.fs


sealed external interface ReaddirSyncOptions : ObjectEncodingOptions {
    var withFileTypes: Boolean?
}
