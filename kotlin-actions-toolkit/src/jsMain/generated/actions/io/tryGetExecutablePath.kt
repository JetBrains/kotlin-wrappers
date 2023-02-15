// Automatically generated - do not modify!

package actions.io

import js.core.ReadonlyArray
import kotlinx.coroutines.await

suspend fun tryGetExecutablePath(
    filePath: String,
    extensions: ReadonlyArray<String>,
): String =
    tryGetExecutablePathAsync(
        filePath = filePath,
        extensions = extensions,
    ).await()
