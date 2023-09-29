package node.fs

import node.events.Abortable


external interface ReadFileOptions : ObjectEncodingOptions, Abortable {
    var flag: String?
}
