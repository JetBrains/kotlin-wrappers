package web.abort.internal

import js.objects.JsPlainObject
import js.objects.unsafeJso
import web.abort.AbortSignal
import web.abort.Abortable

internal fun createAbortable(
    signal: AbortSignal?,
): Abortable =
    unsafeJso<MutableAbortable> {
        this.signal = signal
    }

@JsPlainObject
private external interface MutableAbortable :
    Abortable {
    override var signal: AbortSignal?
}
