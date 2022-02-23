// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Properties for controlling globe translucency.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GlobeTranslucency.html">Online Documentation</a>
 */
external class GlobeTranslucency {
    /**
     * When true, the globe is rendered as a translucent surface.
     *
     * The alpha is computed by blending [Globe.material], [Globe.imageryLayers],
     * and [Globe.baseColor], all of which may contain translucency, and then multiplying by
     * [GlobeTranslucency.frontFaceAlpha] and [GlobeTranslucency.frontFaceAlphaByDistance] for front faces and
     * [GlobeTranslucency.backFaceAlpha] and [GlobeTranslucency.backFaceAlphaByDistance] for back faces.
     * When the camera is underground back faces and front faces are swapped, i.e. back-facing geometry
     * is considered front facing.
     *
     * Translucency is disabled by default.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GlobeTranslucency.html#enabled">Online Documentation</a>
     */
    var enabled: Boolean

    /**
     * A constant translucency to apply to front faces of the globe.
     *
     * [GlobeTranslucency.enabled] must be set to true for this option to take effect.
     * ```
     * // Set front face translucency to 0.5.
     * globe.translucency.frontFaceAlpha = 0.5;
     * globe.translucency.enabled = true;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GlobeTranslucency.html#frontFaceAlpha">Online Documentation</a>
     */
    var frontFaceAlpha: Double

    /**
     * Gets or sets near and far translucency properties of front faces of the globe based on the distance to the camera.
     * The translucency will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the translucency remains clamped to the nearest bound.  If undefined,
     * frontFaceAlphaByDistance will be disabled.
     *
     * [GlobeTranslucency.enabled] must be set to true for this option to take effect.
     * ```
     * // Example 1.
     * // Set front face translucency to 0.5 when the
     * // camera is 1500 meters from the surface and 1.0
     * // as the camera distance approaches 8.0e6 meters.
     * globe.translucency.frontFaceAlphaByDistance = new NearFarScalar(1.5e2, 0.5, 8.0e6, 1.0);
     * globe.translucency.enabled = true;
     * ```
     * ```
     * // Example 2.
     * // Disable front face translucency by distance
     * globe.translucency.frontFaceAlphaByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GlobeTranslucency.html#frontFaceAlphaByDistance">Online Documentation</a>
     */
    var frontFaceAlphaByDistance: NearFarScalar

    /**
     * A constant translucency to apply to back faces of the globe.
     *
     * [GlobeTranslucency.enabled] must be set to true for this option to take effect.
     * ```
     * // Set back face translucency to 0.5.
     * globe.translucency.backFaceAlpha = 0.5;
     * globe.translucency.enabled = true;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GlobeTranslucency.html#backFaceAlpha">Online Documentation</a>
     */
    var backFaceAlpha: Double

    /**
     * Gets or sets near and far translucency properties of back faces of the globe based on the distance to the camera.
     * The translucency will interpolate between the [NearFarScalar.nearValue] and
     * [NearFarScalar.farValue] while the camera distance falls within the lower and upper bounds
     * of the specified [NearFarScalar.near] and [NearFarScalar.far].
     * Outside of these ranges the translucency remains clamped to the nearest bound.  If undefined,
     * backFaceAlphaByDistance will be disabled.
     *
     * [GlobeTranslucency.enabled] must be set to true for this option to take effect.
     * ```
     * // Example 1.
     * // Set back face translucency to 0.5 when the
     * // camera is 1500 meters from the surface and 1.0
     * // as the camera distance approaches 8.0e6 meters.
     * globe.translucency.backFaceAlphaByDistance = new NearFarScalar(1.5e2, 0.5, 8.0e6, 1.0);
     * globe.translucency.enabled = true;
     * ```
     * ```
     * // Example 2.
     * // Disable back face translucency by distance
     * globe.translucency.backFaceAlphaByDistance = undefined;
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GlobeTranslucency.html#backFaceAlphaByDistance">Online Documentation</a>
     */
    var backFaceAlphaByDistance: NearFarScalar

    /**
     * A property specifying a [Rectangle] used to limit translucency to a cartographic area.
     * Defaults to the maximum extent of cartographic coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GlobeTranslucency.html#rectangle">Online Documentation</a>
     */
    var rectangle: Rectangle
}
