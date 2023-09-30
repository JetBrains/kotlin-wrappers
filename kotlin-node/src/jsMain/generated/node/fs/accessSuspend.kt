package node.fs

import js.promise.await


suspend fun access(path: PathLike, mode: Number = undefined.unsafeCast<Nothing>()): Unit =
    accessAsync(
        path, mode
    ).await()
