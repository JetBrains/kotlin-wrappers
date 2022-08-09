// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import kotlin.js.Promise

/**
 * Asynchronous realpath(3) - return the canonicalized absolute pathname.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
@JsName("realpath")
external fun realpathAsync(
    path: PathLike,
    options: dynamic /* ObjectEncodingOptions | BufferEncoding */ = definedExternally,
): Promise<dynamic /* string | Buffer */>
