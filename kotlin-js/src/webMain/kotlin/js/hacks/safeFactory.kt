package js.hacks

import js.reflect.Reflect
import js.symbol.Symbol
import kotlin.js.JsAny
import kotlin.js.unsafeCast

private external interface SafeFactory<C : JsAny, R : JsAny?> {
    fun bind(thisArg: C): () -> R
}

// TODO: remove after KT-83425 is fixed
internal fun <C : JsAny, R : JsAny?> C.safeFactory(
    propertyKey: Symbol,
): () -> R =
    Reflect.get(this, propertyKey)!!
        .unsafeCast<SafeFactory<C, R>>()
        .bind(this)
