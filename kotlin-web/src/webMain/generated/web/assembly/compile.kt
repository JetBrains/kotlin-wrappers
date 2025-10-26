// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

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
@JsName("compile")
external fun compileAsync(
    bytes: BufferSource,
    options: WebAssemblyCompileOptions? = definedExternally,
): Promise<Module>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun compile(
    bytes: BufferSource,
): Module {
    return compileAsync(
        bytes = bytes,
    ).await()
}

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun compile(
    bytes: BufferSource,
    options: WebAssemblyCompileOptions?,
): Module {
    return compileAsync(
        bytes = bytes,
        options = options,
    ).await()
}
