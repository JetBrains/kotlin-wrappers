// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

import kotlinx.js.ReadonlyArray

/**
 * Create the builder that can handle the changes in program and iterate through changed files
 * to emit the those files and manage semantic diagnostics cache as well
 */
external fun createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram = definedExternally,
    configFileParsingDiagnostics: ReadonlyArray<Diagnostic> = definedExternally,
): EmitAndSemanticDiagnosticsBuilderProgram

external fun createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: ReadonlyArray<String>?,
    options: CompilerOptions?,
    host: CompilerHost = definedExternally,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram = definedExternally,
    configFileParsingDiagnostics: ReadonlyArray<Diagnostic> = definedExternally,
    projectReferences: ReadonlyArray<ProjectReference> = definedExternally,
): EmitAndSemanticDiagnosticsBuilderProgram
