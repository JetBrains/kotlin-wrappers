package node.fs

import node.events.Abortable


sealed external interface ReadFileAsyncOptions : ObjectEncodingOptions, Abortable {
    var flag: OpenMode?
}
