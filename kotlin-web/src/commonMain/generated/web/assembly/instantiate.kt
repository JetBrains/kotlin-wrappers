// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package web.assembly

import js.buffer.BufferSource
import js.import.JsQualifier
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/instantiate_static)
 */
@JsName("instantiate")
external fun instantiateAsync(
    bytes: BufferSource,
    importObject: Imports = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun instantiate(
    bytes: BufferSource,
    importObject: Imports,
): WebAssemblyInstantiatedSource {
    return instantiateAsync(
        bytes = bytes,
        importObject = importObject
    ).await()
}

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun instantiate(
    bytes: BufferSource,
): WebAssemblyInstantiatedSource {
    return instantiateAsync(bytes = bytes).await()
}

@JsName("instantiate")
external fun instantiateAsync(
    moduleObject: Module,
    importObject: Imports = definedExternally,
): Promise<Instance>

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun instantiate(
    moduleObject: Module,
    importObject: Imports,
): Instance {
    return instantiateAsync(
        moduleObject = moduleObject,
        importObject = importObject
    ).await()
}

@Suppress("NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE")
suspend inline fun instantiate(
    moduleObject: Module,
): Instance {
    return instantiateAsync(moduleObject = moduleObject).await()
}
