// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.buffer.BufferSource
import js.promise.Promise
import seskar.js.JsAsync

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/instantiate_static)
 */
@JsAsync
external suspend fun instantiate(
    bytes: BufferSource,
    importObject: Imports = definedExternally,
): WebAssemblyInstantiatedSource

@JsName("instantiate")
external fun instantiateAsync(
    bytes: BufferSource,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

@JsAsync
external suspend fun instantiate(
    moduleObject: Module,
    importObject: Imports = definedExternally,
): Instance

@JsName("instantiate")
external fun instantiateAsync(
    moduleObject: Module,
    importObject: Imports = definedExternally,
): Promise<Instance>
