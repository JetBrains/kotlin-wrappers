// Automatically generated - do not modify!

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Information about metadata that is supposed to be picked
 * @property [schemaId] The optional ID of the metadata schema
 * @property [className] The name of the metadata class
 * @property [propertyName] The name of the metadata property
 * @property [classProperty] The metadata class property
 */
@JsPlainObject
external interface PickedMetadataInfo {
    val schemaId: String?
    val className: String
    val propertyName: String
    val classProperty: MetadataClassProperty
}
