// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.core.Int53
import js.core.JsUInt53
import js.core.UInt53
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface RTCEncodedVideoFrameMetadata :
    RTCEncodedFrameMetadata {
    var dependencies: ReadonlyArray<JsUInt53>?
    var frameId: UInt53?
    var height: Short?
    var spatialIndex: Int?
    var temporalIndex: Int?
    var timestamp: Int53?
    var width: Short?
}
