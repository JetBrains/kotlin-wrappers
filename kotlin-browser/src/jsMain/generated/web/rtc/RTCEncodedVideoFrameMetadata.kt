// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.core.JsLong
import js.objects.JsPlainObject

@JsPlainObject
external interface RTCEncodedVideoFrameMetadata {
    val contributingSources: ReadonlyArray<Number>?
    val dependencies: ReadonlyArray<Number>?
    val frameId: JsLong?
    val height: UShort?
    val payloadType: UByte?
    val spatialIndex: UInt?
    val synchronizationSource: UInt?
    val temporalIndex: UInt?
    val timestamp: JsLong?
    val width: UShort?
}
