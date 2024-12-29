// Automatically generated - do not modify!

package typescript

/** Parsed command line for build */
sealed external interface ParsedBuildCommand {
    var buildOptions: BuildOptions
    var watchOptions: WatchOptions?
    var projects: js.array.ReadonlyArray<String>
    var errors: js.array.ReadonlyArray<Diagnostic>
}
