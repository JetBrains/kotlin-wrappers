// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun open(
    path: PathLike,
): FileHandle =
    openAsync(
        path = path,
    ).await()

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
