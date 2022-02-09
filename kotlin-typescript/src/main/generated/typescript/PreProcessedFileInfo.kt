// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface PreProcessedFileInfo {
    var referencedFiles: ReadonlyArray<FileReference>
    var typeReferenceDirectives: ReadonlyArray<FileReference>
    var libReferenceDirectives: ReadonlyArray<FileReference>
    var importedFiles: ReadonlyArray<FileReference>
    var ambientExternalModules: ReadonlyArray<String>?
    var isLibFile: Boolean
}
