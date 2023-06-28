// Automatically generated - do not modify!

package actions.artifact

import js.promise.await

suspend fun getFileSize(
    filePath: String,
): Number =
    getFileSizeAsync(
        filePath = filePath,
    ).await()
