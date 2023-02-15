// Automatically generated - do not modify!

package actions.artifact

import kotlinx.coroutines.await

suspend fun getFileSize(
    filePath: String,
): Number =
    getFileSizeAsync(
        filePath = filePath,
    ).await()
