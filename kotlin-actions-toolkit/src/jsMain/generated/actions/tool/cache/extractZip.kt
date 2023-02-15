// Automatically generated - do not modify!

package actions.tool.cache

import kotlinx.coroutines.await

suspend fun extractZip(
    file: String,
): String =
    extractZipAsync(
        file = file,
    ).await()

suspend fun extractZip(
    file: String,
    dest: String,
): String =
    extractZipAsync(
        file = file,
        dest = dest,
    ).await()
