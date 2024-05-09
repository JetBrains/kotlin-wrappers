// Automatically generated - do not modify!

package actions.io

import js.array.ReadonlyArray

suspend fun findInPath(
    tool: String,
): ReadonlyArray<String> =
    findInPathAsync(
        tool = tool,
    ).await()
