package js.reflect.internal

import js.objects.PropertyKey
import js.reflect.Reflect
import kotlin.js.JsAny
import kotlin.js.unsafeCast

private external interface FunctionWithoutContext<C : JsAny, R : JsAny?> {
    fun bind(thisArg: C): () -> R
}

internal fun <C : JsAny, R : JsAny?> C.getMethodOrNull(
    propertyKey: PropertyKey,
): (() -> R)? {
    val function = Reflect.get(this, propertyKey)
        ?: return null

    return function
        .unsafeCast<FunctionWithoutContext<C, R>>()
        .bind(this)
}
