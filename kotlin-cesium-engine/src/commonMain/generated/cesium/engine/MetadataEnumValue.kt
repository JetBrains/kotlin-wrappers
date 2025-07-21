// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * A metadata enum value.
 *
 * See the [3D Metadata Specification](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Metadata) for 3D Tiles
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnumValue.html">Online Documentation</a>
 */
external class MetadataEnumValue(
    options: ConstructorOptions,
) {
    /**
     * @property [value] The integer value.
     * @property [name] The name of the enum value.
     * @property [description] The description of the enum value.
     * @property [extras] Extra user-defined properties.
     * @property [extensions] An object containing extensions.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val value: Double
        val name: String
        val description: String?
        val extras: JsAny?
        val extensions: JsAny?
    }

    /**
     * The integer value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnumValue.html#value">Online Documentation</a>
     */
    val value: Double

    /**
     * The name of the enum value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnumValue.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The description of the enum value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnumValue.html#description">Online Documentation</a>
     */
    val description: String

    /**
     * Extra user-defined properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnumValue.html#extras">Online Documentation</a>
     */
    val extras: JsAny

    /**
     * An object containing extensions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataEnumValue.html#extensions">Online Documentation</a>
     */
    val extensions: JsAny
}
