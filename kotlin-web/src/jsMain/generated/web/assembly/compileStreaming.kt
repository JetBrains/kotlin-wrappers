// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.promise.Promise
import js.promise.PromiseLike
import seskar.js.JsAsync
import web.http.Response

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/compileStreaming_static)
 */
@JsAsync
external suspend fun compileStreaming(
    source: Response,
): Module

@JsName("compileStreaming")
external fun compileStreamingAsync(
    source: Response,
): Promise<Module>

@JsAsync
external suspend fun compileStreaming(
    source: PromiseLike<Response>,
): Module

@JsName("compileStreaming")
external fun compileStreamingAsync(
    source: PromiseLike<Response>,
): Promise<Module>
