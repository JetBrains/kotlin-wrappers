package node.fs

import node.events.Abortable


sealed external interface ReadFileOptions : ObjectEncodingOptions, Abortable {
    var flag: String?
}
