// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun chmod(
    path: PathLike,
    mode: Mode,
) {
    chmodAsync(
        path = path,
        mode = mode,
    ).await()
}
