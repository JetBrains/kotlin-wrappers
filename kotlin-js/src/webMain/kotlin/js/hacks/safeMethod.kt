package js.hacks

import js.reflect.internal.getMethodOrNull
import js.symbol.Symbol
import kotlin.js.JsAny

// TODO: remove after KT-83425 is fixed
internal fun <C : JsAny, R : JsAny?> C.safeMethod(
    propertyKey: Symbol,
): () -> R =
    getMethodOrNull(propertyKey)!!
