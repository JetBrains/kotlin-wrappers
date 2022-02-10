@file:Suppress("NOTHING_TO_INLINE")

package kotlinext.js

@Deprecated(
    message = "Will be removed soon!",
    replaceWith = ReplaceWith("kotlinx.js.jso")
)
inline fun <T : Any> jso(): T =
    kotlinx.js.jso()

@Deprecated(
    message = "Will be removed soon!",
    replaceWith = ReplaceWith("kotlinx.js.jso")
)
inline fun <T : Any> jso(builder: T.() -> Unit): T =
    kotlinx.js.jso(builder)

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

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/delete
external fun delete(p: dynamic): Boolean = definedExternally
