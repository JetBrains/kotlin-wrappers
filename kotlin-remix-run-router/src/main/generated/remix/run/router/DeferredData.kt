@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import js.core.Record
import web.abort.AbortSignal
import kotlin.js.Promise


external class DeferredData {
    var pendingKeys: Any? /* some expression */
    var controller: Any? /* some expression */
    var abortPromise: Any? /* some expression */
    var unlistenAbortSignal: Any? /* some expression */
    var subscriber: Any? /* some expression */
    var data: Record<String, Any>

    constructor (data: Record<String, Any>)

    var trackPromise: Any? /* some expression */
    var onSettle: Any? /* some expression */
    fun subscribe(fn: (aborted: Boolean) -> Unit): Unit
    fun cancel(): Unit
    fun resolveData(signal: AbortSignal): Promise<Boolean>
    /* get done(): boolean; */
    /* get unwrappedData(): {}; */
}

