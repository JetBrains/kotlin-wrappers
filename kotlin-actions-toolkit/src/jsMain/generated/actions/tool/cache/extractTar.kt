// Automatically generated - do not modify!

package actions.tool.cache

import js.array.ReadonlyArray

suspend fun extractTar(
    file: String,
): String =
    extractTarAsync(
        file = file,
    ).await()

suspend fun extractTar(
    file: String,
    dest: String,
): String =
    extractTarAsync(
        file = file,
        dest = dest,
    ).await()

suspend fun extractTar(
    file: String,
    dest: String,
    flags: ReadonlyArray<String>,
): String =
    extractTarAsync(
        file = file,
        dest = dest,
        flags = flags,
    ).await()
