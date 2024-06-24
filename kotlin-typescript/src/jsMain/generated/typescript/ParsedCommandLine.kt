// Automatically generated - do not modify!

package typescript

/** Either a parsed command line or a parsed tsconfig.json */
sealed external interface ParsedCommandLine {
    var options: CompilerOptions
    var typeAcquisition: TypeAcquisition?
    var fileNames: js.array.ReadonlyArray<String>
    var projectReferences: (js.array.ReadonlyArray<ProjectReference>)?
    var watchOptions: WatchOptions?
    var raw: Any?
    var errors: js.array.ReadonlyArray<Diagnostic>
    var wildcardDirectories: MapLike<WatchDirectoryFlags>?
    var compileOnSave: Boolean?
}
