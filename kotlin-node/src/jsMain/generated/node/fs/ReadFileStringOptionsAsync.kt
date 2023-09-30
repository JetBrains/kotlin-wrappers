package node.fs

import node.events.Abortable


external interface ReadFileStringAsyncOptions : Abortable {
    var encoding: node.buffer.BufferEncoding
    var flag: OpenMode?
}
