// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.buffer.BufferSource
import js.promise.Promise
import seskar.js.JsAsync

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/compile_static)
 */
@JsAsync
external suspend fun compile(
    bytes: BufferSource,
): Module

@JsName("compile")
external fun compileAsync(
    bytes: BufferSource,
): Promise<Module>
