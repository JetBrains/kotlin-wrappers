// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.promise.Promise
import js.promise.PromiseLike
import js.promise.await
import web.http.Response
import kotlin.js.JsName
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/instantiateStreaming_static)
 */
@JsName("instantiateStreaming")
external fun instantiateStreamingAsync(
    source: Response,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun instantiateStreaming(
    source: Response,
    importObject: Imports,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
        importObject = importObject,
    ).await()
}

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun instantiateStreaming(
    source: Response,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
    ).await()
}

@JsName("instantiateStreaming")
external fun instantiateStreamingAsync(
    source: PromiseLike<Response>,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun instantiateStreaming(
    source: PromiseLike<Response>,
    importObject: Imports,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
        importObject = importObject,
    ).await()
}

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun instantiateStreaming(
    source: PromiseLike<Response>,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
    ).await()
}
