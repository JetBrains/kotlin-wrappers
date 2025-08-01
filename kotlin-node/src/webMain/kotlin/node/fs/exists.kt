package node.fs

import js.promise.await

/**
 * Returns `true` if the path exists, `false` otherwise.
 */
suspend fun exists(
    path: PathLike,
): Boolean =
    existsAsync(
        path = path,
    ).await()
