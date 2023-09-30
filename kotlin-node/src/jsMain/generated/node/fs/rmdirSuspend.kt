package node.fs

import js.promise.await


suspend fun rmdir(path: PathLike, options: RmDirOptions = undefined.unsafeCast<Nothing>()): Unit =
    rmdirAsync(
        path, options
    ).await()
