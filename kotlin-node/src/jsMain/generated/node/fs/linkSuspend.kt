package node.fs

import js.promise.await


suspend fun link(existingPath: PathLike, newPath: PathLike): Unit =
    linkAsync(
        existingPath, newPath
    ).await()
