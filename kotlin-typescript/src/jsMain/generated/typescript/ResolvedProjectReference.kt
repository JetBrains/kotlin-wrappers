// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface ResolvedProjectReference {
    var commandLine: ParsedCommandLine
    var sourceFile: SourceFile
    var references: ReadonlyArray<ResolvedProjectReference?>?
}
