// Generated by Karakum - do not modify it manually!

package node.fs

import web.abort.Abortable

@js.objects.JsPlainObject
sealed external interface ReadFileAsyncOptions :
    ObjectEncodingOptions,
    Abortable {
    var flag: OpenMode?
}
