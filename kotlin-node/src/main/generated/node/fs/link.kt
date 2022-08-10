// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun link(
    existingPath: PathLike,
    newPath: PathLike,
) {
    linkAsync(
        existingPath = existingPath,
        newPath = newPath,
    ).await()
}
