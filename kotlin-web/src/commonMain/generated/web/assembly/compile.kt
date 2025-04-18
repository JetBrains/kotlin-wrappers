// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.buffer.BufferSource
import js.import.JsQualifier
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/compile_static)
 */
@JsAsync
@Suppress("WRONG_EXTERNAL_DECLARATION")
external suspend fun compile(
    bytes: BufferSource,
): Module

@JsName("compile")
external fun compileAsync(
    bytes: BufferSource,
): Promise<Module>
