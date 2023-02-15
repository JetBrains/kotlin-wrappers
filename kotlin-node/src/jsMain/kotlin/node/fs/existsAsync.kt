package node.fs

import kotlin.js.Promise

/**
 * Returns `true` if the path exists, `false` otherwise.
 */
fun existsAsync(
    path: PathLike,
): Promise<Boolean> =
    accessAsync(path)
        .then { true }
        .catch { false }
