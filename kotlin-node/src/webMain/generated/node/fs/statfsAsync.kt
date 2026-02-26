// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

/**
 * @since v19.6.0, v18.15.0
 * @return Fulfills with the {fs.StatFs} object for the given `path`.
 */
@JsName("statfs")
external fun statfsAsync(
    path: PathLike,
    opts: StatfsOpts = definedExternally,
): js.promise.Promise<StatsFs>

@JsName("statfs")
external fun statfsAsync(
    path: PathLike,
    opts: StatfsBigIntOpts,
): js.promise.Promise<BigIntStatsFs>

@JsName("statfs")
external fun statfsAsync(
    path: PathLike,
    opts: StatFsOptions = definedExternally,
): js.promise.Promise<Any /* StatsFs | BigIntStatsFs */>

@JsName("statfs")
external fun statfsAsync(path: PathLike): js.promise.Promise<StatsFs>
