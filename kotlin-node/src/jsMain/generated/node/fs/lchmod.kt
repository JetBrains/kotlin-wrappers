// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun lchmod(
    path: PathLike,
    mode: Mode,
) {
    lchmodAsync(
        path = path,
        mode = mode,
    ).await()
}
