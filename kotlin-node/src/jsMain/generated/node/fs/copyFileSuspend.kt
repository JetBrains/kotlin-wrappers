package node.fs

import js.promise.await


suspend fun copyFile(src: PathLike, dest: PathLike, mode: Number = undefined.unsafeCast<Nothing>()): Unit =
    copyFileAsync(
        src, dest, mode
    ).await()
