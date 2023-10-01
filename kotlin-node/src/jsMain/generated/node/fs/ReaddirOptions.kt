package node.fs


sealed external interface ReaddirOptions : ObjectEncodingOptions {
    var withFileTypes: Boolean?
}
