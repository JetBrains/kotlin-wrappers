package web.abort

import web.events.Event
import web.events.EventTarget

sealed external class AbortSignal : EventTarget {
    val aborted: Boolean
    var onabort: ((event: Event) -> Unit)?
}
