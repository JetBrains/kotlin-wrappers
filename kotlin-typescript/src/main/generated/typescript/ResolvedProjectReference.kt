// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface ResolvedProjectReference {
    var commandLine: ParsedCommandLine
    var sourceFile: SourceFile
    var references: ReadonlyArray<ResolvedProjectReference?>?
}
