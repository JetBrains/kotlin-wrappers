package node.fs

import node.events.Abortable


sealed external interface WatchOptions : Abortable {
    var encoding: (Any /* BufferEncoding | 'buffer' | undefined */)?
    var persistent: Boolean?
    var recursive: Boolean?
}
