// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Use [Viewer.shadowMap] to get the scene's shadow map. Do not construct this directly.
 *
 * The normalOffset bias pushes the shadows forward slightly, and may be disabled
 * for applications that require ultra precise shadows.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object containing the following properties:
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html">Online Documentation</a>
 */
external class ShadowMap(options: ConstructorOptions) {
    /**
     * @property [lightCamera] A camera representing the light source.
     * @property [enabled] Whether the shadow map is enabled.
     *   Default value - `true`
     * @property [isPointLight] Whether the light source is a point light. Point light shadows do not use cascades.
     *   Default value - `false`
     * @property [pointLightRadius] Radius of the point light.
     *   Default value - `100.0`
     * @property [cascadesEnabled] Use multiple shadow maps to cover different partitions of the view frustum.
     *   Default value - `true`
     * @property [numberOfCascades] The number of cascades to use for the shadow map. Supported values are one and four.
     *   Default value - `4`
     * @property [maximumDistance] The maximum distance used for generating cascaded shadows. Lower values improve shadow quality.
     *   Default value - `5000.0`
     * @property [size] The width and height, in pixels, of each shadow map.
     *   Default value - `2048`
     * @property [softShadows] Whether percentage-closer-filtering is enabled for producing softer shadows.
     *   Default value - `false`
     * @property [darkness] The shadow darkness.
     *   Default value - `0.3`
     * @property [normalOffset] Whether a normal bias is applied to shadows.
     *   Default value - `true`
     * @property [fadingEnabled] Whether shadows start to fade out once the light gets closer to the horizon.
     *   Default value - `true`
     */
    interface ConstructorOptions {
        var lightCamera: Camera
        var enabled: Boolean?
        var isPointLight: Boolean?
        var pointLightRadius: Double?
        var cascadesEnabled: Boolean?
        var numberOfCascades: Int?
        var maximumDistance: Double?
        var size: Double?
        var softShadows: Boolean?
        var darkness: Double?
        var normalOffset: Boolean?
        var fadingEnabled: Boolean?
    }

    /**
     * Determines the darkness of the shadows.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#darkness">Online Documentation</a>
     */
    var darkness: Double

    /**
     * Determines whether shadows start to fade out once the light gets closer to the horizon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#fadingEnabled">Online Documentation</a>
     */
    var fadingEnabled: Boolean

    /**
     * Determines the maximum distance of the shadow map. Only applicable for cascaded shadows. Larger distances may result in lower quality shadows.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#maximumDistance">Online Documentation</a>
     */
    var maximumDistance: Double

    /**
     * Determines if the shadow map will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#enabled">Online Documentation</a>
     */
    var enabled: Boolean

    /**
     * Determines if a normal bias will be applied to shadows.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#normalOffset">Online Documentation</a>
     */
    var normalOffset: Boolean

    /**
     * Determines if soft shadows are enabled. Uses pcf filtering which requires more texture reads and may hurt performance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#softShadows">Online Documentation</a>
     */
    var softShadows: Boolean

    /**
     * The width and height, in pixels, of each shadow map.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ShadowMap.html#size">Online Documentation</a>
     */
    var size: Double
}

inline fun ShadowMap(
    block: ShadowMap.ConstructorOptions.() -> Unit,
): ShadowMap {
    val options: ShadowMap.ConstructorOptions = js("({})")
    block(options)
    return ShadowMap(options)
}
