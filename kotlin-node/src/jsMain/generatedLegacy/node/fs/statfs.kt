// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun statfs(
    path: PathLike,
): Any /* StatsFs | BigIntStatsFs */ =
    statfsAsync(
        path = path,
    ).await()

suspend fun statfs(
    path: PathLike,
    opts: StatFsOptions,
): Any /* StatsFs | BigIntStatsFs */ =
    statfsAsync(
        path = path,
        opts = opts,
    ).await()
