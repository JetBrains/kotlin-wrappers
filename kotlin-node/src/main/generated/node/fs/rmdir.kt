// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun rmdir(
    path: PathLike,
    options: RmDirOptions,
) {
    rmdirAsync(
        path = path,
        options = options,
    ).await()
}
