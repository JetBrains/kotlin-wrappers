// Automatically generated - do not modify!

package web.share

import kotlinx.js.ReadonlyArray
import web.file.File

sealed external interface ShareData {
    var files: ReadonlyArray<File>?
    var text: String?
    var title: String?
    var url: String?
}
