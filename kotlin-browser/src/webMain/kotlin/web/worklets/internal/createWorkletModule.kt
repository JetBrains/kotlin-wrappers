package web.worklets.internal

import js.globals.internal.getGlobalScope
import js.objects.unsafeJso
import web.worklets.WorkletGlobalScope
import web.worklets.WorkletModule

internal fun <M : WorkletModule, S : WorkletGlobalScope> createWorkletModule(
    scopeClassName: String,
    block: (self: S) -> Unit,
): M {
    val self: S = getGlobalScope(scopeClassName)

    block(self)

    return unsafeJso()
}
