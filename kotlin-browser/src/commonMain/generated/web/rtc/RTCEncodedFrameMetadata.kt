// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.core.JsUInt
import js.objects.JsPlainObject

@JsPlainObject
external interface RTCEncodedFrameMetadata {
    val contributingSources: ReadonlyArray<JsUInt>?
    val mimeType: String?
    val payloadType: Short /* unsigned byte */?
    val rtpTimestamp: Int?
    val synchronizationSource: Int?
}
