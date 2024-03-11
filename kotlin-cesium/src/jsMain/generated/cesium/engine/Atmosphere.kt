// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Common atmosphere settings used by 3D Tiles and models for rendering sky atmosphere, ground atmosphere, and fog.
 *
 * This class is not to be confused with [SkyAtmosphere], which is responsible for rendering the sky.
 *
 * While the atmosphere settings affect the color of fog, see [Fog] to control how fog is rendered.
 * ```
 * // Turn on dynamic atmosphere lighting using the sun direction
 * scene.atmosphere.dynamicLighting = DynamicAtmosphereLightingType.SUNLIGHT;
 * ```
 * ```
 * // Turn on dynamic lighting using whatever light source is in the scene
 * scene.light = new DirectionalLight({
 *   direction: new Cartesian3(1, 0, 0)
 * });
 * scene.atmosphere.dynamicLighting = DynamicAtmosphereLightingType.SCENE_LIGHT;
 * ```
 * ```
 * // Adjust the color of the atmosphere effects.
 * scene.atmosphere.hueShift = 0.4; // Cycle 40% around the color wheel
 * scene.atmosphere.brightnessShift = 0.25; // Increase the brightness
 * scene.atmosphere.saturationShift = -0.1; // Desaturate the colors
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html">Online Documentation</a>
 */
external class Atmosphere {
    /**
     * The intensity of the light that is used for computing the ground atmosphere color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#lightIntensity">Online Documentation</a>
     */
    var lightIntensity: Double

    /**
     * The Rayleigh scattering coefficient used in the atmospheric scattering equations for the ground atmosphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#rayleighCoefficient">Online Documentation</a>
     */
    var rayleighCoefficient: Cartesian3

    /**
     * The Mie scattering coefficient used in the atmospheric scattering equations for the ground atmosphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#mieCoefficient">Online Documentation</a>
     */
    var mieCoefficient: Cartesian3

    /**
     * The Rayleigh scale height used in the atmospheric scattering equations for the ground atmosphere, in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#rayleighScaleHeight">Online Documentation</a>
     */
    var rayleighScaleHeight: Double

    /**
     * The Mie scale height used in the atmospheric scattering equations for the ground atmosphere, in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#mieScaleHeight">Online Documentation</a>
     */
    var mieScaleHeight: Double

    /**
     * The anisotropy of the medium to consider for Mie scattering.
     *
     * Valid values are between -1.0 and 1.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#mieAnisotropy">Online Documentation</a>
     */
    var mieAnisotropy: Double

    /**
     * The hue shift to apply to the atmosphere. Defaults to 0.0 (no shift).
     * A hue shift of 1.0 indicates a complete rotation of the hues available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#hueShift">Online Documentation</a>
     */
    var hueShift: Double

    /**
     * The saturation shift to apply to the atmosphere. Defaults to 0.0 (no shift).
     * A saturation shift of -1.0 is monochrome.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#saturationShift">Online Documentation</a>
     */
    var saturationShift: Double

    /**
     * The brightness shift to apply to the atmosphere. Defaults to 0.0 (no shift).
     * A brightness shift of -1.0 is complete darkness, which will let space show through.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#brightnessShift">Online Documentation</a>
     */
    var brightnessShift: Double

    /**
     * When not DynamicAtmosphereLightingType.NONE, the selected light source will
     * be used for dynamically lighting all atmosphere-related rendering effects.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Atmosphere.html#dynamicLighting">Online Documentation</a>
     */
    var dynamicLighting: DynamicAtmosphereLightingType
}
