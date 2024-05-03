// Automatically generated - do not modify!

package cesium.engine

import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import web.blob.Blob

/**
 * @property [kml] The generated KML.
 * @property [externalFiles] An object dictionary of external files
 */
@JsPlainObject
sealed external interface exportKmlResultKml {
    var kml: String
    var externalFiles: ReadonlyRecord<String, Blob>
}
