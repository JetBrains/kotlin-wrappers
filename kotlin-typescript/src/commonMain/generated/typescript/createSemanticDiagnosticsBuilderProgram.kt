// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Create the builder to manage semantic diagnostics and cache them
 */
external fun createSemanticDiagnosticsBuilderProgram(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: SemanticDiagnosticsBuilderProgram = definedExternally,
    configFileParsingDiagnostics: js.array.ReadonlyArray<Diagnostic> = definedExternally,
): SemanticDiagnosticsBuilderProgram

external fun createSemanticDiagnosticsBuilderProgram(
    rootNames: (js.array.ReadonlyArray<String>)?,
    options: CompilerOptions?,
    host: CompilerHost = definedExternally,
    oldProgram: SemanticDiagnosticsBuilderProgram = definedExternally,
    configFileParsingDiagnostics: js.array.ReadonlyArray<Diagnostic> = definedExternally,
    projectReferences: js.array.ReadonlyArray<ProjectReference> = definedExternally,
): SemanticDiagnosticsBuilderProgram
