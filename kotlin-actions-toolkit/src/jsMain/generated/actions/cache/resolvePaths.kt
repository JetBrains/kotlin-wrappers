// Automatically generated - do not modify!

package actions.cache

import js.array.ReadonlyArray

suspend fun resolvePaths(
    patterns: ReadonlyArray<String>,
): ReadonlyArray<String> =
    resolvePathsAsync(
        patterns = patterns,
    ).await()
