package web.css.painting

import web.worklets.WorkletModule
import web.worklets.internal.createWorkletModule

external interface PaintWorkletModule :
    WorkletModule

fun PaintWorkletModule(
    block: (self: PaintWorkletGlobalScope) -> Unit,
): PaintWorkletModule =
    createWorkletModule(
        scopeClassName = "PaintWorkletGlobalScope",
        block = block,
    )
