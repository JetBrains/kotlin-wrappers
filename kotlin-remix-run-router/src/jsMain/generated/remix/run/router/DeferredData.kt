@file:JsModule("@remix-run/router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import web.abort.AbortSignal
import web.http.ResponseInit
import kotlin.js.Promise


external class DeferredData {
    var data: js.core.ReadonlyRecord<String, Any>
    var init: ResponseInit?
    var deferredKeys: js.core.ReadonlyArray<String>

    constructor (data: js.core.ReadonlyRecord<String, Any>, responseInit: ResponseInit = definedExternally)

    fun subscribe(fn: (aborted: Boolean, settledKey: String? /* use undefined for default */) -> Unit): () -> Boolean
    fun cancel(): Unit
    fun resolveData(signal: AbortSignal): Promise<Boolean>

    val done: Boolean


    val unwrappedData: Any


    val pendingKeys: js.core.ReadonlyArray<String>

}
