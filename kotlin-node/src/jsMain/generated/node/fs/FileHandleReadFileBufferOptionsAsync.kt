package node.fs


sealed external interface FileHandleReadFileBufferAsyncOptions {
    var encoding: Nothing?
    var flag: OpenMode?
}
