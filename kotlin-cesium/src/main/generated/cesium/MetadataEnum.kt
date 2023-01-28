// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * A metadata enum.
 *
 * See the [3D Metadata Specification](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Metadata) for 3D Tiles
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnum.html">Online Documentation</a>
 */
external class MetadataEnum(options: ConstructorOptions) {
    /**
     * @property [id] The ID of the enum.
     * @property [values] The enum values.
     * @property [valueType] The enum value type.
     *   Default value - [MetadataComponentType.UINT16]
     * @property [name] The name of the enum.
     * @property [description] The description of the enum.
     * @property [extras] Extra user-defined properties.
     * @property [extensions] An object containing extensions.
     */
    interface ConstructorOptions {
        var id: String
        var values: ReadonlyArray<MetadataEnumValue>
        var valueType: MetadataComponentType?
        var name: String?
        var description: String?
        var extras: Any?
        var extensions: Any?
    }

    /**
     * The enum values.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnum.html#values">Online Documentation</a>
     */
    val values: ReadonlyArray<MetadataEnumValue>

    /**
     * The enum value type.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnum.html#valueType">Online Documentation</a>
     */
    val valueType: MetadataComponentType

    /**
     * The ID of the enum.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnum.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * The name of the enum.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnum.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The description of the enum.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnum.html#description">Online Documentation</a>
     */
    val description: String

    /**
     * Extra user-defined properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnum.html#extras">Online Documentation</a>
     */
    val extras: Any

    /**
     * An object containing extensions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnum.html#extensions">Online Documentation</a>
     */
    val extensions: Any
}

inline fun MetadataEnum(
    block: MetadataEnum.ConstructorOptions.() -> Unit,
): MetadataEnum =
    MetadataEnum(options = jso(block))
