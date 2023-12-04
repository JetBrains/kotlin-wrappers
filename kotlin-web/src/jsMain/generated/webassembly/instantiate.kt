// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.buffer.BufferSource
import js.promise.Promise

/** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/instantiate_static) */
external fun instantiate(
    bytes: BufferSource,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

external fun instantiate(
    moduleObject: Module,
    importObject: Imports = definedExternally,
): Promise<Instance>
