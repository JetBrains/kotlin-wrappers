// Automatically generated - do not modify!

package web.performance

import js.array.ReadonlyArray
import js.core.UInt53
import web.time.DOMHighResTimeStamp
import kotlin.js.JsAny

/**
 * The **`PerformanceResourceTiming`** interface enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, <SVG>, image, or script.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming)
 */
open external class PerformanceResourceTiming
private constructor() :
    PerformanceEntry {
    /**
     * The **`connectEnd`** read-only property returns the timestamp immediately after the browser finishes establishing the connection to the server to retrieve the resource. The timestamp value includes the time interval to establish the transport connection, as well as other time intervals such as TLS handshake and SOCKS authentication.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/connectEnd)
     */
    val connectEnd: DOMHighResTimeStamp

    /**
     * The **`connectStart`** read-only property returns the timestamp immediately before the user agent starts establishing the connection to the server to retrieve the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/connectStart)
     */
    val connectStart: DOMHighResTimeStamp

    /**
     * The **`decodedBodySize`** read-only property returns the size (in octets) received from the fetch (HTTP or cache) of the message body after removing any applied content encoding (like gzip or Brotli). If the resource is retrieved from an application cache or local resources, it returns the size of the payload after removing any applied content encoding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/decodedBodySize)
     */
    val decodedBodySize: UInt53

    /**
     * The **`domainLookupEnd`** read-only property returns the timestamp immediately after the browser finishes the domain-name lookup for the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/domainLookupEnd)
     */
    val domainLookupEnd: DOMHighResTimeStamp

    /**
     * The **`domainLookupStart`** read-only property returns the timestamp immediately before the browser starts the domain name lookup for the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/domainLookupStart)
     */
    val domainLookupStart: DOMHighResTimeStamp

    /**
     * The **`encodedBodySize`** read-only property represents the size (in octets) received from the fetch (HTTP or cache) of the payload body before removing any applied content encodings (like gzip or Brotli). If the resource is retrieved from an application cache or a local resource, it must return the size of the payload body before removing any applied content encoding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/encodedBodySize)
     */
    val encodedBodySize: UInt53

    /**
     * The **`fetchStart`** read-only property represents a timestamp immediately before the browser starts to fetch the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/fetchStart)
     */
    val fetchStart: DOMHighResTimeStamp

    /**
     * The **`initiatorType`** read-only property is a string representing web platform feature that initiated the resource load.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/initiatorType)
     */
    val initiatorType: String

    /**
     * The **`nextHopProtocol`** read-only property is a string representing the network protocol used to fetch the resource, as identified by the ALPN Protocol ID (RFC7301).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/nextHopProtocol)
     */
    val nextHopProtocol: String

    /**
     * The **`redirectEnd`** read-only property returns a timestamp immediately after receiving the last byte of the response of the last redirect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/redirectEnd)
     */
    val redirectEnd: DOMHighResTimeStamp

    /**
     * The **`redirectStart`** read-only property returns a timestamp representing the start time of the fetch which that initiates the redirect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/redirectStart)
     */
    val redirectStart: DOMHighResTimeStamp

    /**
     * The **`requestStart`** read-only property returns a timestamp of the time immediately before the browser starts requesting the resource from the server, cache, or local resource. If the transport connection fails and the browser retries the request, the value returned will be the start of the retry request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/requestStart)
     */
    val requestStart: DOMHighResTimeStamp

    /**
     * The **`responseEnd`** read-only property returns a timestamp immediately after the browser receives the last byte of the resource or immediately before the transport connection is closed, whichever comes first.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/responseEnd)
     */
    val responseEnd: DOMHighResTimeStamp

    /**
     * The **`responseStart`** read-only property returns a timestamp immediately after the browser receives the first byte of the response from the server, cache, or local resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/responseStart)
     */
    val responseStart: DOMHighResTimeStamp

    /**
     * The **`responseStatus`** read-only property represents the HTTP response status code returned when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/responseStatus)
     */
    val responseStatus: Short

    /**
     * The **`secureConnectionStart`** read-only property returns a timestamp immediately before the browser starts the handshake process to secure the current connection. If a secure connection is not used, the property returns zero.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/secureConnectionStart)
     */
    val secureConnectionStart: DOMHighResTimeStamp

    /**
     * The **`serverTiming`** read-only property returns an array of PerformanceServerTiming entries containing server timing metrics.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/serverTiming)
     */
    val serverTiming: ReadonlyArray<PerformanceServerTiming>

    /**
     * The **`transferSize`** read-only property represents the size (in octets) of the fetched resource. The size includes the response header fields plus the response payload body (as defined by RFC7230).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/transferSize)
     */
    val transferSize: UInt53

    /**
     * The **`workerStart`** read-only property of the PerformanceResourceTiming interface returns a DOMHighResTimeStamp immediately before dispatching the FetchEvent if a Service Worker thread is already running, or immediately before starting the Service Worker thread if it is not already running. If the resource is not intercepted by a Service Worker the property will always return 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/workerStart)
     */
    val workerStart: DOMHighResTimeStamp

    /**
     * The **`toJSON()`** method of the PerformanceResourceTiming interface is a serializer; it returns a JSON representation of the PerformanceResourceTiming object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/toJSON)
     */
    override fun toJSON(): JsAny
}
