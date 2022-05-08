// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * An atmosphere drawn around the limb of the provided ellipsoid. Based on
 * [Display of The Earth Taking Into Account Atmospheric Scattering](http://nishitalab.org/user/nis/cdrom/sig93_nis.pdf).
 *
 * This is only supported in 3D. Atmosphere is faded out when morphing to 2D or Columbus view.
 * ```
 * scene.skyAtmosphere = new SkyAtmosphere();
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html">Online Documentation</a>
 *
 * @constructor
 * @property [ellipsoid] The ellipsoid that the atmosphere is drawn around.
 *   Default value - [Ellipsoid.WGS84]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html">Online Documentation</a>
 */
external class SkyAtmosphere(val ellipsoid: Ellipsoid = definedExternally) {
    /**
     * Determines if the atmosphere is shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Compute atmosphere per-fragment instead of per-vertex.
     * This produces better looking atmosphere with a slight performance penalty.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#perFragmentAtmosphere">Online Documentation</a>
     */
    var perFragmentAtmosphere: Boolean

    /**
     * The intensity of the light that is used for computing the sky atmosphere color.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#atmosphereLightIntensity">Online Documentation</a>
     */
    var atmosphereLightIntensity: Double

    /**
     * The Rayleigh scattering coefficient used in the atmospheric scattering equations for the sky atmosphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#atmosphereRayleighCoefficient">Online Documentation</a>
     */
    var atmosphereRayleighCoefficient: Cartesian3

    /**
     * The Mie scattering coefficient used in the atmospheric scattering equations for the sky atmosphere.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#atmosphereMieCoefficient">Online Documentation</a>
     */
    var atmosphereMieCoefficient: Cartesian3

    /**
     * The Rayleigh scale height used in the atmospheric scattering equations for the sky atmosphere, in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#atmosphereRayleighScaleHeight">Online Documentation</a>
     */
    var atmosphereRayleighScaleHeight: Double

    /**
     * The Mie scale height used in the atmospheric scattering equations for the sky atmosphere, in meters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#atmosphereMieScaleHeight">Online Documentation</a>
     */
    var atmosphereMieScaleHeight: Double

    /**
     * The anisotropy of the medium to consider for Mie scattering.
     *
     * Valid values are between -1.0 and 1.0.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#atmosphereMieAnisotropy">Online Documentation</a>
     */
    var atmosphereMieAnisotropy: Double

    /**
     * The hue shift to apply to the atmosphere. Defaults to 0.0 (no shift).
     * A hue shift of 1.0 indicates a complete rotation of the hues available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#hueShift">Online Documentation</a>
     */
    var hueShift: Double

    /**
     * The saturation shift to apply to the atmosphere. Defaults to 0.0 (no shift).
     * A saturation shift of -1.0 is monochrome.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#saturationShift">Online Documentation</a>
     */
    var saturationShift: Double

    /**
     * The brightness shift to apply to the atmosphere. Defaults to 0.0 (no shift).
     * A brightness shift of -1.0 is complete darkness, which will let space show through.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#brightnessShift">Online Documentation</a>
     */
    var brightnessShift: Double

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#isDestroyed">Online Documentation</a>
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
     * skyAtmosphere = skyAtmosphere && skyAtmosphere.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SkyAtmosphere.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
