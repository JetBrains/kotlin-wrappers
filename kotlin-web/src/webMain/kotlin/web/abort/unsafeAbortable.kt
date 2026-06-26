package web.abort

import js.objects.Object
import js.objects.unsafeJso

// TODO: remove after KT-76286
fun <T : Abortable> unsafeAbortable(
    signal: AbortSignal?,
): T =
    unsafeJso {
        this.signal = signal
    }

// TODO: remove after KT-76286
fun <T : Abortable> unsafeAbortable(
    options: T?,
    signal: AbortSignal,
): T =
    Object.assign(
        unsafeJso(),
        options,
        unsafeAbortable(options?.signal or signal),
    )

// TODO: remove after KT-76286
fun <T : Abortable> unsafeAbortable(
    controller: AbortController,
): T =
    unsafeAbortable(signal = controller.signal)
