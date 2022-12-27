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

open external class ProgressEvent<T : EventTarget>(
    override val type: EventType<ProgressEvent<T>>,
    init: ProgressEventInit = definedExternally,
) : Event {
    val lengthComputable: Boolean
    val loaded: JsLong
    override val target: T?
    val total: JsLong

    companion object
}
