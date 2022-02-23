// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A model's material with modifiable parameters.  A glTF material
 * contains parameters defined by the material's technique with values
 * defined by the technique and potentially overridden by the material.
 * This class allows changing these values at runtime.
 *
 * Use [Model.getMaterial] to create an instance.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelMaterial.html">Online Documentation</a>
 */
external class ModelMaterial {
    /**
     * The value of the `name` property of this material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelMaterial.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The index of the material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelMaterial.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * Assigns a value to a material parameter.  The type for `value`
     * depends on the glTF type of the parameter.  It will be a floating-point
     * number, Cartesian, or matrix.
     * ```
     * material.setValue('diffuse', new Cartesian4(1.0, 0.0, 0.0, 1.0));  // vec4
     * material.setValue('shininess', 256.0); // scalar
     * ```
     * @param [name] The name of the parameter.
     * @param [value] The value to assign to the parameter.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelMaterial.html#setValue">Online Documentation</a>
     */
    fun setValue(
        name: String,
        value: Any? = definedExternally,
    )

    /**
     * Returns the value of the parameter with the given `name`.  The type of the
     * returned object depends on the glTF type of the parameter.  It will be a floating-point
     * number, Cartesian, or matrix.
     * @param [name] The name of the parameter.
     * @return The value of the parameter or `undefined` if the parameter does not exist.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ModelMaterial.html#getValue">Online Documentation</a>
     */
    fun getValue(name: String): Any
}
