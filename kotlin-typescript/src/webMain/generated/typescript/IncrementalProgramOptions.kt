// Automatically generated - do not modify!

package typescript

import typescript.sync.CompilerHost
import typescript.sync.CompilerOptions
import typescript.sync.Diagnostic
import typescript.sync.ProjectReference

@kotlinx.js.JsPlainObject
external interface IncrementalProgramOptions<T : BuilderProgram> {
    var rootNames: js.array.ReadonlyArray<String>
    var options: CompilerOptions
    var configFileParsingDiagnostics: (js.array.ReadonlyArray<Diagnostic>)?
    var projectReferences: (js.array.ReadonlyArray<ProjectReference>)?
    var host: CompilerHost?
    var createProgram: CreateProgram<T>?
}
