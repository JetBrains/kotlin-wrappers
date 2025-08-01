// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * @since v10.0.0
 * @return Fulfills with the {fs.Stats} object for the given `path`.
 */
@JsName("stat")
external fun statAsync(
    path: PathLike,
    opts: StatSimpleOpts = definedExternally,
): Promise<Stats>

@JsName("stat")
external fun statAsync(
    path: PathLike,
    opts: StatBigIntOpts,
): Promise<BigIntStats>

@JsName("stat")
external fun statAsync(path: PathLike, opts: StatOptions = definedExternally): Promise<Any /* Stats | BigIntStats */>

@JsName("stat")
external fun statAsync(path: PathLike): Promise<Stats>
