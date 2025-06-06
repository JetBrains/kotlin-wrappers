// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.import.JsQualifier
import js.promise.Promise
import js.promise.PromiseLike
import seskar.js.JsAsync
import web.http.Response
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/instantiateStreaming_static)
 */
@JsAsync
@Suppress("WRONG_EXTERNAL_DECLARATION")
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
@Suppress("WRONG_EXTERNAL_DECLARATION")
external suspend fun instantiateStreaming(
    source: PromiseLike<Response>,
    importObject: Imports = definedExternally,
): WebAssemblyInstantiatedSource

@JsName("instantiateStreaming")
external fun instantiateStreamingAsync(
    source: PromiseLike<Response>,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>
