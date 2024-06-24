// Automatically generated - do not modify!

package typescript

sealed external interface ModeAwareCache<T> {
    fun get(key: String, mode: ResolutionMode): T?
    fun set(key: String, mode: ResolutionMode, value: T): Unit /* this */
    fun delete(key: String, mode: ResolutionMode): Unit /* this */
    fun has(key: String, mode: ResolutionMode): Boolean
    fun forEach(cb: (elem: T, key: String, mode: ResolutionMode) -> Unit): Unit
    fun size(): Double
}
