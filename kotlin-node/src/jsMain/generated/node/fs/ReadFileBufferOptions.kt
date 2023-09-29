package node.fs

import node.events.Abortable


external interface ReadFileBufferOptions : Abortable {
    var encoding: Nothing?
    var flag: String?
}
