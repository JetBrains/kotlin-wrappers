package node.fs

import kotlinx.coroutines.await

/**
 * Returns `true` if the path exists, `false` otherwise.
 */
suspend fun exists(
    path: PathLike,
): Boolean =
    existsAsync(
        path = path,
    ).await()
