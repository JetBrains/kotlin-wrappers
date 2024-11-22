package web.worklets

import js.globals.globalThis
import js.reflect.unsafeCast

fun <S : WorkletGlobalScope> worklet(
    block: (self: S) -> Unit,
): WorkletHandle {
    val self: S = unsafeCast(globalThis as WorkletGlobalScope)
    block(self)
    return unsafeCast("Missed plugin integration! Worklet handle should be generated!")
}
