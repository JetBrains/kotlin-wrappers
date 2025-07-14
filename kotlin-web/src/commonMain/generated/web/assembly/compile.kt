// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.buffer.BufferSource
import js.import.JsQualifier
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/compile_static)
 */
@JsName("compile")
external fun compileAsync(
    bytes: BufferSource,
): Promise<Module>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun compile(
    bytes: BufferSource,
): Module {
    return compileAsync(bytes = bytes).await()
}
