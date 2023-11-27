// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.promise.Promise
import js.promise.PromiseLike
import web.http.Response

external fun instantiateStreaming(
    source: Response,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

external fun instantiateStreaming(
    source: PromiseLike<Response>,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>
