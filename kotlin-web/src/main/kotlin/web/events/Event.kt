package web.events

import js.core.HighResTimeStamp
import js.core.ReadonlyArray

external interface EventInit {
    var bubbles: Boolean?
    var cancelable: Boolean?
    var composed: Boolean?
}

open external class Event(
    type: EventType<Event>,
    init: EventInit = definedExternally,
) {
    val type: EventType<Event>
    open val target: EventTarget?
    val currentTarget: EventTarget?
    val eventPhase: Short
    val bubbles: Boolean
    val cancelable: Boolean
    val defaultPrevented: Boolean
    val composed: Boolean
    val isTrusted: Boolean
    val timeStamp: HighResTimeStamp
    fun composedPath(): ReadonlyArray<EventTarget>
    fun stopPropagation()
    fun stopImmediatePropagation()
    fun preventDefault()

    companion object {
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
        val CAPTURING_PHASE: Short
        val NONE: Short
    }
}
