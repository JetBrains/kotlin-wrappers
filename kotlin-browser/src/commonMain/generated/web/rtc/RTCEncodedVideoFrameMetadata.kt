// Automatically generated - do not modify!

package web.rtc

import js.array.ReadonlyArray
import js.core.JsLong
import js.core.JsUInt
import js.objects.JsPlainObject

@JsPlainObject
external interface RTCEncodedVideoFrameMetadata {
    val contributingSources: ReadonlyArray<JsUInt>?
    val dependencies: ReadonlyArray<JsUInt /* JsULong */>?
    val frameId: JsLong?
    val height: Short?
    val payloadType: Short /* unsigned byte */?
    val spatialIndex: Int?
    val synchronizationSource: Int?
    val temporalIndex: Int?
    val timestamp: JsLong?
    val width: Short?
}
