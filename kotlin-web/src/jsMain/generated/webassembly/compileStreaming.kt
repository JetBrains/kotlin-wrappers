// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.promise.Promise
import js.promise.PromiseLike
import web.http.Response

external fun compileStreaming(
    source: Response,
): Promise<Module>

external fun compileStreaming(
    source: PromiseLike<Response>,
): Promise<Module>
