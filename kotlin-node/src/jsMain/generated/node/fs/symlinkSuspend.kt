package node.fs

import js.promise.await


suspend fun symlink(target: PathLike, path: PathLike, type: String? = undefined.unsafeCast<Nothing>()): Unit =
    symlinkAsync(
        target, path, type
    ).await()
