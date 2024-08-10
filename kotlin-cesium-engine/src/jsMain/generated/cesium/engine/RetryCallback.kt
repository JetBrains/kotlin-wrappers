// Automatically generated - do not modify!

package cesium.engine

import js.promise.PromiseResult

/**
 * A function that returns the value of the property.
 * @param [resource] The resource that failed to load.
 * @param [error] The error that occurred during the loading of the resource.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Resource.html#.RetryCallback">Online Documentation</a>
 */
typealias RetryCallback = (resource: Resource?, error: RequestErrorEvent?) -> PromiseResult<Boolean>
