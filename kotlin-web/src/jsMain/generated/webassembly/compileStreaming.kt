// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.promise.Promise
import web.http.Response

external fun compileStreaming(
    source: Response,
): Promise<Module>

external fun compileStreaming(
    source: Promise<Response>,
): Promise<Module>
