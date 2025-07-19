// Automatically generated - do not modify!

package web.worklets

import js.core.Void
import js.promise.Promise
import js.promise.await
import web.url.URL
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`Worklet`** interface is a lightweight version of Web Workers and gives developers access to low-level parts of the rendering pipeline.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet)
 */
open external class Worklet
private constructor() {
    /**
     * The **`addModule()`** method of the adds it to the current `Worklet`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet/addModule)
     */
    @JsName("addModule")
    fun addModuleAsync(
        moduleURL: String,
        options: WorkletOptions = definedExternally,
    ): Promise<Void>

    @JsName("addModule")
    fun addModuleAsync(
        moduleURL: URL,
        options: WorkletOptions = definedExternally,
    ): Promise<Void>
}

/**
 * The **`addModule()`** method of the adds it to the current `Worklet`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet/addModule)
 */
suspend inline fun Worklet.addModule(
    moduleURL: String,
    options: WorkletOptions,
) {
    addModuleAsync(
        moduleURL = moduleURL,
        options = options,
    ).await()
}

/**
 * The **`addModule()`** method of the adds it to the current `Worklet`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet/addModule)
 */
suspend inline fun Worklet.addModule(
    moduleURL: String,
) {
    addModuleAsync(
        moduleURL = moduleURL,
    ).await()
}

suspend inline fun Worklet.addModule(
    moduleURL: URL,
    options: WorkletOptions,
) {
    addModuleAsync(
        moduleURL = moduleURL,
        options = options,
    ).await()
}

suspend inline fun Worklet.addModule(
    moduleURL: URL,
) {
    addModuleAsync(
        moduleURL = moduleURL,
    ).await()
}
