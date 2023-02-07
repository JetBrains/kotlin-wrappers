// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun rename(
    oldPath: PathLike,
    newPath: PathLike,
) {
    renameAsync(
        oldPath = oldPath,
        newPath = newPath,
    ).await()
}
