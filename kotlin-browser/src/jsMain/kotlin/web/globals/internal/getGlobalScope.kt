package web.globals.internal

import js.globals.GlobalScope
import js.globals.globalThis
import js.internal.InternalApi
import js.reflect.cast
import js.reflect.unsafeCast

@InternalApi
internal fun <S : GlobalScope> getGlobalScope(
    scopeClassName: String,
): S {
    val jsClass = unsafeCast<JsClass<S>>(
        globalThis[scopeClassName]
            ?: error("Class `$scopeClassName` not found!")
    )

    return jsClass.cast(globalThis)
}
