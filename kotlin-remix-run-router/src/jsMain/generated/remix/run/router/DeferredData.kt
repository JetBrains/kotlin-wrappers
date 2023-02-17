@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router

import web.abort.AbortSignal
import web.http.ResponseInit
import kotlin.js.Promise


external class DeferredData {
    var pendingKeysSet: Any? /* type isn't declared */
    var controller: Any? /* type isn't declared */
    var abortPromise: Any? /* type isn't declared */
    var unlistenAbortSignal: Any? /* type isn't declared */
    var subscribers: Any? /* type isn't declared */
    var data: js.core.ReadonlyRecord<String, Any>
    var init: ResponseInit?
    var deferredKeys: js.core.ReadonlyArray<String>

    constructor (data: js.core.ReadonlyRecord<String, Any>, responseInit: ResponseInit = definedExternally)

    var trackPromise: Any? /* type isn't declared */
    var onSettle: Any? /* type isn't declared */
    var emit: Any? /* type isn't declared */
    fun subscribe(fn: (aborted: Boolean, settledKey: String? /* use undefined for default */) -> Unit): () -> Boolean
    fun cancel(): Unit
    fun resolveData(signal: AbortSignal): Promise<Boolean>
    /* get done(): boolean; */
    /* get unwrappedData(): {}; */
    /* get pendingKeys(): string[]; */
}

