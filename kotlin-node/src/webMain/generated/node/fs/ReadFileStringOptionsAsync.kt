// Automatically generated - do not modify!

package node.fs

import web.abort.Abortable

@kotlinx.js.JsPlainObject
sealed external interface ReadFileStringAsyncOptions : Abortable {
    var encoding: node.buffer.BufferEncoding
    var flag: OpenMode?
}
