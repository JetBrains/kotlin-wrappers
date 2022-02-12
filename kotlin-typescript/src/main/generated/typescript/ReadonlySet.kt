// Automatically generated - do not modify!

@file:Suppress(
    "PARAMETER_NAME_CHANGED_ON_OVERRIDE",
    "DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES",
)

package typescript

import kotlinx.js.JsIterator
import kotlinx.js.JsPair

/** ES6 Set interface, only read methods included. */
sealed external interface ReadonlySet<T> : ReadonlyCollection<T> {
    override fun has(value: T): Boolean
    fun values(): JsIterator<T>
    fun entries(): JsIterator<JsPair<T, T>>
    fun forEach(action: (value: T, key: T) -> Unit)
}
