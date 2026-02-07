// Automatically generated - do not modify!

package node.fs

import web.abort.Abortable

@kotlinx.js.JsPlainObject
sealed external interface WriteFileAsyncOptions :
    ObjectEncodingOptions,
    Abortable {
    var mode: Mode?
    var flag: OpenMode?
    var flush: Boolean?
}
