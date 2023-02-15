// Automatically generated - do not modify!

package actions.artifact

import kotlinx.coroutines.await

suspend fun createGZipFileOnDisk(
    originalFilePath: String,
    tempFilePath: String,
): Number =
    createGZipFileOnDiskAsync(
        originalFilePath = originalFilePath,
        tempFilePath = tempFilePath,
    ).await()
