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
open external class Worklet<M : WorkletModule>
private constructor() {
    /**
     * The **`addModule()`** method of the Worklet interface loads the module in the given JavaScript file and adds it to the current `Worklet`.
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

    @JsName("addModule")
    fun addModuleAsync(
        module: M,
        options: WorkletOptions = definedExternally,
    ): Promise<Void>
}

/**
 * The **`addModule()`** method of the Worklet interface loads the module in the given JavaScript file and adds it to the current `Worklet`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet/addModule)
 */
suspend inline fun <M : WorkletModule> Worklet<M>.addModule(
    moduleURL: String,
    options: WorkletOptions,
) {
    addModuleAsync(
        moduleURL = moduleURL,
        options = options,
    ).await()
}

/**
 * The **`addModule()`** method of the Worklet interface loads the module in the given JavaScript file and adds it to the current `Worklet`.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet/addModule)
 */
suspend inline fun <M : WorkletModule> Worklet<M>.addModule(
    moduleURL: String,
) {
    addModuleAsync(
        moduleURL = moduleURL,
    ).await()
}

suspend inline fun <M : WorkletModule> Worklet<M>.addModule(
    moduleURL: URL,
    options: WorkletOptions,
) {
    addModuleAsync(
        moduleURL = moduleURL,
        options = options,
    ).await()
}

suspend inline fun <M : WorkletModule> Worklet<M>.addModule(
    moduleURL: URL,
) {
    addModuleAsync(
        moduleURL = moduleURL,
    ).await()
}

suspend inline fun <M : WorkletModule> Worklet<M>.addModule(
    module: M,
    options: WorkletOptions,
) {
    addModuleAsync(
        module = module,
        options = options,
    ).await()
}

suspend inline fun <M : WorkletModule> Worklet<M>.addModule(
    module: M,
) {
    addModuleAsync(
        module = module,
    ).await()
}
