package node.fs

import node.events.Abortable


sealed external interface WriteFileAsyncOptions : ObjectEncodingOptions, Abortable {
    var mode: Mode?
    var flag: OpenMode?
}
