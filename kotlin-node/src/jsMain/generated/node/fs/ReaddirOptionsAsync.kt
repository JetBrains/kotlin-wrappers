package node.fs


sealed external interface ReaddirAsyncOptions : ObjectEncodingOptions {
    var withFileTypes: Boolean?
}
