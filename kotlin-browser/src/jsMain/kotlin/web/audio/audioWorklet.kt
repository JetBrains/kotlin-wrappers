package web.audio

import web.worklets.internal.createWorklet

fun audioWorklet(
    block: (self: AudioWorkletGlobalScope) -> Unit,
): AudioWorkletHandle =
    createWorklet("AudioWorkletGlobalScope", block)
