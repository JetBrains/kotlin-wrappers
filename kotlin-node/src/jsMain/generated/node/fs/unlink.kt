// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun unlink(
    path: PathLike,
) {
    unlinkAsync(
        path = path,
    ).await()
}
