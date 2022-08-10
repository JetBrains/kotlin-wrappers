// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun open(
    path: PathLike,
    flags: Any, /* string | number */
): FileHandle =
    openAsync(
        path = path,
        flags = flags,
    ).await()

suspend fun open(
    path: PathLike,
    flags: Any, /* string | number */
    mode: Mode,
): FileHandle =
    openAsync(
        path = path,
        flags = flags,
        mode = mode,
    ).await()
