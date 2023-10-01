package node.fs


sealed external interface ReaddirWithFileTypesAsyncOptions : ObjectEncodingOptions {
    var withFileTypes: Boolean
}
