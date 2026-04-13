// Automatically generated - do not modify!

package typescript

@kotlinx.js.JsPlainObject
external interface IncrementalProgramOptions<T : BuilderProgram> {
    var rootNames: js.array.ReadonlyArray<String>
    var options: CompilerOptions
    var configFileParsingDiagnostics: (js.array.ReadonlyArray<Diagnostic>)?
    var projectReferences: (js.array.ReadonlyArray<ProjectReference>)?
    var host: CompilerHost?
    var createProgram: CreateProgram<T>?
}
