// Automatically generated - do not modify!

package react.dom.events

import js.core.HighResTimeStamp

external interface BaseSyntheticEvent<out E : Any, out C : Any, out T : Any> {
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
    val type: String
}
