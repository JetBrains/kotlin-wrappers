package js.hacks

import js.reflect.internal.getMethodOrNull
import js.symbol.Symbol

// TODO: remove after KT-83425 is fixed
internal fun <C : JsAny, R : JsAny?> C.safeCall(
    propertyKey: Symbol,
): R =
    getMethodOrNull<C, R>(propertyKey)!!()
