package kotlinext.js

import js.objects.Object
import js.objects.jso

inline fun js(builder: dynamic.() -> Unit): dynamic =
    jso(builder)

fun <T : Any> clone(obj: T) = Object.assign(jso(), obj)

inline fun <T : Any> assign(obj: T, builder: T.() -> Unit) = clone(obj).apply(builder)

fun toPlainObjectStripNull(obj: Any) = js {
    for (key in Object.keys(obj)) {
        val value = obj.asDynamic()[key]
        if (value != null) this[key] = value
    }
}
