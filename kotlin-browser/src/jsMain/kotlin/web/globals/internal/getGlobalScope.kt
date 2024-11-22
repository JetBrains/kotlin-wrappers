package web.globals.internal

import js.globals.GlobalScope
import js.globals.globalThis
import js.reflect.unsafeCast
import kotlin.reflect.cast

internal fun <S : GlobalScope> getGlobalScope(
    scopeClassName: String,
): S {
    val jsClass = globalThis[scopeClassName]
        ?: error("Class `$scopeClassName` not found!")

    val kotlinClass = unsafeCast<JsClass<S>>(jsClass).kotlin
    return kotlinClass.cast(globalThis)
}
