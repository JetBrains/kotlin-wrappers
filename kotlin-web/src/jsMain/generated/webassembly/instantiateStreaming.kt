// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import web.http.Response
import kotlin.js.Promise

external fun instantiateStreaming(
    source: Response,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

external fun instantiateStreaming(
    source: Promise<Response>,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>
