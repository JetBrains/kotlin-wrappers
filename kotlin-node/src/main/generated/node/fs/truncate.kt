// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun truncate(
    path: PathLike,
    len: Number,
) {
    truncateAsync(
        path = path,
        len = len,
    ).await()
}
