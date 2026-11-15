// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.proto.BuildOptions
import typescript.sync.WatchOptions

external fun <T : BuilderProgram> createSolutionBuilderWithWatch(
    host: SolutionBuilderWithWatchHost<T>,
    rootNames: js.array.ReadonlyArray<String>,
    defaultOptions: BuildOptions,
    baseWatchOptions: WatchOptions = definedExternally,
): SolutionBuilder<T>
