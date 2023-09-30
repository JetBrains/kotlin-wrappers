package node.fs

import js.promise.await


suspend fun utimes(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit =
    utimesAsync(
        path, atime, mtime
    ).await()
