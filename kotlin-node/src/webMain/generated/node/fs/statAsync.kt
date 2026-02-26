// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

/**
 * @since v10.0.0
 * @return Fulfills with the {fs.Stats} object for the given `path`.
 */
@JsName("stat")
external fun statAsync(
    path: PathLike,
    opts: StatSimpleOpts = definedExternally,
): js.promise.Promise<Stats>

@JsName("stat")
external fun statAsync(
    path: PathLike,
    opts: StatBigIntOpts,
): js.promise.Promise<BigIntStats>

@JsName("stat")
external fun statAsync(
    path: PathLike,
    opts: StatOptions = definedExternally,
): js.promise.Promise<Any /* Stats | BigIntStats */>

@JsName("stat")
external fun statAsync(path: PathLike): js.promise.Promise<Stats>
