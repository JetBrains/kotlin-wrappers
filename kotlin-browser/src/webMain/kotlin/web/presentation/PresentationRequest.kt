package web.presentation

import js.array.ReadonlyArray
import js.core.JsString
import js.promise.Promise
import js.promise.await
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationRequest)
 */
@ExperimentalWebApi
open external class PresentationRequest(
    url: String,
) : EventTarget {
    constructor(urls: ReadonlyArray<JsString>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationRequest/start)
     */
    @JsName("start")
    fun startAsync(): Promise<PresentationConnection>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationRequest/reconnect)
     */
    @JsName("reconnect")
    fun reconnectAsync(presentationId: String): Promise<PresentationConnection>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationRequest/getAvailability)
     */
    @JsName("getAvailability")
    fun getAvailabilityAsync(): Promise<PresentationAvailability>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationRequest/onconnectionavailable)
     */
    var onconnectionavailable: EventHandler<PresentationConnectionAvailableEvent, PresentationRequest, PresentationRequest>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Presentation/defaultRequest)
     */
    var defaultRequest: PresentationRequest?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Presentation/receiver)
     */
    val receiver: PresentationRequest?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationRequest/start)
 */
@ExperimentalWebApi
suspend inline fun PresentationRequest.start(): PresentationConnection {
    return startAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationRequest/reconnect)
 */
@ExperimentalWebApi
suspend inline fun PresentationRequest.reconnect(presentationId: String): PresentationConnection {
    return reconnectAsync(presentationId).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationRequest/getAvailability)
 */
@ExperimentalWebApi
suspend inline fun PresentationRequest.getAvailability(): PresentationAvailability {
    return getAvailabilityAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationRequest/connectionavailable_event)
 */
@ExperimentalWebApi
inline val <C : PresentationRequest> C.connectionAvailableEvent: EventInstance<PresentationConnectionAvailableEvent, C, C>
    get() = EventInstance(this, "connectionavailable")
