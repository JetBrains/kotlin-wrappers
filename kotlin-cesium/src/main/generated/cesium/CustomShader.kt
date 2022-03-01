// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A user defined GLSL shader used with [ModelExperimental] as well
 * as [Cesium3DTileset].
 *
 * If texture uniforms are used, additional resource management must be done:
 *
 * - The `update` function must be called each frame. When a
 *   custom shader is passed to a [ModelExperimental] or a
 *   [Cesium3DTileset], this step is handled automaticaly
 * - [CustomShader.destroy] must be called when the custom shader is
 *   no longer needed to clean up GPU resources properly. The application
 *   is responsible for calling this method.
 *
 * To enable the use of [ModelExperimental] in [Cesium3DTileset], set [ExperimentalFeatures.enableModelExperimental] to `true` or tileset.enableModelExperimental to `true`.
 *
 * See the [Custom Shader Guide](https://github.com/CesiumGS/cesium/tree/main/Documentation/CustomShaderGuide) for more detailed documentation.
 * ```
 * const customShader = new CustomShader({
 *   uniforms: {
 *     u_colorIndex: {
 *       type: UniformType.FLOAT,
 *       value: 1.0
 *     },
 *     u_normalMap: {
 *       type: UniformType.SAMPLER_2D,
 *       value: new TextureUniform({
 *         url: "http://example.com/normal.png"
 *       })
 *     }
 *   },
 *   varyings: {
 *     v_selectedColor: VaryingType.VEC3
 *   },
 *   vertexShaderText: `
 *   void vertexMain(VertexInput vsInput, inout czm_modelVertexOutput vsOutput) {
 *     v_selectedColor = mix(vsInput.attributes.color_0, vsInput.attributes.color_1, u_colorIndex);
 *     vsOutput.positionMC += 0.1 * vsInput.attributes.normal;
 *   }
 *   `,
 *   fragmentShaderText: `
 *   void fragmentMain(FragmentInput fsInput, inout czm_modelMaterial material) {
 *     material.normal = texture2D(u_normalMap, fsInput.attributes.texCoord_0);
 *     material.diffuse = v_selectedColor;
 *   }
 *   `
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html">Online Documentation</a>
 *
 * @constructor
 * @param [options] An object with the following options
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html">Online Documentation</a>
 */
external class CustomShader(options: ConstructorOptions) {
    /**
     * @property [mode] The custom shader mode, which determines how the custom shader code is inserted into the fragment shader.
     *   Default value - [CustomShaderMode.MODIFY_MATERIAL]
     * @property [lightingModel] The lighting model (e.g. PBR or unlit). If present, this overrides the default lighting for the model.
     * @property [isTranslucent] If set, the model will be rendered as translucent. This overrides the default settings for the model.
     *   Default value - `false`
     * @property [uniforms] A dictionary for user-defined uniforms. The key is the uniform name that will appear in the GLSL code. The value is an object that describes the uniform type and initial value
     * @property [varyings] A dictionary for declaring additional GLSL varyings used in the shader. The key is the varying name that will appear in the GLSL code. The value is the data type of the varying. For each varying, the declaration will be added to the top of the shader automatically. The caller is responsible for assigning a value in the vertex shader and using the value in the fragment shader.
     * @property [vertexShaderText] The custom vertex shader as a string of GLSL code. It must include a GLSL function called vertexMain. See the example for the expected signature. If not specified, the custom vertex shader step will be skipped in the computed vertex shader.
     * @property [fragmentShaderText] The custom fragment shader as a string of GLSL code. It must include a GLSL function called fragmentMain. See the example for the expected signature. If not specified, the custom fragment shader step will be skipped in the computed fragment shader.
     */
    interface ConstructorOptions {
        var mode: CustomShaderMode?
        var lightingModel: LightingModel?
        var isTranslucent: Boolean?
        var uniforms: Record<String, UniformSpecifier>?
        var varyings: Record<String, VaryingType>?
        var vertexShaderText: String?
        var fragmentShaderText: String?
    }

    /**
     * Update the value of a uniform declared in the shader
     * @param [uniformName] The GLSL name of the uniform. This must match one of the uniforms declared in the constructor
     * @param [value] The new value of the uniform.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomShader.html#setUniform">Online Documentation</a>
     */
    fun setUniform(
        uniformName: String,
        value: dynamic,
    )
}

inline fun CustomShader(
    block: CustomShader.ConstructorOptions.() -> Unit,
): CustomShader {
    val options: CustomShader.ConstructorOptions = js("({})")
    block(options)
    return CustomShader(options)
}
