// Automatically generated - do not modify!

package typescript

sealed external interface CreateProgramOptions {
    var rootNames: ReadonlyArray<String>
    var options: CompilerOptions
    var projectReferences: ReadonlyArray<ProjectReference>?
    var host: CompilerHost?
    var oldProgram: Program?
    var configFileParsingDiagnostics: ReadonlyArray<Diagnostic>?
}
