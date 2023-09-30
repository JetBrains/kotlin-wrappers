package node.fs

import js.promise.await


suspend fun lchmod(path: PathLike, mode: Mode): Unit =
    lchmodAsync(
        path, mode
    ).await()
