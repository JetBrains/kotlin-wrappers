package node.fs


sealed external interface FileHandleReadFileAsyncOptions : ObjectEncodingOptions {
    var flag: OpenMode?
}
