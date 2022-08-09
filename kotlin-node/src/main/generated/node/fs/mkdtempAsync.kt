// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import kotlin.js.Promise

/**
 * Asynchronously creates a unique temporary directory.
 * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
 * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
 */
@JsName("mkdtemp")
external fun mkdtempAsync(
    prefix: String,
    options: dynamic /* ObjectEncodingOptions | BufferEncoding */ = definedExternally,
): Promise<dynamic /* string | Buffer */>
