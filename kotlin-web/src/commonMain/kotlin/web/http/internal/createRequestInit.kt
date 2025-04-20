package web.http.internal

import js.objects.JsPlainObject
import js.objects.unsafeJso
import web.abort.AbortSignal
import web.http.RequestInit

internal fun createRequestInit(
    signal: AbortSignal?,
): RequestInit =
    unsafeJso<MutableRequestInit> {
        this.signal = signal
    }

@JsPlainObject
private external interface MutableRequestInit :
    RequestInit {
    override var signal: AbortSignal?
}
