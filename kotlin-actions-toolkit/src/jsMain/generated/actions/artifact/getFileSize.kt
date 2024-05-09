// Automatically generated - do not modify!

package actions.artifact
suspend fun getFileSize(
    filePath: String,
): Number =
    getFileSizeAsync(
        filePath = filePath,
    ).await()
