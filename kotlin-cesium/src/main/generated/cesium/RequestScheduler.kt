// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * The request scheduler is used to track and constrain the number of active requests in order to prioritize incoming requests. The ability
 * to retain control over the number of requests in CesiumJS is important because due to events such as changes in the camera position,
 * a lot of new requests may be generated and a lot of in-flight requests may become redundant. The request scheduler manually constrains the
 * number of requests so that newer requests wait in a shorter queue and don't have to compete for bandwidth with requests that have expired.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RequestScheduler.html">Online Documentation</a>
 */
external object RequestScheduler {
    /**
     * The maximum number of simultaneous active requests. Un-throttled requests do not observe this limit.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RequestScheduler.html#.maximumRequests">Online Documentation</a>
     */
    var maximumRequests: Int

    /**
     * The maximum number of simultaneous active requests per server. Un-throttled requests or servers specifically
     * listed in [requestsByServer] do not observe this limit.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RequestScheduler.html#.maximumRequestsPerServer">Online Documentation</a>
     */
    var maximumRequestsPerServer: Int

    /**
     * A per server key list of overrides to use for throttling instead of `maximumRequestsPerServer`
     * ```
     * RequestScheduler.requestsByServer = {
     *   'api.cesium.com:443': 18,
     *   'assets.cesium.com:443': 18
     * };
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RequestScheduler.html#.requestsByServer">Online Documentation</a>
     */
    var requestsByServer: Any

    /**
     * Specifies if the request scheduler should throttle incoming requests, or let the browser queue requests under its control.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RequestScheduler.html#.throttleRequests">Online Documentation</a>
     */
    var throttleRequests: Boolean
}
