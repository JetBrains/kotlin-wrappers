package kotlinx.js

external interface ReadonlyRecord<in K : Any, out V : Any>

inline operator fun <K : Any, V : Any> ReadonlyRecord<K, V>.get(
    key: K,
): V? =
    asDynamic()[key]
