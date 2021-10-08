@file:Suppress("NOTHING_TO_INLINE")

package kotlinext.js

inline fun <T : Any> jso(): T =
    js("({})")

inline fun <T : Any> jsObject(): T =
    jso()

inline fun <T : Any> jso(builder: T.() -> Unit): T =
    jso<T>().apply(builder)

inline fun <T : Any> jsObject(builder: T.() -> Unit): T =
    jso<T>().apply(builder)

inline fun js(builder: dynamic.() -> Unit): dynamic = jso(builder)

fun <T : Any> clone(obj: T) = Object.assign(jso(), obj)

inline fun <T : Any> assign(obj: T, builder: T.() -> Unit) = clone(obj).apply(builder)

fun toPlainObjectStripNull(obj: Any) = js {
    for (key in Object.keys(obj)) {
        val value = obj.asDynamic()[key]
        if (value != null) this[key] = value
    }
}

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/delete
external fun delete(p: dynamic): Boolean = definedExternally
