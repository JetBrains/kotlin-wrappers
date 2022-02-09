// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

import kotlinx.js.ReadonlyArray

/**
 * Create the builder to manage semantic diagnostics and cache them
 */
external fun createSemanticDiagnosticsBuilderProgram(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: SemanticDiagnosticsBuilderProgram = definedExternally,
    configFileParsingDiagnostics: ReadonlyArray<Diagnostic> = definedExternally,
): SemanticDiagnosticsBuilderProgram

external fun createSemanticDiagnosticsBuilderProgram(
    rootNames: ReadonlyArray<String>?,
    options: CompilerOptions?,
    host: CompilerHost = definedExternally,
    oldProgram: SemanticDiagnosticsBuilderProgram = definedExternally,
    configFileParsingDiagnostics: ReadonlyArray<Diagnostic> = definedExternally,
    projectReferences: ReadonlyArray<ProjectReference> = definedExternally,
): SemanticDiagnosticsBuilderProgram
