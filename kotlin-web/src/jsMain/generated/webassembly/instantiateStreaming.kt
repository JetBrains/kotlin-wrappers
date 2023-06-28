// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.promise.Promise
import web.http.Response

external fun instantiateStreaming(
    source: Response,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

external fun instantiateStreaming(
    source: Promise<Response>,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>
