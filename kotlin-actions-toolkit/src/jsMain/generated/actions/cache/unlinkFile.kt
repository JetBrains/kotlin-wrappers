// Automatically generated - do not modify!

package actions.cache

import kotlinx.coroutines.await

suspend fun unlinkFile(
    filePath: node.fs.PathLike,
) {
    unlinkFileAsync(
        filePath = filePath,
    ).await()
}
