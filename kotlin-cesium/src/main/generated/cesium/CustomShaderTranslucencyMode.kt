// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * An enum for controling how [CustomShader] handles translucency compared with the original
 * primitive.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CustomShaderTranslucencyMode">Online Documentation</a>
 */

external enum class CustomShaderTranslucencyMode {

    /**
     * Inherit translucency settings from the primitive's material. If the primitive used a
     * translucent material, the custom shader will also be considered translucent. If the primitive
     * used an opaque material, the custom shader will be considered opaque.
     */
    INHERIT,

    /**
     * Force the primitive to render the primitive as opaque, ignoring any material settings.
     */
    OPAQUE,

    /**
     * Force the primitive to render the primitive as translucent, ignoring any material settings.
     */
    TRANSLUCENT,

    ;

}
