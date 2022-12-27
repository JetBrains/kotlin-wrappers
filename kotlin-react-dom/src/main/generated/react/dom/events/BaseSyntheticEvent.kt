// Automatically generated - do not modify!

package react.dom.events

import js.core.HighResTimeStamp
import web.events.Event
import web.events.EventType

external interface BaseSyntheticEvent<out E : Event, out C : Any, out T : Any> {
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
    val timeStamp: HighResTimeStamp
    val type: EventType<E>
}
