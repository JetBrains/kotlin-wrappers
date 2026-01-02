package js.hacks

import js.function.getMethodOrNull
import js.symbol.Symbol
import kotlin.js.JsAny

// TODO: remove after KT-83425 is fixed
internal fun <C : JsAny, R : JsAny?> C.safeFactory(
    propertyKey: Symbol,
): () -> R =
    getMethodOrNull(propertyKey)!!
