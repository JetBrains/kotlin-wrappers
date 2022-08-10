// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun rm(
    path: PathLike,
    options: RmOptions,
) {
    rmAsync(
        path = path,
        options = options,
    ).await()
}
