// Automatically generated - do not modify!

package typescript

sealed external interface PreProcessedFileInfo {
    var referencedFiles: js.array.ReadonlyArray<FileReference>
    var typeReferenceDirectives: js.array.ReadonlyArray<FileReference>
    var libReferenceDirectives: js.array.ReadonlyArray<FileReference>
    var importedFiles: js.array.ReadonlyArray<FileReference>
    var ambientExternalModules: js.array.ReadonlyArray<String>?
    var isLibFile: Boolean
}
