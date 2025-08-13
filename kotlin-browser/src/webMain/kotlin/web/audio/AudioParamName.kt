package web.audio

import js.reflect.unsafeCast

sealed external interface AudioParamName

inline fun AudioParamName(
    value: String,
): AudioParamName =
    unsafeCast(value)
