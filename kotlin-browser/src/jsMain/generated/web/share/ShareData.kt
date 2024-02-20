// Automatically generated - do not modify!

package web.share

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.file.File

@JsPlainObject
sealed external interface ShareData {
    var files: ReadonlyArray<File>?
    var text: String?
    var title: String?
    var url: String?
}
