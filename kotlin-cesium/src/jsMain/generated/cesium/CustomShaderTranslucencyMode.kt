// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * An enum for controling how [CustomShader] handles translucency compared with the original
 * primitive.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CustomShaderTranslucencyMode">Online Documentation</a>
 */

sealed external interface CustomShaderTranslucencyMode {
    companion object {

        /**
         * Inherit translucency settings from the primitive's material. If the primitive used a
         * translucent material, the custom shader will also be considered translucent. If the primitive
         * used an opaque material, the custom shader will be considered opaque.
         */
        val INHERIT: CustomShaderTranslucencyMode

        /**
         * Force the primitive to render the primitive as opaque, ignoring any material settings.
         */
        val OPAQUE: CustomShaderTranslucencyMode

        /**
         * Force the primitive to render the primitive as translucent, ignoring any material settings.
         */
        val TRANSLUCENT: CustomShaderTranslucencyMode
    }
}
