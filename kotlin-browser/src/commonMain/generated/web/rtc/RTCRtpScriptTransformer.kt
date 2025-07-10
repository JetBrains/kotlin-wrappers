// Automatically generated - do not modify!

package web.rtc

import js.core.JsAny
import js.core.JsInt
import js.core.JsPrimitives.toInt
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.events.EventTarget
import web.streams.ReadableStream
import web.streams.WritableStream
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`RTCRtpScriptTransformer`** interface of the WebRTC API provides a worker-side Stream API interface that a WebRTC Encoded Transform can use to modify encoded media frames in the incoming and outgoing WebRTC pipelines.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer)
 */
external class RTCRtpScriptTransformer
private constructor() :
    EventTarget {
    /**
     * The **`options`** read-only property of the RTCRtpScriptTransformer interface returns the object that was (optionally) passed as the second argument during construction of the corresponding RTCRtpScriptTransform.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/options)
     */
    val options: JsAny?

    /**
     * The **`readable`** read-only property of the RTCRtpScriptTransformer interface returns a ReadableStream instance is a source for encoded media frames.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/readable)
     */
    val readable: ReadableStream<*>

    /**
     * The **`writable`** read-only property of the RTCRtpScriptTransformer interface returns a WritableStream instance that can be used as a sink for encoded media frames enqueued on the corresponding RTCRtpScriptTransformer.readable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/writable)
     */
    val writable: WritableStream<*>

    /**
     * The **`generateKeyFrame()`** method of the RTCRtpScriptTransformer interface causes a video encoder to generate a key frame.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/generateKeyFrame)
     */
    @JsName("generateKeyFrame")
    fun generateKeyFrameAsync(rid: String = definedExternally): Promise<JsInt>

    /**
     * The **`sendKeyFrameRequest()`** method of the RTCRtpScriptTransformer interface may be called by a WebRTC Encoded Transform that is processing incoming encoded video frames, in order to request a key frame from the sender.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/sendKeyFrameRequest)
     */
    @JsName("sendKeyFrameRequest")
    fun sendKeyFrameRequestAsync(): Promise<Void>
}

/**
 * The **`generateKeyFrame()`** method of the RTCRtpScriptTransformer interface causes a video encoder to generate a key frame.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/generateKeyFrame)
 */
suspend inline fun RTCRtpScriptTransformer.generateKeyFrame(rid: String): Int {
    return generateKeyFrameAsync(rid = rid).await().toInt()
}

/**
 * The **`generateKeyFrame()`** method of the RTCRtpScriptTransformer interface causes a video encoder to generate a key frame.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/generateKeyFrame)
 */
suspend inline fun RTCRtpScriptTransformer.generateKeyFrame(): Int {
    return generateKeyFrameAsync().await().toInt()
}

/**
 * The **`sendKeyFrameRequest()`** method of the RTCRtpScriptTransformer interface may be called by a WebRTC Encoded Transform that is processing incoming encoded video frames, in order to request a key frame from the sender.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/sendKeyFrameRequest)
 */
suspend inline fun RTCRtpScriptTransformer.sendKeyFrameRequest() {
    sendKeyFrameRequestAsync().await()
}
