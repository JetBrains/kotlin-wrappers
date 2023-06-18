// Automatically generated - do not modify!

package web.performance

import js.core.DOMHighResTimeStamp
import js.core.ReadonlyArray

sealed external class PerformanceResourceTiming :
    PerformanceEntry {
    val connectEnd: DOMHighResTimeStamp
    val connectStart: DOMHighResTimeStamp
    val decodedBodySize: Int
    val domainLookupEnd: DOMHighResTimeStamp
    val domainLookupStart: DOMHighResTimeStamp
    val encodedBodySize: Int
    val fetchStart: DOMHighResTimeStamp
    val initiatorType: String
    val nextHopProtocol: String
    val redirectEnd: DOMHighResTimeStamp
    val redirectStart: DOMHighResTimeStamp
    val requestStart: DOMHighResTimeStamp
    val responseEnd: DOMHighResTimeStamp
    val responseStart: DOMHighResTimeStamp
    val secureConnectionStart: DOMHighResTimeStamp
    val serverTiming: ReadonlyArray<PerformanceServerTiming>
    val transferSize: Int
    val workerStart: DOMHighResTimeStamp
    override fun toJSON(): Any
}
