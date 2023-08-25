// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

/**
 * Synchronous statfs(2). Returns information about the mounted file system which contains path. The callback gets two arguments (err, stats) where stats is an <fs.StatFs> object.
 * In case of an error, the err.code will be one of Common System Errors.
 * @param path A path to an existing file or directory on the file system to be queried.
 * @param callback
 */
external fun statfsSync(
    path: PathLike,
    options: StatFsOptions = definedExternally,
): Any /* StatsFs | BigIntStatsFs */
