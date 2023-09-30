package node.fs

import js.promise.await


suspend fun opendir(path: PathLike, options: OpenDirOptions = undefined.unsafeCast<Nothing>()): Dir =
    opendirAsync(
        path, options
    ).await()
