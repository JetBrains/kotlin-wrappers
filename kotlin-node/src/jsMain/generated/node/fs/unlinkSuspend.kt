package node.fs

import js.promise.await


suspend fun unlink(path: PathLike): Unit =
    unlinkAsync(
        path
    ).await()
