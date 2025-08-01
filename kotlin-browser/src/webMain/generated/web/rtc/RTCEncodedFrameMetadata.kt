// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.core.JsUInt
import js.objects.JsPlainObject

@JsPlainObject
external interface RTCEncodedFrameMetadata {
    var contributingSources: ReadonlyArray<JsUInt>?
    var mimeType: String?
    var payloadType: Short /* unsigned byte */?
    var rtpTimestamp: Int?
    var synchronizationSource: Int?
}
