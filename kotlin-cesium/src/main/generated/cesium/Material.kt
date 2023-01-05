// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.jso

/**
 * A Material defines surface appearance through a combination of diffuse, specular,
 * normal, emission, and alpha components. These values are specified using a
 * JSON schema called Fabric which gets parsed and assembled into glsl shader code
 * behind-the-scenes. Check out the [wiki page](https://github.com/CesiumGS/cesium/wiki/Fabric)
 * for more details on Fabric.
 *
 * Base material types and their uniforms:
 * ```
 * // Create a color material with fromType:
 * polygon.material = Material.fromType('Color');
 * polygon.material.uniforms.color = new Color(1.0, 1.0, 0.0, 1.0);
 *
 * // Create the default material:
 * polygon.material = new Material();
 *
 * // Create a color material with full Fabric notation:
 * polygon.material = new Material({
 *     fabric : {
 *         type : 'Color',
 *         uniforms : {
 *             color : new Color(1.0, 1.0, 0.0, 1.0)
 *         }
 *     }
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html">Online Documentation</a>
 */
external class Material(options: ConstructorOptions? = definedExternally) {
    /**
     * @property [strict] Throws errors for issues that would normally be ignored, including unused uniforms or materials.
     *   Default value - `false`
     * @property [translucent] When `true` or a function that returns `true`, the geometry
     *   with this material is expected to appear translucent.
     *   Default value - `true`
     * @property [minificationFilter] The [TextureMinificationFilter] to apply to this material's textures.
     *   Default value - [TextureMinificationFilter.LINEAR]
     * @property [magnificationFilter] The [TextureMagnificationFilter] to apply to this material's textures.
     *   Default value - [TextureMagnificationFilter.LINEAR]
     * @property [fabric] The fabric JSON used to generate the material.
     */
    interface ConstructorOptions {
        var strict: Boolean?
        var translucent: dynamic
        var minificationFilter: TextureMinificationFilter?
        var magnificationFilter: TextureMagnificationFilter?
        var fabric: Any
    }

    /**
     * The material type. Can be an existing type or a new type. If no type is specified in fabric, type is a GUID.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#type">Online Documentation</a>
     */
    var type: String

    /**
     * The glsl shader source for this material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#shaderSource">Online Documentation</a>
     */
    var shaderSource: String

    /**
     * Maps sub-material names to Material objects.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#materials">Online Documentation</a>
     */
    var materials: Any

    /**
     * Maps uniform names to their values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#uniforms">Online Documentation</a>
     */
    var uniforms: Any

    /**
     * When `true` or a function that returns `true`,
     * the geometry is expected to appear translucent.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#translucent">Online Documentation</a>
     */
    var translucent: dynamic

    /**
     * Gets whether or not this material is translucent.
     * @return `true` if this material is translucent, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#isTranslucent">Online Documentation</a>
     */
    fun isTranslucent(): Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#isDestroyed">Online Documentation</a>
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
     * material = material && material.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#destroy">Online Documentation</a>
     */
    fun destroy()

    companion object {
        /**
         * Creates a new material using an existing material type.
         *
         * Shorthand for: new Material({fabric : {type : type}});
         * ```
         * const material = Material.fromType('Color', {
         *     color : new Color(1.0, 0.0, 0.0, 1.0)
         * });
         * ```
         * @param [type] The base material type.
         * @param [uniforms] Overrides for the default uniforms.
         * @return New material object.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.fromType">Online Documentation</a>
         */
        fun fromType(
            type: String,
            uniforms: Any? = definedExternally,
        ): Material

        /**
         * Gets or sets the default texture uniform value.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.DefaultImageId">Online Documentation</a>
         */
        var DefaultImageId: String

        /**
         * Gets or sets the default cube map texture uniform value.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.DefaultCubeMapId">Online Documentation</a>
         */
        var DefaultCubeMapId: String

        /**
         * Gets the name of the color material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.ColorType">Online Documentation</a>
         */
        val ColorType: String

        /**
         * Gets the name of the image material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.ImageType">Online Documentation</a>
         */
        val ImageType: String

        /**
         * Gets the name of the diffuce map material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.DiffuseMapType">Online Documentation</a>
         */
        val DiffuseMapType: String

        /**
         * Gets the name of the alpha map material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.AlphaMapType">Online Documentation</a>
         */
        val AlphaMapType: String

        /**
         * Gets the name of the specular map material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.SpecularMapType">Online Documentation</a>
         */
        val SpecularMapType: String

        /**
         * Gets the name of the emmision map material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.EmissionMapType">Online Documentation</a>
         */
        val EmissionMapType: String

        /**
         * Gets the name of the bump map material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.BumpMapType">Online Documentation</a>
         */
        val BumpMapType: String

        /**
         * Gets the name of the normal map material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.NormalMapType">Online Documentation</a>
         */
        val NormalMapType: String

        /**
         * Gets the name of the grid material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.GridType">Online Documentation</a>
         */
        val GridType: String

        /**
         * Gets the name of the stripe material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.StripeType">Online Documentation</a>
         */
        val StripeType: String

        /**
         * Gets the name of the checkerboard material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.CheckerboardType">Online Documentation</a>
         */
        val CheckerboardType: String

        /**
         * Gets the name of the dot material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.DotType">Online Documentation</a>
         */
        val DotType: String

        /**
         * Gets the name of the water material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.WaterType">Online Documentation</a>
         */
        val WaterType: String

        /**
         * Gets the name of the rim lighting material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.RimLightingType">Online Documentation</a>
         */
        val RimLightingType: String

        /**
         * Gets the name of the fade material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.FadeType">Online Documentation</a>
         */
        val FadeType: String

        /**
         * Gets the name of the polyline arrow material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.PolylineArrowType">Online Documentation</a>
         */
        val PolylineArrowType: String

        /**
         * Gets the name of the polyline glow material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.PolylineDashType">Online Documentation</a>
         */
        val PolylineDashType: String

        /**
         * Gets the name of the polyline glow material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.PolylineGlowType">Online Documentation</a>
         */
        val PolylineGlowType: String

        /**
         * Gets the name of the polyline outline material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.PolylineOutlineType">Online Documentation</a>
         */
        val PolylineOutlineType: String

        /**
         * Gets the name of the elevation contour material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.ElevationContourType">Online Documentation</a>
         */
        val ElevationContourType: String

        /**
         * Gets the name of the elevation contour material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.ElevationRampType">Online Documentation</a>
         */
        val ElevationRampType: String

        /**
         * Gets the name of the slope ramp material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.SlopeRampMaterialType">Online Documentation</a>
         */
        val SlopeRampMaterialType: String

        /**
         * Gets the name of the aspect ramp material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.AspectRampMaterialType">Online Documentation</a>
         */
        val AspectRampMaterialType: String

        /**
         * Gets the name of the elevation band material.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Material.html#.ElevationBandType">Online Documentation</a>
         */
        val ElevationBandType: String
    }
}

inline fun Material(
    block: Material.ConstructorOptions.() -> Unit,
): Material =
    Material(options = jso(block))
