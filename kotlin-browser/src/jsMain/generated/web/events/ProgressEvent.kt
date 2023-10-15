// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.events

import js.core.JsLong

external interface ProgressEventInit : EventInit {
    var lengthComputable: Boolean?
    var loaded: JsLong?
    var total: JsLong?
}

/**
 * Events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an <img>, <audio>, <video>, <style> or <link>).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent)
 */
open external class ProgressEvent<out T : EventTarget>(
    override val type: EventType<ProgressEvent<T>>,
    init: ProgressEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/lengthComputable) */
    val lengthComputable: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/loaded) */
    val loaded: JsLong
    override val target: T?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/total) */
    val total: JsLong

    companion object
}
