// Automatically generated - do not modify!

package typescript

import typescript.proto.BuildOptions
import typescript.sync.Diagnostic
import typescript.sync.WatchOptions

/** Parsed command line for build */
@kotlinx.js.JsPlainObject
external interface ParsedBuildCommand {
    var buildOptions: BuildOptions
    var watchOptions: WatchOptions?
    var projects: js.array.ReadonlyArray<String>
    var errors: js.array.ReadonlyArray<Diagnostic>
}
