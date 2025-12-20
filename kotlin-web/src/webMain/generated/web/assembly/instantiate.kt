// Automatically generated - do not modify!

package web.assembly

import js.buffer.BufferSource
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/Reference/JavaScript_interface/instantiate_static)
 */
@JsQualifier("WebAssembly")
@JsName("instantiate")
external fun instantiateAsync(
    bytes: BufferSource,
    importObject: Imports = definedExternally,
    options: WebAssemblyCompileOptions? = definedExternally,
): Promise<WebAssemblyInstantiatedSource>

suspend inline fun instantiate(
    bytes: BufferSource,
): WebAssemblyInstantiatedSource {
    return instantiateAsync(
        bytes = bytes,
    ).await()
}

suspend inline fun instantiate(
    bytes: BufferSource,
    importObject: Imports,
): WebAssemblyInstantiatedSource {
    return instantiateAsync(
        bytes = bytes,
        importObject = importObject,
    ).await()
}

suspend inline fun instantiate(
    bytes: BufferSource,
    importObject: Imports,
    options: WebAssemblyCompileOptions?,
): WebAssemblyInstantiatedSource {
    return instantiateAsync(
        bytes = bytes,
        importObject = importObject,
        options = options,
    ).await()
}

@JsQualifier("WebAssembly")
@JsName("instantiate")
external fun instantiateAsync(
    moduleObject: Module,
    importObject: Imports = definedExternally,
): Promise<Instance>

suspend inline fun instantiate(
    moduleObject: Module,
): Instance {
    return instantiateAsync(
        moduleObject = moduleObject,
    ).await()
}

suspend inline fun instantiate(
    moduleObject: Module,
    importObject: Imports,
): Instance {
    return instantiateAsync(
        moduleObject = moduleObject,
        importObject = importObject,
    ).await()
}
