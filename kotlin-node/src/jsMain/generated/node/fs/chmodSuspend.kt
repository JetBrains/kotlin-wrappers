package node.fs

import js.promise.await


suspend fun chmod(path: PathLike, mode: Mode): Unit =
    chmodAsync(
        path, mode
    ).await()
