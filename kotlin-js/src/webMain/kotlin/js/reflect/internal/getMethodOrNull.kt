package js.function

import js.internal.InternalApi
import js.reflect.Reflect
import js.symbol.Symbol
import kotlin.js.JsAny
import kotlin.js.unsafeCast

private external interface FunctionWithoutContext<C : JsAny, R : JsAny?> {
    fun bind(thisArg: C): () -> R
}

@InternalApi
fun <C : JsAny, R : JsAny?> C.getMethodOrNull(
    propertyKey: Symbol,
): (() -> R)? {
    val function = Reflect.get(this, propertyKey)
        ?: return null

    return function
        .unsafeCast<FunctionWithoutContext<C, R>>()
        .bind(this)
}
