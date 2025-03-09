// Automatically generated - do not modify!

package web.rtc

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventTarget
import web.streams.ReadableStream
import web.streams.WritableStream

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer)
 */
external class RTCRtpScriptTransformer
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/options)
     */
    val options: Any?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/readable)
     */
    val readable: ReadableStream<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/writable)
     */
    val writable: WritableStream<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/generateKeyFrame)
     */
    @JsAsync
    suspend fun generateKeyFrame(rid: String = definedExternally): Number

    @JsName("generateKeyFrame")
    fun generateKeyFrameAsync(rid: String = definedExternally): Promise<Number>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/sendKeyFrameRequest)
     */
    @JsAsync
    suspend fun sendKeyFrameRequest()

    @JsName("sendKeyFrameRequest")
    fun sendKeyFrameRequestAsync(): Promise<Void>
}
