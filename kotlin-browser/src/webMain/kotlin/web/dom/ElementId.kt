package web.dom

import js.reflect.unsafeCast
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS

sealed external interface ElementId {
    @JsAlias(THIS)
    fun asString(): String
}

inline fun ElementId(
    value: String,
): ElementId =
    unsafeCast(value)
