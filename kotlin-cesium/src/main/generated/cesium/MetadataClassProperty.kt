// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * A metadata property, as part of a [MetadataClass].
 *
 * See the [3D Metadata Specification](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Metadata) for 3D Tiles
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html">Online Documentation</a>
 */
external class MetadataClassProperty(options: ConstructorOptions) {
    /**
     * @property [id] The ID of the property.
     * @property [type] The type of the property such as SCALAR, VEC2, VEC3.
     * @property [componentType] The component type of the property. This includes integer (e.g. INT8 or UINT16), and floating point (FLOAT32 and FLOAT64) values.
     * @property [enumType] The enum type of the property. Only defined when type is ENUM.
     * @property [isArray] True if a property is an array (either fixed length or variable length), false otherwise.
     *   Default value - `false`
     * @property [isVariableLengthArray] True if a property is a variable length array, false otherwise.
     *   Default value - `false`
     * @property [arrayLength] The number of array elements. Only defined for fixed length arrays.
     * @property [normalized] Whether the property is normalized.
     *   Default value - `false`
     * @property [min] A number or an array of numbers storing the minimum allowable value of this property. Only defined when type is a numeric type.
     * @property [max] A number or an array of numbers storing the maximum allowable value of this property. Only defined when type is a numeric type.
     * @property [offset] The offset to be added to property values as part of the value transform.
     * @property [scale] The scale to be multiplied to property values as part of the value transform.
     * @property [noData] The no-data sentinel value that represents null values.
     * @property [default] A default value to use when an entity's property value is not defined.
     * @property [required] Whether the property is required.
     *   Default value - `false`
     * @property [name] The name of the property.
     * @property [description] The description of the property.
     * @property [semantic] An identifier that describes how this property should be interpreted.
     * @property [extras] Extra user-defined properties.
     * @property [extensions] An object containing extensions.
     */
    interface ConstructorOptions {
        var id: String
        var type: MetadataType
        var componentType: MetadataComponentType?
        var enumType: MetadataEnum?
        var isArray: Boolean?
        var isVariableLengthArray: Boolean?
        var arrayLength: Int?
        var normalized: Boolean?
        var min: dynamic
        var max: dynamic
        var offset: dynamic
        var scale: dynamic
        var noData: dynamic
        var default: dynamic
        var required: Boolean?
        var name: String?
        var description: String?
        var semantic: String?
        var extras: Any?
        var extensions: Any?
    }

    /**
     * The ID of the property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * The name of the property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The description of the property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#description">Online Documentation</a>
     */
    val description: String

    /**
     * The type of the property such as SCALAR, VEC2, VEC3
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#type">Online Documentation</a>
     */
    val type: MetadataType

    /**
     * The enum type of the property. Only defined when type is ENUM.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#enumType">Online Documentation</a>
     */
    val enumType: MetadataEnum

    /**
     * The component type of the property. This includes integer
     * (e.g. INT8 or UINT16), and floating point (FLOAT32 and FLOAT64) values
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#componentType">Online Documentation</a>
     */
    val componentType: MetadataComponentType

    /**
     * True if a property is an array (either fixed length or variable length),
     * false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#isArray">Online Documentation</a>
     */
    val isArray: Boolean

    /**
     * True if a property is a variable length array, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#isVariableLengthArray">Online Documentation</a>
     */
    val isVariableLengthArray: Boolean

    /**
     * The number of array elements. Only defined for fixed-size
     * arrays.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#arrayLength">Online Documentation</a>
     */
    val arrayLength: Int

    /**
     * Whether the property is normalized.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#normalized">Online Documentation</a>
     */
    val normalized: Boolean

    /**
     * A number or an array of numbers storing the maximum allowable value of this property. Only defined when type is a numeric type.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#max">Online Documentation</a>
     */
    val max: dynamic

    /**
     * A number or an array of numbers storing the minimum allowable value of this property. Only defined when type is a numeric type.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#min">Online Documentation</a>
     */
    val min: dynamic

    /**
     * The no-data sentinel value that represents null values
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#noData">Online Documentation</a>
     */
    val noData: dynamic

    /**
     * A default value to use when an entity's property value is not defined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#default">Online Documentation</a>
     */
    val default: dynamic

    /**
     * Whether the property is required.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#required">Online Documentation</a>
     */
    val required: Boolean

    /**
     * An identifier that describes how this property should be interpreted.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#semantic">Online Documentation</a>
     */
    val semantic: String

    /**
     * The offset to be added to property values as part of the value transform.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#offset">Online Documentation</a>
     */
    val offset: dynamic

    /**
     * The scale to be multiplied to property values as part of the value transform.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#scale">Online Documentation</a>
     */
    val scale: dynamic

    /**
     * Extra user-defined properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#extras">Online Documentation</a>
     */
    val extras: Any

    /**
     * An object containing extensions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClassProperty.html#extensions">Online Documentation</a>
     */
    val extensions: Any
}

inline fun MetadataClassProperty(
    block: MetadataClassProperty.ConstructorOptions.() -> Unit,
): MetadataClassProperty {
    val options: MetadataClassProperty.ConstructorOptions = js("({})")
    block(options)
    return MetadataClassProperty(options)
}
