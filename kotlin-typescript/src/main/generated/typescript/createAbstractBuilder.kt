// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import js.core.ReadonlyArray

/**
 * Creates a builder thats just abstraction over program and can be used with watch
 */
external fun createAbstractBuilder(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: BuilderProgram = definedExternally,
    configFileParsingDiagnostics: ReadonlyArray<Diagnostic> = definedExternally,
): BuilderProgram

external fun createAbstractBuilder(
    rootNames: ReadonlyArray<String>?,
    options: CompilerOptions?,
    host: CompilerHost = definedExternally,
    oldProgram: BuilderProgram = definedExternally,
    configFileParsingDiagnostics: ReadonlyArray<Diagnostic> = definedExternally,
    projectReferences: ReadonlyArray<ProjectReference> = definedExternally,
): BuilderProgram
