package node.fs

import js.promise.await


suspend fun stat(path: PathLike, opts: StatSimpleOpts = undefined.unsafeCast<Nothing>()): Stats =
    statAsync(
        path, opts
    ).await()


suspend fun stat(path: PathLike, opts: StatBigIntOpts): BigIntStats =
    statAsync(
        path, opts
    ).await()


suspend fun stat(path: PathLike, opts: StatOptions = undefined.unsafeCast<Nothing>()): Any /* Stats | BigIntStats */ =
    statAsync(
        path, opts
    ).await()
