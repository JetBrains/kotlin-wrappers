// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun lstat(
    path: PathLike,
): Any /* Stats | BigIntStats */ =
    lstatAsync(
        path = path,
    ).await()

suspend fun lstat(
    path: PathLike,
    opts: StatOptions,
): Any /* Stats | BigIntStats */ =
    lstatAsync(
        path = path,
        opts = opts,
    ).await()
