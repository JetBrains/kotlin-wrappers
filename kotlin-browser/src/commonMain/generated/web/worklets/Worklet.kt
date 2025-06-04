// Automatically generated - do not modify!

package web.worklets

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
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
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun addModule(
        moduleURL: String,
        options: WorkletOptions = definedExternally,
    )

    @JsName("addModule")
    fun addModuleAsync(
        moduleURL: String,
        options: WorkletOptions = definedExternally,
    ): Promise<Void>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun addModule(
        moduleURL: URL,
        options: WorkletOptions = definedExternally,
    )

    @JsName("addModule")
    fun addModuleAsync(
        moduleURL: URL,
        options: WorkletOptions = definedExternally,
    ): Promise<Void>
}
