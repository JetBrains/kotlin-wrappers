// Automatically generated - do not modify!

package node.fs

@seskar.js.JsAsync
external suspend fun lstat(
    path: PathLike,
    opts: LstatOpts = definedExternally,
): Stats

@seskar.js.JsAsync
external suspend fun lstat(
    path: PathLike,
    opts: LstatBigIntOpts,
): BigIntStats

@seskar.js.JsAsync
external suspend fun lstat(path: PathLike, opts: StatOptions = definedExternally): Any // Stats | BigIntStats

@seskar.js.JsAsync
external suspend fun lstat(path: PathLike): Stats
