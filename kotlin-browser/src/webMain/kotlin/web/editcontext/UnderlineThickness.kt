@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.editcontext

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface UnderlineThickness {
    companion object
}

@ExperimentalWebApi
inline val UnderlineThickness.Companion.none: UnderlineThickness
    get() = unsafeCast("none")

@ExperimentalWebApi
inline val UnderlineThickness.Companion.thin: UnderlineThickness
    get() = unsafeCast("thin")

@ExperimentalWebApi
inline val UnderlineThickness.Companion.thick: UnderlineThickness
    get() = unsafeCast("thick")
