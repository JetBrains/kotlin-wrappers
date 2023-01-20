@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import js.core.Record
import web.abort.AbortSignal
import web.http.ResponseInit
import kotlin.js.Promise


external class DeferredData {
    var pendingKeysSet: Any? /* some expression */
    var controller: Any? /* some expression */
    var abortPromise: Any? /* some expression */
    var unlistenAbortSignal: Any? /* some expression */
    var subscribers: Any? /* some expression */
    var data: Record<String, Any>
    var init: ResponseInit?
    var deferredKeys: Array<String>

    constructor (data: Record<String, Any>, responseInit: ResponseInit = definedExternally)

    var trackPromise: Any? /* some expression */
    var onSettle: Any? /* some expression */
    var emit: Any? /* some expression */
    fun subscribe(fn: (aborted: Boolean, settledKey: String) -> Unit): () -> Boolean
    fun cancel(): Unit
    fun resolveData(signal: AbortSignal): Promise<Boolean>
    /* get done(): boolean; */
    /* get unwrappedData(): {}; */
    /* get pendingKeys(): string[]; */
}

