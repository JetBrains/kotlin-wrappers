// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.core.Int53
import js.core.JsUInt
import js.core.JsUInt53
import js.core.UInt53
import js.objects.JsPlainObject

@JsPlainObject
external interface RTCEncodedVideoFrameMetadata {
    val contributingSources: ReadonlyArray<JsUInt>?
    val dependencies: ReadonlyArray<JsUInt53>?
    val frameId: UInt53?
    val height: Short?
    val payloadType: Short /* unsigned byte */?
    val spatialIndex: Int?
    val synchronizationSource: Int?
    val temporalIndex: Int?
    val timestamp: Int53?
    val width: Short?
}
