// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import web.http.Response
import kotlin.js.Promise

external fun compileStreaming(
    source: Response,
): Promise<Module>

external fun compileStreaming(
    source: Promise<Response>,
): Promise<Module>
