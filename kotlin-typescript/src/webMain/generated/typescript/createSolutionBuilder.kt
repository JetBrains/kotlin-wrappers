// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.proto.BuildOptions

external fun <T : BuilderProgram> createSolutionBuilder(
    host: SolutionBuilderHost<T>,
    rootNames: js.array.ReadonlyArray<String>,
    defaultOptions: BuildOptions,
): SolutionBuilder<T>
