package web.abort.internal

import js.array.jsArrayOf
import web.abort.AbortSignal

internal infix fun AbortSignal?.or(
    signal: AbortSignal,
): AbortSignal =
    if (this != null) {
        AbortSignal.any(jsArrayOf(this, signal))
    } else {
        signal
    }
