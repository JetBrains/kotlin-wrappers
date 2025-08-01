// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny
import js.core.JsString
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

/**
 * A schema containing classes and enums.
 *
 * See the [3D Metadata Specification](https://github.com/CesiumGS/3d-tiles/tree/main/specification/Metadata) for 3D Tiles
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataSchema.html">Online Documentation</a>
 */
external class MetadataSchema(
    options: ConstructorOptions,
) {
    /**
     * @property [id] The ID of the schema
     * @property [name] The name of the schema.
     * @property [description] The description of the schema.
     * @property [version] The application-specific version of the schema.
     * @property [classes] Classes defined in the schema, where each key is the class ID.
     * @property [enums] Enums defined in the schema, where each key is the enum ID.
     * @property [extras] Extra user-defined properties.
     * @property [extensions] An object containing extensions.
     */
    @JsPlainObject
    interface ConstructorOptions {
        val id: String?
        val name: String?
        val description: String?
        val version: String?
        val classes: ReadonlyRecord<JsString, MetadataClass>?
        val enums: ReadonlyRecord<JsString, MetadataEnum>?
        val extras: JsAny?
        val extensions: JsAny?
    }

    /**
     * Classes defined in the schema.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataSchema.html#classes">Online Documentation</a>
     */
    val classes: ReadonlyRecord<JsString, MetadataClass>

    /**
     * Enums defined in the schema.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataSchema.html#enums">Online Documentation</a>
     */
    val enums: ReadonlyRecord<JsString, MetadataEnum>

    /**
     * The ID of the schema.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataSchema.html#id">Online Documentation</a>
     */
    val id: String

    /**
     * The name of the schema.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataSchema.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The description of the schema.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataSchema.html#description">Online Documentation</a>
     */
    val description: String

    /**
     * The application-specific version of the schema.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataSchema.html#version">Online Documentation</a>
     */
    val version: String

    /**
     * Extra user-defined properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataSchema.html#extras">Online Documentation</a>
     */
    val extras: JsAny

    /**
     * An object containing extensions.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/MetadataSchema.html#extensions">Online Documentation</a>
     */
    val extensions: JsAny
}
