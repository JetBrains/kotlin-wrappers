@file:Suppress("NOTHING_TO_INLINE")

package kotlinext.js

import kotlinx.js.Object

inline fun js(builder: dynamic.() -> Unit): dynamic =
    kotlinx.js.jso(builder)

fun <T : Any> clone(obj: T) = Object.assign(kotlinx.js.jso(), obj)

inline fun <T : Any> assign(obj: T, builder: T.() -> Unit) = clone(obj).apply(builder)

fun toPlainObjectStripNull(obj: Any) = js {
    for (key in Object.keys(obj)) {
        val value = obj.asDynamic()[key]
        if (value != null) this[key] = value
    }
}
