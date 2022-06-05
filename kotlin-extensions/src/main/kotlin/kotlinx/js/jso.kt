@file:Suppress("NOTHING_TO_INLINE")

package kotlinx.js

inline fun <T : Any> jso(): T =
    js("({})")

inline fun <T : Any> jso(
    block: @JsoDsl T.() -> Unit,
): T =
    jso<T>().apply(block)
