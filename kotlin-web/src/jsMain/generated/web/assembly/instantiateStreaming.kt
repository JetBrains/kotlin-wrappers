// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.promise.Promise
import js.promise.PromiseLike
import seskar.js.JsAsync
import web.http.Response

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/instantiateStreaming_static)
 */
@JsAsync
external suspend fun instantiateStreaming(
    source: Response,
    importObject: Imports = definedExternally,
): WebAssemblyInstantiatedSource

@JsName("instantiateStreaming")
external fun instantiateStreamingAsync(
    source: Response,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

@JsAsync
external suspend fun instantiateStreaming(
    source: PromiseLike<Response>,
    importObject: Imports = definedExternally,
): WebAssemblyInstantiatedSource

@JsName("instantiateStreaming")
external fun instantiateStreamingAsync(
    source: PromiseLike<Response>,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>
