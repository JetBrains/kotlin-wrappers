package node.fs

import node.events.Abortable


sealed external interface ReadFileBufferAsyncOptions : Abortable {
    var encoding: Nothing?
    var flag: OpenMode?
}
