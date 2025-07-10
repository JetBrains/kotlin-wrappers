package web.abort.internal

import js.objects.unsafeJso
import web.abort.AbortSignal
import web.abort.Abortable

fun <T : Abortable> createAbortable(
    signal: AbortSignal?,
): T =
    unsafeJso {
        this.signal = signal
    }
