package web.editcontext

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface UnderlineThickness

@ExperimentalWebApi
inline val UnderlineThickness.Companion.none: UnderlineThickness
    get() = unsafeCast("none")

@ExperimentalWebApi
inline val UnderlineThickness.Companion.thin: UnderlineThickness
    get() = unsafeCast("thin")

@ExperimentalWebApi
inline val UnderlineThickness.Companion.thick: UnderlineThickness
    get() = unsafeCast("thick")
