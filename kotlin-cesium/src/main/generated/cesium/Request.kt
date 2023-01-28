// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso
import kotlin.js.Promise

/**
 * Stores information for making a request. In general this does not need to be constructed directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html">Online Documentation</a>
 */
external class Request(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [url] The url to request.
     * @property [requestFunction] The function that makes the actual data request.
     * @property [cancelFunction] The function that is called when the request is cancelled.
     * @property [priorityFunction] The function that is called to update the request's priority, which occurs once per frame.
     * @property [priority] The initial priority of the request.
     *   Default value - `0.0`
     * @property [throttle] Whether to throttle and prioritize the request. If false, the request will be sent immediately. If true, the request will be throttled and sent based on priority.
     *   Default value - `false`
     * @property [throttleByServer] Whether to throttle the request by server.
     *   Default value - `false`
     * @property [type] The type of request.
     *   Default value - [RequestType.OTHER]
     */
    interface ConstructorOptions {
        var url: String?
        var requestFunction: RequestCallback?
        var cancelFunction: CancelCallback?
        var priorityFunction: PriorityCallback?
        var priority: Double?
        var throttle: Boolean?
        var throttleByServer: Boolean?
        var type: RequestType?
    }

    /**
     * The URL to request.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#url">Online Documentation</a>
     */
    var url: String

    /**
     * The function that makes the actual data request.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#requestFunction">Online Documentation</a>
     */
    var requestFunction: RequestCallback

    /**
     * The function that is called when the request is cancelled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#cancelFunction">Online Documentation</a>
     */
    var cancelFunction: CancelCallback

    /**
     * The function that is called to update the request's priority, which occurs once per frame.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#priorityFunction">Online Documentation</a>
     */
    var priorityFunction: PriorityCallback

    /**
     * Priority is a unit-less value where lower values represent higher priority.
     * For world-based objects, this is usually the distance from the camera.
     * A request that does not have a priority function defaults to a priority of 0.
     *
     * If priorityFunction is defined, this value is updated every frame with the result of that call.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#priority">Online Documentation</a>
     */
    var priority: Double

    /**
     * Whether to throttle and prioritize the request. If false, the request will be sent immediately. If true, the
     * request will be throttled and sent based on priority.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#throttle">Online Documentation</a>
     */
    val throttle: Boolean

    /**
     * Whether to throttle the request by server. Browsers typically support about 6-8 parallel connections
     * for HTTP/1 servers, and an unlimited amount of connections for HTTP/2 servers. Setting this value
     * to `true` is preferable for requests going through HTTP/1 servers.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#throttleByServer">Online Documentation</a>
     */
    val throttleByServer: Boolean

    /**
     * Type of request.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#type">Online Documentation</a>
     */
    val type: RequestType

    /**
     * The current state of the request.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#state">Online Documentation</a>
     */
    val state: RequestState

    /**
     * Duplicates a Request instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Resource instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#clone">Online Documentation</a>
     */
    fun clone(result: Request? = definedExternally): Request
}

/**
 * The function that makes the actual data request.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#.RequestCallback">Online Documentation</a>
 */
typealias RequestCallback = () -> Promise<Unit>

/**
 * The function that is called when the request is cancelled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#.CancelCallback">Online Documentation</a>
 */
typealias CancelCallback = () -> Unit

/**
 * The function that is called to update the request's priority, which occurs once per frame.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Request.html#.PriorityCallback">Online Documentation</a>
 */
typealias PriorityCallback = () -> Double

inline fun Request(
    block: Request.ConstructorOptions.() -> Unit,
): Request =
    Request(options = jso(block))
