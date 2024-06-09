// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface RTCEncodedVideoFrameMetadata {
    var contributingSources: ReadonlyArray<Number>?
    var dependencies: ReadonlyArray<Number>?
    var frameId: JsLong?
    var height: Short?
    var payloadType: Short /* unsigned byte */?
    var spatialIndex: Int?
    var synchronizationSource: Int?
    var temporalIndex: Int?
    var timestamp: JsLong?
    var width: Short?
}
