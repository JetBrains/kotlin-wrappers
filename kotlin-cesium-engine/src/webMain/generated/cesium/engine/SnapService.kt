// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * Provides snap-to-geometry through an external service, which snaps against
 * source geometry hosted remotely rather than geometry loaded in the scene.
 * This type describes an interface and is not intended to be used.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SnapService.html">Online Documentation</a>
 */
open external class SnapService {
    /**
     * Requests a snap against geometry known to the service.
     *
     * The camera and canvas dimensions describe the current view so the
     * implementation can perform view-dependent snapping (nearest ordering,
     * pixel apertures, surface tracking) correctly.
     *
     * Implementations may accept additional options beyond those listed here.
     * @return The snap result, or `undefined` if no snap was possible.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SnapService.html#snap">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun snap(options: SnapOptions): Result?

    @JsName("snap")
    fun snapAsync(options: SnapOptions): Promise<Result?>

    /**
     * @property [elementId] An implementation-defined identifier of the geometry to snap to.
     * @property [testPoint] The point to snap from, typically the picked cursor position.
     * @property [camera] The camera defining the current view.
     * @property [canvasWidth] The canvas width in CSS pixels.
     * @property [canvasHeight] The canvas height in CSS pixels.
     * @property [closePoint] A reference point near the target geometry that seeds the snap search.
     *   Default value - `options.testPoint`
     * @property [snapAperture] The snap tolerance in CSS pixels.
     *   Default value - [SnapService.DEFAULT_SNAP_APERTURE]
     */
    @JsPlainObject
    interface SnapOptions {
        val elementId: String
        val testPoint: Cartesian3
        val camera: Camera
        val canvasWidth: Double
        val canvasHeight: Double
        val closePoint: Cartesian3?
        val snapAperture: Double?
    }

    /**
     * The result of a successful [SnapService.snap].
     *
     * Implementations may return additional properties beyond those listed here.
     * @property [snapPoint] The snapped point. This is the point to consume.
     * @property [hitPoint] The point where the cursor hit the geometry: the nearest edge point when within the snap aperture, otherwise the surface point under the cursor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SnapService.html#.Result">Online Documentation</a>
     */
    @JsPlainObject
    interface Result {
        val snapPoint: Cartesian3?
        val hitPoint: Cartesian3?
    }

    companion object {
        /**
         * The default snap tolerance used by [SnapService.snap] when
         * `options.snapAperture` is not provided, in CSS pixels.
         * The value is implementation-defined.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SnapService.html#.DEFAULT_SNAP_APERTURE">Online Documentation</a>
         */
        val DEFAULT_SNAP_APERTURE: Double
    }
}
