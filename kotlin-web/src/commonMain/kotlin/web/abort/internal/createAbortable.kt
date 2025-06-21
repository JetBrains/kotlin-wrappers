package web.abort.internal

import js.objects.unsafeJso
import web.abort.AbortSignal
import web.abort.Abortable

internal fun createAbortable(
    signal: AbortSignal?,
): Abortable =
    unsafeJso {
        this.signal = signal
    }
