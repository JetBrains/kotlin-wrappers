@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.editcontext

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface UnderlineStyle {
    companion object
}

@ExperimentalWebApi
inline val UnderlineStyle.Companion.none: UnderlineStyle
    get() = unsafeCast("none")

@ExperimentalWebApi
inline val UnderlineStyle.Companion.solid: UnderlineStyle
    get() = unsafeCast("solid")

@ExperimentalWebApi
inline val UnderlineStyle.Companion.dotted: UnderlineStyle
    get() = unsafeCast("dotted")

@ExperimentalWebApi
inline val UnderlineStyle.Companion.dashed: UnderlineStyle
    get() = unsafeCast("dashed")

@ExperimentalWebApi
inline val UnderlineStyle.Companion.wavy: UnderlineStyle
    get() = unsafeCast("wavy")
