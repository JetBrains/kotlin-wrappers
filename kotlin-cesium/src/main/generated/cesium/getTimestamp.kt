// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Gets a timestamp that can be used in measuring the time between events.  Timestamps
 * are expressed in milliseconds, but it is not specified what the milliseconds are
 * measured from.  This function uses performance.now() if it is available, or Date.now()
 * otherwise.
 * @return The timestamp in milliseconds since some unspecified reference time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/getTimestamp.html">Online Documentation</a>
 */
external fun getTimestamp(): Double
