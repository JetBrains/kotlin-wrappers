package node.fs

import js.promise.await


suspend fun rename(oldPath: PathLike, newPath: PathLike): Unit =
    renameAsync(
        oldPath, newPath
    ).await()
