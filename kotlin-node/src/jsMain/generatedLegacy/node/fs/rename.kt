// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun rename(
    oldPath: PathLike,
    newPath: PathLike,
) {
    renameAsync(
        oldPath = oldPath,
        newPath = newPath,
    ).await()
}
