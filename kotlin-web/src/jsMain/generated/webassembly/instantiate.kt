// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.buffer.BufferSource
import kotlin.js.Promise

external fun instantiate(
    bytes: BufferSource,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

external fun instantiate(
    moduleObject: Module,
    importObject: Imports = definedExternally,
): Promise<Instance>
