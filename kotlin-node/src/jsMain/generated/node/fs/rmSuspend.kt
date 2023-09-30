package node.fs

import js.promise.await


suspend fun rm(path: PathLike, options: RmOptions = undefined.unsafeCast<Nothing>()): Unit =
    rmAsync(
        path, options
    ).await()
