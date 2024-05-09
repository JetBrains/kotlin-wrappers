package node.fs
/**
 * Returns `true` if the path exists, `false` otherwise.
 */
suspend fun exists(
    path: PathLike,
): Boolean =
    existsAsync(
        path = path,
    ).await()
