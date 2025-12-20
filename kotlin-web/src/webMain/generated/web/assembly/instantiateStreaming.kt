// Automatically generated - do not modify!

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
@JsQualifier("WebAssembly")
@JsName("instantiateStreaming")
external fun instantiateStreamingAsync(
    source: Response,
    importObject: Imports = definedExternally,
    options: WebAssemblyCompileOptions? = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

suspend inline fun instantiateStreaming(
    source: Response,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
    ).await()
}

suspend inline fun instantiateStreaming(
    source: Response,
    importObject: Imports,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
        importObject = importObject,
    ).await()
}

suspend inline fun instantiateStreaming(
    source: Response,
    importObject: Imports,
    options: WebAssemblyCompileOptions?,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
        importObject = importObject,
        options = options,
    ).await()
}

@JsQualifier("WebAssembly")
@JsName("instantiateStreaming")
external fun instantiateStreamingAsync(
    source: PromiseLike<Response>,
    importObject: Imports = definedExternally,
    options: WebAssemblyCompileOptions? = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

suspend inline fun instantiateStreaming(
    source: PromiseLike<Response>,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
    ).await()
}

suspend inline fun instantiateStreaming(
    source: PromiseLike<Response>,
    importObject: Imports,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
        importObject = importObject,
    ).await()
}

suspend inline fun instantiateStreaming(
    source: PromiseLike<Response>,
    importObject: Imports,
    options: WebAssemblyCompileOptions?,
): WebAssemblyInstantiatedSource {
    return instantiateStreamingAsync(
        source = source,
        importObject = importObject,
        options = options,
    ).await()
}
