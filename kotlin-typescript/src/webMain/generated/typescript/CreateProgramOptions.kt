// Automatically generated - do not modify!

package typescript

sealed external interface CreateProgramOptions {
    var rootNames: js.array.ReadonlyArray<String>
    var options: CompilerOptions
    var projectReferences: (js.array.ReadonlyArray<ProjectReference>)?
    var host: CompilerHost?
    var oldProgram: Program?
    var configFileParsingDiagnostics: (js.array.ReadonlyArray<Diagnostic>)?
}
