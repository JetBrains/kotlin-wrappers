package web.css.painting

import web.experimental.ExperimentalWebApi
import web.worklets.WorkletModule
import web.worklets.internal.createWorkletModule

@ExperimentalWebApi
external interface PaintWorkletModule :
    WorkletModule

@ExperimentalWebApi
fun PaintWorkletModule(
    block: (self: PaintWorkletGlobalScope) -> Unit,
): PaintWorkletModule =
    createWorkletModule(
        scopeClassName = "PaintWorkletGlobalScope",
        block = block,
    )
