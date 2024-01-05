// Automatically generated - do not modify!

package actions.tool.cache

import js.array.ReadonlyArray
import js.promise.await

suspend fun extractXar(
    file: String,
): String =
    extractXarAsync(
        file = file,
    ).await()

suspend fun extractXar(
    file: String,
    dest: String,
): String =
    extractXarAsync(
        file = file,
        dest = dest,
    ).await()

suspend fun extractXar(
    file: String,
    dest: String,
    flags: ReadonlyArray<String>,
): String =
    extractXarAsync(
        file = file,
        dest = dest,
        flags = flags,
    ).await()
