// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Creates a builder thats just abstraction over program and can be used with watch
 */
external fun createAbstractBuilder(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: BuilderProgram = definedExternally,
    configFileParsingDiagnostics: js.array.ReadonlyArray<Diagnostic> = definedExternally,
): BuilderProgram

external fun createAbstractBuilder(
    rootNames: (js.array.ReadonlyArray<String>)?,
    options: CompilerOptions?,
    host: CompilerHost = definedExternally,
    oldProgram: BuilderProgram = definedExternally,
    configFileParsingDiagnostics: js.array.ReadonlyArray<Diagnostic> = definedExternally,
    projectReferences: js.array.ReadonlyArray<ProjectReference> = definedExternally,
): BuilderProgram
