package web.abort.internal

import js.objects.unsafeJso
import web.abort.AbortController
import web.abort.AbortSignal
import web.abort.Abortable

fun <T : Abortable> createAbortable(
    signal: AbortSignal?,
): T =
    unsafeJso {
        this.signal = signal
    }

fun <T : Abortable> createAbortable(
    controller: AbortController,
): T =
    createAbortable(signal = controller.signal)
