// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyRecord

/**
 * A metadata class.
 *
 * See the [3D Metadata Specification](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Metadata) for 3D Tiles
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html">Online Documentation</a>
 */
external class MetadataClass(options: ConstructorOptions) {
    /**
     * @property [id] The ID of the class.
     * @property [name] The name of the class.
     * @property [description] The description of the class.
     * @property [properties] The class properties, where each key is the property ID.
     * @property [extras] Extra user-defined properties.
     * @property [extensions] An object containing extensions.
     */
    interface ConstructorOptions {
        var id: String
        var name: String?
        var description: String?
        var properties: ReadonlyRecord<String, MetadataClassProperty>?
        var extras: Any?
        var extensions: Any?
    }

    /**
     * The class properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#properties">Online Documentation</a>
     */
    val properties: ReadonlyRecord<String, MetadataClassProperty>

    /**
     * The ID of the class.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * The name of the class.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The description of the class.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#description">Online Documentation</a>
     */
    val description: String

    /**
     * Extra user-defined properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#extras">Online Documentation</a>
     */
    val extras: Any

    /**
     * An object containing extensions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataClass.html#extensions">Online Documentation</a>
     */
    val extensions: Any
}

inline fun MetadataClass(
    block: MetadataClass.ConstructorOptions.() -> Unit,
): MetadataClass {
    val options: MetadataClass.ConstructorOptions = js("({})")
    block(options)
    return MetadataClass(options)
}
