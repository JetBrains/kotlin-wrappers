package web.worklets.internal

import js.reflect.unsafeCast
import web.globals.internal.getGlobalScope
import web.worklets.WorkletGlobalScope
import web.worklets.WorkletHandle

internal fun <S : WorkletGlobalScope> createWorklet(
    scopeClassName: String,
    block: (self: S) -> Unit,
): WorkletHandle {
    val self: S = getGlobalScope(scopeClassName)
    block(self)
    return unsafeCast("Missed plugin integration! Worklet handle should be generated!")
}
