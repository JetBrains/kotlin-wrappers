package node.fs

import node.events.Abortable


sealed external interface ReadFileBufferOptions : Abortable {
    var encoding: Nothing?
    var flag: String?
}
