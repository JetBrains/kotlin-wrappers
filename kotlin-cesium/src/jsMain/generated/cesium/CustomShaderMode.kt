// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * An enum describing how the [CustomShader] will be added to the
 * fragment shader. This determines how the shader interacts with the material.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CustomShaderMode">Online Documentation</a>
 */

external enum class CustomShaderMode {

    /**
     * The custom shader will be used to modify the results of the material stage
     * before lighting is applied.
     */
    MODIFY_MATERIAL,

    /**
     * The custom shader will be used instead of the material stage. This is a hint
     * to optimize out the material processing code.
     */
    REPLACE_MATERIAL,

    ;

}
