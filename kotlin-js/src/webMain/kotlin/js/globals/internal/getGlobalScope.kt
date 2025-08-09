package js.globals.internal

import js.core.JsPrimitives.toJsString
import js.globals.GlobalScope
import js.globals.globalThis
import js.internal.InternalApi
import js.reflect.JsClass
import js.reflect.cast
import js.reflect.unsafeCast

@InternalApi
fun <S : GlobalScope> getGlobalScope(
    scopeClassName: String,
): S {
    val jsClass = unsafeCast<JsClass<S>>(
        globalThis[scopeClassName.toJsString()]
            ?: error("Class `$scopeClassName` not found!")
    )

    return jsClass.cast(globalThis)
}
