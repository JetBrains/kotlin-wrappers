// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun rmdir(
    path: PathLike,
) {
    rmdirAsync(
        path = path,
    ).await()
}

suspend fun rmdir(
    path: PathLike,
    options: RmDirOptions,
) {
    rmdirAsync(
        path = path,
        options = options,
    ).await()
}
