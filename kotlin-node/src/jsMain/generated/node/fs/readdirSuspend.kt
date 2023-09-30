package node.fs

import js.promise.await


suspend fun readdir(
    path: PathLike,
    options: (ReaddirAsyncOptions)? = undefined.unsafeCast<Nothing>(),
): js.core.ReadonlyArray<String> =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(
    path: PathLike,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): js.core.ReadonlyArray<String> =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(path: PathLike, options: ReaddirBufferAsyncOptions): js.core.ReadonlyArray<node.buffer.Buffer> =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(path: PathLike, options: String /* 'buffer' */): js.core.ReadonlyArray<node.buffer.Buffer> =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(
    path: PathLike,
    options: (ReaddirAsyncOptions)? = undefined.unsafeCast<Nothing>(),
): Any /* string[] | Buffer[] */ =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(
    path: PathLike,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): Any /* string[] | Buffer[] */ =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(path: PathLike, options: ReaddirWithFileTypesAsyncOptions): js.core.ReadonlyArray<Dirent> =
    readdirAsync(
        path, options
    ).await()
