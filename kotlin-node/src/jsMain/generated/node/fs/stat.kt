// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun stat(
    path: PathLike,
): Any /* Stats | BigIntStats */ =
    statAsync(
        path = path,
    ).await()

suspend fun stat(
    path: PathLike,
    opts: StatOptions,
): Any /* Stats | BigIntStats */ =
    statAsync(
        path = path,
        opts = opts,
    ).await()
