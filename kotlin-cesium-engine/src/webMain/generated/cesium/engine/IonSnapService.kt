// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.promise.Promise
import kotlinx.js.JsPlainObject
import seskar.js.JsAsync

/**
 * Provides interactive snap-to-geometry against a Cesium ion 3D Tiles asset
 * backed by a BIM/CAD Database model, using the ion REST API's element snap
 * endpoint.
 *
 * This class handles conversions between the reference frame of a
 * source BIM/CAD Database and the view-dependent screen space pixel
 * coordinates. Each snap, it transforms using the ion asset's source
 * reference frame, the camera's transform, and the canvas
 * dimensions so that view-dependent features— such as the pixel aperture,
 * nearest position, or surface tracking— behave correctly.
 *
 * This object is normally not instantiated directly, use [IonSnapService.fromAssetId].
 * ```
 * const snapper = await IonSnapService.fromAssetId(123456);
 * const canvas = viewer.scene.canvas;
 * const result = await snapper.snap({
 *   elementId: "0x30000000df2",
 *   testPoint: pickedPosition,
 *   camera: viewer.camera,
 *   canvasWidth: canvas.clientWidth,
 *   canvasHeight: canvas.clientHeight,
 * });
 * if (defined(result)) {
 *   console.log("snapped to", result.snapPoint);
 * }
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonSnapService.html">Online Documentation</a>
 */
open external class IonSnapService(
    options: ConstructorOptions,
) {
    /**
     * @property [assetId] The ion asset id.
     * @property [resource] The asset's ion API resource.
     * @property [ecefTransform] A 4x4 transformation matrix from the source BIM/CAD Database reference frame local to the world's fixed reference frame.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val assetId: Int
        val resource: Resource
        val ecefTransform: Matrix4
    }

    /**
     * A 4x4 transformation matrix from the source BIM/CAD Database reference frame local to the world's fixed reference frame.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonSnapService.html#ecefTransform">Online Documentation</a>
     */
    val ecefTransform: Matrix4

    /**
     * The ion asset id this snapper operates on.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonSnapService.html#assetId">Online Documentation</a>
     */
    val assetId: Int

    /**
     * Requests a snap against an element of this asset.
     *
     * A view-correct world-to-view matrix is composed from
     * `options.camera`, `options.canvasWidth`, and
     * `options.canvasHeight` so view-dependent snapping (nearest
     * ordering, pixel apertures, surface tracking) matches the current view.
     *
     * Only 3D views are supported: the camera must be viewing in
     * [SceneMode.SCENE3D].
     * @return The snap result, or `undefined` if the element was not found or no snap was possible for it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonSnapService.html#snap">Online Documentation</a>
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun snap(options: SnapOptions): Result?

    @JsName("snap")
    fun snapAsync(options: SnapOptions): Promise<Result?>

    /**
     * @property [elementId] The element id to snap to, as a hex string, e.g. `"0x30000000df2"`.
     * @property [testPoint] The point to snap from, typically the picked cursor position.
     * @property [camera] The camera defining the current view. Must be viewing in [SceneMode.SCENE3D].
     * @property [canvasWidth] The canvas width in CSS pixels.
     * @property [canvasHeight] The canvas height in CSS pixels.
     * @property [closePoint] A reference point near the target geometry that seeds the snap search.
     *   Default value - `options.testPoint`
     * @property [snapAperture] The snap tolerance in CSS pixels of the world-to-view output space.
     *   Default value - [IonSnapService.DEFAULT_SNAP_APERTURE]
     * @property [snapMode] The type of snap to perform.
     *   Default value - [IonSnapMode.NEAREST]
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
        val snapMode: IonSnapMode?
    }

    /**
     * The result of a successful [IonSnapService.snap]. Extends
     * [SnapService.Result] with ion-specific fields.
     * @property [snapPoint] The snapped point. This is the point to consume.
     * @property [hitPoint] The point where the cursor hit the geometry: the nearest edge point when within the snap aperture, otherwise the surface point under the cursor.
     * @property [heat] How close the snap point is to the close point in view space.
     * @property [geometryType] The type of geometry snapped to.
     * @property [parentGeometryType] The type of the parent geometry snapped to.
     * @property [normal] The surface normal at the snap point, in the model's local cartesian frame.
     * @property [curve] The curve geometry near the snap point, with points as WGS84 degrees objects.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonSnapService.html#.Result">Online Documentation</a>
     */
    @JsPlainObject
    interface Result {
        val snapPoint: Cartesian3?
        val hitPoint: Cartesian3?
        val heat: IonSnapHeat?
        val geometryType: IonSnapGeometryType?
        val parentGeometryType: IonSnapParentGeometryType?
        val normal: JsAny?
        val curve: JsAny?
    }

    companion object {
        /**
         * Creates an [IonSnapService] for the given ion asset, fetching
         * the asset's ECEF transform from the ion REST API.
         * @param [assetId] The ion ID of a 3D Tiles asset backed by a BIM/CAD Database model.
         * @return A snapper bound to the asset.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonSnapService.html#.fromAssetId">Online Documentation</a>
         */
        @JsAsync
        @Suppress("WRONG_EXTERNAL_DECLARATION")
        suspend fun fromAssetId(
            assetId: Int,
            options: FromAssetIdOptions? = definedExternally,
        ): IonSnapService

        @JsName("fromAssetId")
        fun fromAssetIdAsync(
            assetId: Int,
            options: FromAssetIdOptions? = definedExternally,
        ): Promise<IonSnapService>

        /**
         * @property [accessToken] The ion access token to use.
         *   Default value - [Ion.defaultAccessToken]
         * @property [server] The ion API server to use.
         *   Default value - [Ion.defaultServer]
         */
        @JsPlainObject
        interface FromAssetIdOptions {
            val accessToken: String?
            val server: Resource?
        }

        /**
         * The default snap tolerance used by [IonSnapService.snap] when
         * `options.snapAperture` is not provided, in CSS pixels of the
         * world-to-view output space. This is [SnapService]'s
         * `DEFAULT_SNAP_APERTURE` for this implementation.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/IonSnapService.html#.DEFAULT_SNAP_APERTURE">Online Documentation</a>
         */
        val DEFAULT_SNAP_APERTURE: Double
    }
}
