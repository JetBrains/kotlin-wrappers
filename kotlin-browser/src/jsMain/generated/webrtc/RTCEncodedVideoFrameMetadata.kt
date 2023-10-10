// Automatically generated - do not modify!

package webrtc

import js.core.JsLong
import js.core.ReadonlyArray

sealed external interface RTCEncodedVideoFrameMetadata {
    var contributingSources: ReadonlyArray<Number>?
    var dependencies: ReadonlyArray<Number>?
    var frameId: Number?
    var height: Double?
    var payloadType: Number?
    var spatialIndex: Number?
    var synchronizationSource: Number?
    var temporalIndex: Number?
    var timestamp: JsLong?
    var width: Double?
}
