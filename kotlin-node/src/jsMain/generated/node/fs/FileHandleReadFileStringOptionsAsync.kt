package node.fs


sealed external interface FileHandleReadFileStringAsyncOptions {
    var encoding: node.buffer.BufferEncoding
    var flag: OpenMode?
}
