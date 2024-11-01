// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Generates an environment map at the given position based on scene's current lighting conditions. From this, it produces multiple levels of specular maps and spherical harmonic coefficients than can be used with [ImageBasedLighting] for models or tilesets.
 * ```
 * // Enable time-of-day environment mapping in a scene
 * scene.atmosphere.dynamicLighting = DynamicAtmosphereLightingType.SUNLIGHT;
 *
 * // Decrease the directional lighting contribution
 * scene.light.intensity = 0.5
 *
 * // Increase the intensity of of the environment map lighting contribution
 * const environmentMapManager = tileset.environmentMapManager;
 * environmentMapManager.atmosphereScatteringIntensity = 3.0;
 * ```
 * ```
 * // Change the ground color used for a model's environment map to a forest green
 * const environmentMapManager = model.environmentMapManager;
 * environmentMapManager.groundColor = Color.fromCssColorString("#203b34");
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object describing initialization options.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html">Online Documentation</a>
 */
external class DynamicEnvironmentMapManager(
    options: ConstructorOptions? = definedExternally,
) {
    /**
     * If true, the environment map and related properties will continue to update.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#enabled">Online Documentation</a>
     */
    var enabled: Boolean

    /**
     * The maximum amount of elapsed seconds before a new environment map is created.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#maximumSecondsDifference">Online Documentation</a>
     */
    var maximumSecondsDifference: Double

    /**
     * The maximum difference in position before a new environment map is created, in meters. Small differences in position will not visibly affect results.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#maximumPositionEpsilon">Online Documentation</a>
     */
    var maximumPositionEpsilon: Double

    /**
     * The intensity of the scattered light emitted from the atmosphere. This should be adjusted relative to the value of [Scene.light] intensity.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#atmosphereScatteringIntensity">Online Documentation</a>
     */
    var atmosphereScatteringIntensity: Double

    /**
     * The gamma correction to apply to the range of light emitted from the environment. 1.0 uses the unmodified incoming light color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#gamma">Online Documentation</a>
     */
    var gamma: Double

    /**
     * The brightness of light emitted from the environment. 1.0 uses the unmodified emitted environment color. Less than 1.0
     * makes the light darker while greater than 1.0 makes it brighter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#brightness">Online Documentation</a>
     */
    var brightness: Double

    /**
     * The saturation of the light emitted from the environment. 1.0 uses the unmodified emitted environment color. Less than 1.0 reduces the
     * saturation while greater than 1.0 increases it.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#saturation">Online Documentation</a>
     */
    var saturation: Double

    /**
     * Solid color used to represent the ground.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#groundColor">Online Documentation</a>
     */
    var groundColor: Color

    /**
     * The percentage of light reflected from the ground. The average earth albedo is 0.31.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#groundAlbedo">Online Documentation</a>
     */
    var groundAlbedo: Double

    /**
     * The position around which the environment map is generated.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#position">Online Documentation</a>
     */
    var position: Cartesian3?

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * mapManager = mapManager && mapManager.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Options for the DynamicEnvironmentMapManager constructor
     * @property [enabled] If true, the environment map and related properties will continue to update.
     *   Default value - `true`
     * @property [mipmapLevels] The number of mipmap levels to generate for specular maps. More mipmap levels will produce a higher resolution specular reflection.
     *   Default value - `10`
     * @property [maximumSecondsDifference] The maximum amount of elapsed seconds before a new environment map is created.
     *   Default value - `3600`
     * @property [maximumPositionEpsilon] The maximum difference in position before a new environment map is created, in meters. Small differences in position will not visibly affect results.
     *   Default value - `1000`
     * @property [atmosphereScatteringIntensity] The intensity of the scattered light emitted from the atmosphere. This should be adjusted relative to the value of [Scene.light] intensity.
     *   Default value - `2.0`
     * @property [gamma] The gamma correction to apply to the range of light emitted from the environment. 1.0 uses the unmodified emitted light color.
     *   Default value - `1.0`
     * @property [brightness] The brightness of light emitted from the environment. 1.0 uses the unmodified emitted environment color. Less than 1.0 makes the light darker while greater than 1.0 makes it brighter.
     *   Default value - `1.0`
     * @property [saturation] The saturation of the light emitted from the environment. 1.0 uses the unmodified emitted environment color. Less than 1.0 reduces the saturation while greater than 1.0 increases it.
     *   Default value - `1.0`
     * @property [groundColor] Solid color used to represent the ground.
     *   Default value - [DynamicEnvironmentMapManager.AVERAGE_EARTH_GROUND_COLOR]
     * @property [groundAlbedo] The percentage of light reflected from the ground. The average earth albedo is 0.31.
     *   Default value - `0.31`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#.ConstructorOptions">Online Documentation</a>
     */
    @JsPlainObject
    interface ConstructorOptions {
        var enabled: Boolean?
        var mipmapLevels: Double?
        var maximumSecondsDifference: Double?
        var maximumPositionEpsilon: Double?
        var atmosphereScatteringIntensity: Double?
        var gamma: Double?
        var brightness: Double?
        var saturation: Double?
        var groundColor: Color?
        var groundAlbedo: Double?
    }

    companion object {
        /**
         * Average hue of ground color on earth, a warm green-gray.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DynamicEnvironmentMapManager.html#.AVERAGE_EARTH_GROUND_COLOR">Online Documentation</a>
         */
        var AVERAGE_EARTH_GROUND_COLOR: Color
    }
}
