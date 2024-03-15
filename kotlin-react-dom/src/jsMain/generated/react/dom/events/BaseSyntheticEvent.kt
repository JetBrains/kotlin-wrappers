// Automatically generated - do not modify!

package react.dom.events

import web.events.Event
import web.events.EventTarget
import web.events.EventType
import web.time.DOMHighResTimeStamp

external interface BaseSyntheticEvent<out E : Event, out C : EventTarget, out T : EventTarget> {
    val nativeEvent: E
    val currentTarget: C
    val target: T
    val bubbles: Boolean
    val cancelable: Boolean
    val defaultPrevented: Boolean
    val eventPhase: Int
    val isTrusted: Boolean
    fun preventDefault()
    fun isDefaultPrevented(): Boolean
    fun stopPropagation()
    fun isPropagationStopped(): Boolean
    fun persist()
    val timeStamp: DOMHighResTimeStamp
    val type: EventType<E, EventTarget>
}
