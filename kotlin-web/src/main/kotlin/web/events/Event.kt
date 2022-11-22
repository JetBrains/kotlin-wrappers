package web.events

import kotlinx.js.HighResTimeStamp
import kotlinx.js.ReadonlyArray

external interface EventInit {
    var bubbles: Boolean?
    var cancelable: Boolean?
    var composed: Boolean?
}

open external class Event(
    type: String,
    init: EventInit = definedExternally,
) {
    val type: String
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
