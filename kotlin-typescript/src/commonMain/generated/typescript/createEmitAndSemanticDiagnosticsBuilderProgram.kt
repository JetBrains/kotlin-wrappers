// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Create the builder that can handle the changes in program and iterate through changed files
 * to emit the those files and manage semantic diagnostics cache as well
 */
external fun createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram = definedExternally,
    configFileParsingDiagnostics: js.array.ReadonlyArray<Diagnostic> = definedExternally,
): EmitAndSemanticDiagnosticsBuilderProgram

external fun createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: (js.array.ReadonlyArray<String>)?,
    options: CompilerOptions?,
    host: CompilerHost = definedExternally,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram = definedExternally,
    configFileParsingDiagnostics: js.array.ReadonlyArray<Diagnostic> = definedExternally,
    projectReferences: js.array.ReadonlyArray<ProjectReference> = definedExternally,
): EmitAndSemanticDiagnosticsBuilderProgram
