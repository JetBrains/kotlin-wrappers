// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.promise.Promise
import js.promise.PromiseLike
import js.promise.await
import web.http.Response
import kotlin.js.JsName
import kotlin.js.JsQualifier

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/compileStreaming_static)
 */
@JsName("compileStreaming")
external fun compileStreamingAsync(
    source: Response,
): Promise<Module>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun compileStreaming(
    source: Response,
): Module {
    return compileStreamingAsync(
        source = source,
    ).await()
}

@JsName("compileStreaming")
external fun compileStreamingAsync(
    source: PromiseLike<Response>,
): Promise<Module>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun compileStreaming(
    source: PromiseLike<Response>,
): Module {
    return compileStreamingAsync(
        source = source,
    ).await()
}
