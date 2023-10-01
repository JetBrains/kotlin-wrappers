package node.fs


sealed external interface ReaddirWithFileTypesOptions : ObjectEncodingOptions {
    var withFileTypes: Boolean
}
