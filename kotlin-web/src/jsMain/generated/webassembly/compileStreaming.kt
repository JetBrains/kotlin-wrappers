// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.promise.Promise
import js.promise.PromiseLike
import web.http.Response

/** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/compileStreaming_static) */
external fun compileStreaming(
    source: Response,
): Promise<Module>

external fun compileStreaming(
    source: PromiseLike<Response>,
): Promise<Module>
