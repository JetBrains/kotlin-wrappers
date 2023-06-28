// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun truncate(
    path: PathLike,
) {
    truncateAsync(
        path = path,
    ).await()
}

suspend fun truncate(
    path: PathLike,
    len: Number,
) {
    truncateAsync(
        path = path,
        len = len,
    ).await()
}
