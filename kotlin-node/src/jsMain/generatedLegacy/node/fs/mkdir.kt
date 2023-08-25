// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun mkdir(
    path: PathLike,
): String =
    mkdirAsync(
        path = path,
    ).await()

suspend fun mkdir(
    path: PathLike,
    options: Any?, /* Mode | MakeDirectoryOptions */
): String =
    mkdirAsync(
        path = path,
        options = options,
    ).await()
