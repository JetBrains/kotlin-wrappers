package web.audio

import web.worklets.WorkletModule
import web.worklets.internal.createWorkletModule

sealed /* final */
external interface AudioWorkletModule :
    WorkletModule

fun AudioWorkletModule(
    block: (self: AudioWorkletGlobalScope) -> Unit,
): AudioWorkletModule =
    createWorkletModule(
        scopeClassName = "AudioWorkletGlobalScope",
        block = block,
    )
