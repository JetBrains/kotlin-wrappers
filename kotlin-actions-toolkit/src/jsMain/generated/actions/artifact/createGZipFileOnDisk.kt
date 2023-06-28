// Automatically generated - do not modify!

package actions.artifact

import js.promise.await

suspend fun createGZipFileOnDisk(
    originalFilePath: String,
    tempFilePath: String,
): Number =
    createGZipFileOnDiskAsync(
        originalFilePath = originalFilePath,
        tempFilePath = tempFilePath,
    ).await()
