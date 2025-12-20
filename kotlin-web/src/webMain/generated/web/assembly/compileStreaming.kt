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
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/compileStreaming_static)
 */
@JsQualifier("WebAssembly")
@JsName("compileStreaming")
external fun compileStreamingAsync(
    source: Response,
    options: WebAssemblyCompileOptions? = definedExternally,
): Promise<Module>

suspend inline fun compileStreaming(
    source: Response,
): Module {
    return compileStreamingAsync(
        source = source,
    ).await()
}

suspend inline fun compileStreaming(
    source: Response,
    options: WebAssemblyCompileOptions?,
): Module {
    return compileStreamingAsync(
        source = source,
        options = options,
    ).await()
}

@JsQualifier("WebAssembly")
@JsName("compileStreaming")
external fun compileStreamingAsync(
    source: PromiseLike<Response>,
    options: WebAssemblyCompileOptions? = definedExternally,
): Promise<Module>

suspend inline fun compileStreaming(
    source: PromiseLike<Response>,
): Module {
    return compileStreamingAsync(
        source = source,
    ).await()
}

suspend inline fun compileStreaming(
    source: PromiseLike<Response>,
    options: WebAssemblyCompileOptions?,
): Module {
    return compileStreamingAsync(
        source = source,
        options = options,
    ).await()
}
