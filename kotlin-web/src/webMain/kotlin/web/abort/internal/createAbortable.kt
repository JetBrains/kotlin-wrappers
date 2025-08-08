package web.abort.internal

import js.internal.InternalApi
import js.objects.unsafeJso
import web.abort.AbortController
import web.abort.AbortSignal
import web.abort.Abortable

@InternalApi
fun <T : Abortable> createAbortable(
    signal: AbortSignal?,
): T =
    unsafeJso {
        this.signal = signal
    }

@InternalApi
fun <T : Abortable> createAbortable(
    controller: AbortController,
): T =
    createAbortable(signal = controller.signal)
