// Automatically generated - do not modify!

package react.dom

external interface BaseSyntheticEvent<E : Any, C : Any, T : Any> {
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
    val timeStamp: Double
    val type: String
}
