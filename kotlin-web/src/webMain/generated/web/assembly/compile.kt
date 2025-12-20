// Automatically generated - do not modify!

package web.assembly

import js.buffer.BufferSource
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/compile_static)
 */
@JsQualifier("WebAssembly")
@JsName("compile")
external fun compileAsync(
    bytes: BufferSource,
    options: WebAssemblyCompileOptions? = definedExternally,
): Promise<Module>

suspend inline fun compile(
    bytes: BufferSource,
): Module {
    return compileAsync(
        bytes = bytes,
    ).await()
}

suspend inline fun compile(
    bytes: BufferSource,
    options: WebAssemblyCompileOptions?,
): Module {
    return compileAsync(
        bytes = bytes,
        options = options,
    ).await()
}
