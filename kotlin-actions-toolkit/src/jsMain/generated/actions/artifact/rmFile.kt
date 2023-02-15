// Automatically generated - do not modify!

package actions.artifact

import kotlinx.coroutines.await

suspend fun rmFile(
    filePath: String,
) {
    rmFileAsync(
        filePath = filePath,
    ).await()
}
