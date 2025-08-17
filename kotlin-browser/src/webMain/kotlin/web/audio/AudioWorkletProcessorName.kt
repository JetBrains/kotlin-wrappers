package web.audio

import js.reflect.unsafeCast

sealed external interface AudioWorkletProcessorName

inline fun AudioWorkletProcessorName(
    value: String,
): AudioWorkletProcessorName =
    unsafeCast(value)
