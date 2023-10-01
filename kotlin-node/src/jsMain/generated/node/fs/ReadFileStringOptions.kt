package node.fs

import node.events.Abortable


sealed external interface ReadFileStringOptions : Abortable {
    var encoding: node.buffer.BufferEncoding
    var flag: String?
}
