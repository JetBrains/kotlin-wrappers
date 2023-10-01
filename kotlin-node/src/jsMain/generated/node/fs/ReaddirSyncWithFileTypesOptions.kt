package node.fs


sealed external interface ReaddirSyncWithFileTypesOptions : ObjectEncodingOptions {
    var withFileTypes: Boolean
}
