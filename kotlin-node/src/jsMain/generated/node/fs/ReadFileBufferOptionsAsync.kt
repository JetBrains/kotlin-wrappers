package node.fs

import node.events.Abortable


external interface ReadFileBufferAsyncOptions : Abortable {
    var encoding: Nothing?
    var flag: OpenMode?
}
