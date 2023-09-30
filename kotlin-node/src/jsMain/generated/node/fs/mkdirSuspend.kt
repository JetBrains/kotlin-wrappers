package node.fs

import js.promise.await


suspend fun mkdir(path: PathLike, options: MkdirRecursiveAsyncOptions): String? =
    mkdirAsync(
        path, options
    ).await()


suspend fun mkdir(path: PathLike, options: Mode? = undefined.unsafeCast<Nothing>()): Unit =
    mkdirAsync(
        path, options
    ).await()


suspend fun mkdir(path: PathLike, options: (MkdirAsyncOptions)? = undefined.unsafeCast<Nothing>()): Unit =
    mkdirAsync(
        path, options
    ).await()


suspend fun mkdir(path: PathLike, options: MakeDirectoryOptions? = undefined.unsafeCast<Nothing>()): String? =
    mkdirAsync(
        path, options
    ).await()
