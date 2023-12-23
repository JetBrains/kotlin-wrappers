// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.promise.Promise
import js.promise.PromiseLike
import web.http.Response

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/instantiateStreaming_static)
 */
external fun instantiateStreaming(
    source: Response,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

external fun instantiateStreaming(
    source: PromiseLike<Response>,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>
