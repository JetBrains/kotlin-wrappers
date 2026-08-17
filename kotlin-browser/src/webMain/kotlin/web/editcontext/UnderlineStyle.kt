package web.editcontext

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface UnderlineStyle

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
