package node.fs


sealed external interface ReadFileSyncOptions : ObjectEncodingOptions {
    var flag: String?
}
