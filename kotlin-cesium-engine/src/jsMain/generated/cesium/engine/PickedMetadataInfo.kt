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
sealed external interface PickedMetadataInfo {
    var schemaId: String?
    var className: String
    var propertyName: String
    var classProperty: MetadataClassProperty
}
