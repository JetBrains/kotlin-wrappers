// Automatically generated - do not modify!

package actions.artifact

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface DownloadSpecification {
    var rootDownloadLocation: String
    var directoryStructure: ReadonlyArray<String>
    var emptyFilesToCreate: ReadonlyArray<String>
    var filesToDownload: ReadonlyArray<DownloadItem>
}
