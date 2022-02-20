package kotlinx.js

external class WeakMap<in K : Any, out V>(
    entries: ReadonlyArray<JsPair<K, V>>? = definedExternally,
) {
    fun delete(key: K): Boolean
    operator fun get(key: K): V?
    fun has(key: K): Boolean
    operator fun set(key: K, value: @UnsafeVariance V): WeakMap<K, V>
}
