package kotlinext.js

import kotlin.reflect.*

class ES6Map<K : Any, V> {
    private val storage = js("new Map()")

    fun size(): Int {
        return storage.size
    }

    fun containsKey(key: K): Boolean {
        return storage.has(key)
    }

    fun remove(key: K) {
        storage.delete(key)
    }

    operator fun get(key: K): V? {
        return storage.get(key)
    }

    operator fun set(key: K, v: V) {
        storage.set(key, v)
    }

    fun put(key: K, v: V) {
        storage.set(key, v)
    }

    fun forEach(handler: (K, V) -> Unit) {
        storage.forEach { v: V, k: K ->
            handler(k, v)
        }
    }
}

inline operator fun <V> ES6Map<in String, in V>.getValue(thisRef: Any?, property: KProperty<*>): V =
    @Suppress("UNCHECKED_CAST") (get(property.name) as V)

inline operator fun <V> ES6Map<in String, in V>.setValue(thisRef: Any?, property: KProperty<*>, value: V) =
    @Suppress("UNCHECKED_CAST") (put(property.name, value))
