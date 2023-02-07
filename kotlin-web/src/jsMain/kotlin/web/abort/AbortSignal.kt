package web.abort

import web.events.Event
import web.events.EventTarget

sealed external class AbortSignal : EventTarget {
    val aborted: Boolean
    var onabort: ((event: Event) -> Unit)?
    val reason: Any?
    fun throwIfAborted()

    companion object {
        fun abort(
            reason: Any? = definedExternally,
        ): AbortSignal

        fun timeout(
            ms: Int,
        ): AbortSignal
    }
}
