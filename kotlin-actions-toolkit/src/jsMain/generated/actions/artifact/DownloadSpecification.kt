// Automatically generated - do not modify!

package actions.artifact

import js.array.ReadonlyArray

sealed external interface DownloadSpecification {
    var rootDownloadLocation: String
    var directoryStructure: ReadonlyArray<String>
    var emptyFilesToCreate: ReadonlyArray<String>
    var filesToDownload: ReadonlyArray<DownloadItem>
}
