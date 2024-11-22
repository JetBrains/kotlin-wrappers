package web.audio

import web.worklets.WorkletHandle
import web.worklets.internal.createWorklet

fun audioWorklet(
    block: (self: AudioWorkletGlobalScope) -> Unit,
): WorkletHandle =
    createWorklet("AudioWorkletGlobalScope", block)
