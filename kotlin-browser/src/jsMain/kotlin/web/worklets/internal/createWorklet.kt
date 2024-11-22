package web.worklets.internal

import js.module.ModuleHandle
import js.reflect.unsafeCast
import web.globals.internal.getGlobalScope
import web.worklets.WorkletGlobalScope

internal fun <S : WorkletGlobalScope, H : ModuleHandle> createWorklet(
    scopeClassName: String,
    block: (self: S) -> Unit,
): H {
    val self: S = getGlobalScope(scopeClassName)
    block(self)
    return unsafeCast("Missed plugin integration! Worklet handle should be generated!")
}
