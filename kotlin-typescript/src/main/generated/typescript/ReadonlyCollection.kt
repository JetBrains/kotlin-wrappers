// Automatically generated - do not modify!

package typescript

import kotlinx.js.JsIterator

/** Common read methods for ES6 Map/Set. */
sealed external interface ReadonlyCollection<K> {
    val size: Int
    fun has(key: K): Boolean
    fun keys(): JsIterator<K>
}
