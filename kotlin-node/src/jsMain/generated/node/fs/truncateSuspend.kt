package node.fs

import js.promise.await


suspend fun truncate(path: PathLike, len: Number = undefined.unsafeCast<Nothing>()): Unit =
    truncateAsync(
        path, len
    ).await()
