package node.fs

import js.promise.Promise

/**
 * Returns `true` if the path exists, `false` otherwise.
 */
fun existsAsync(
    path: PathLike,
): Promise<Boolean> =
    accessAsync(path)
        .then { true }
        .catch { false }
