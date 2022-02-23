// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A simple proxy that appends the desired resource as the sole query parameter
 * to the given proxy URL.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DefaultProxy.html">Online Documentation</a>
 *
 * @constructor
 * @param [proxy] The proxy URL that will be used to requests all resources.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DefaultProxy.html">Online Documentation</a>
 */
external class DefaultProxy(proxy: String) {
    /**
     * Get the final URL to use to request a given resource.
     * @param [resource] The resource to request.
     * @return proxied resource
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DefaultProxy.html#getURL">Online Documentation</a>
     */
    fun getURL(resource: String): String
}
