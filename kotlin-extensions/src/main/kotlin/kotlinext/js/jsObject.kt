@file:Suppress("NOTHING_TO_INLINE")

package kotlinext.js

@Deprecated(
    message = "Legacy alias of `jso`. Will be removed soon!",
)
inline fun <T : Any> jsObject(): T =
    jso()

@Deprecated(
    message = "Legacy alias of `jso`. Will be removed soon!",
)
inline fun <T : Any> jsObject(builder: T.() -> Unit): T =
    jso(builder)
