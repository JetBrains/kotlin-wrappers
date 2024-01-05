@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.core

import js.objects.JsoDsl

inline fun <T : Any> jso(): T =
    js("({})")

inline fun <T : Any> jso(
    block: @JsoDsl T.() -> Unit,
): T =
    jso<T>().apply(block)
