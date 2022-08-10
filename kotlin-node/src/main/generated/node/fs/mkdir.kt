// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun mkdir(
    path: PathLike,
    options: Any?, /* Mode | MakeDirectoryOptions */
): String =
    mkdirAsync(
        path = path,
        options = options,
    ).await()
