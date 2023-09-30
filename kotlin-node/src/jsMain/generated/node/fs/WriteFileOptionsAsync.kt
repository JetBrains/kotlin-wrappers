package node.fs

import node.events.Abortable


external interface WriteFileAsyncOptions : ObjectEncodingOptions, Abortable {
    var mode: Mode?
    var flag: OpenMode?
}
