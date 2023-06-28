// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun access(
    path: PathLike,
) {
    accessAsync(
        path = path,
    ).await()
}

suspend fun access(
    path: PathLike,
    mode: Number,
) {
    accessAsync(
        path = path,
        mode = mode,
    ).await()
}
