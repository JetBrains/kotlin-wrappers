package web.svg

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RepeatCount

inline val RepeatCount.Companion.indefinite: RepeatCount
    get() = unsafeCast("indefinite")

fun RepeatCount(value: Double): RepeatCount =
    unsafeCast(value)
