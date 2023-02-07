// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun opendir(
    path: PathLike,
): Dir =
    opendirAsync(
        path = path,
    ).await()

suspend fun opendir(
    path: PathLike,
    options: OpenDirOptions,
): Dir =
    opendirAsync(
        path = path,
        options = options,
    ).await()
