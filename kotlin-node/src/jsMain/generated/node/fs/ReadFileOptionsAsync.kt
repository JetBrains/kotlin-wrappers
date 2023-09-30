package node.fs

import node.events.Abortable


external interface ReadFileAsyncOptions : ObjectEncodingOptions, Abortable {
    var flag: OpenMode?
}
