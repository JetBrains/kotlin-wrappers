package web.worklets.internal

import js.globals.internal.getGlobalScope
import js.internal.InternalApi
import js.objects.unsafeJso
import web.worklets.WorkletGlobalScope
import web.worklets.WorkletModule

@InternalApi
internal fun <M : WorkletModule, S : WorkletGlobalScope> createWorkletModule(
    scopeClassName: String,
    block: (self: S) -> Unit,
): M {
    val self: S = getGlobalScope(scopeClassName)

    block(self)

    return unsafeJso()
}
