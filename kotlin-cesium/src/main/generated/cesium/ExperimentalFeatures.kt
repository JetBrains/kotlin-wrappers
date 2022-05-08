// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Flags to enable experimental features in CesiumJS. Stability and performance
 * may not be optimal when these are enabled. Experimental features are subject
 * to change without Cesium's standard deprecation policy.
 *
 * Experimental features must still uphold Cesium's quality standards. Here
 * are some guidelines:
 *
 * - Experimental features must have high unit test coverage like any other feature.
 * - Experimental features are intended for large features where there is benefit of merging some of the code sooner (e.g. to avoid long-running staging branches)
 * - Experimental flags should be short-lived. Make it clear in the PR what it would take to promote the feature to a regular feature.
 * - To avoid cluttering the code, check the flag in as few places as possible. Ideally this would be a single place.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ExperimentalFeatures.html">Online Documentation</a>
 */
external object ExperimentalFeatures {
    /**
     * Toggles the usage of the ModelExperimental class.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ExperimentalFeatures.html#.enableModelExperimental">Online Documentation</a>
     */
    var enableModelExperimental: Boolean
}
