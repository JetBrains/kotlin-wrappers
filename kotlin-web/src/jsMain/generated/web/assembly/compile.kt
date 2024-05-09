// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.buffer.BufferSource
import js.promise.Promise

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/compile_static)
 */
external suspend fun compile(
    bytes: BufferSource,
): Module

@JsName("compile")
external fun compileAsync(
    bytes: BufferSource,
): Promise<Module>
