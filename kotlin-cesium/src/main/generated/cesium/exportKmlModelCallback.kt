// Automatically generated - do not modify!

package cesium

/**
 * Since KML does not support glTF models, this callback is required to specify what URL to use for the model in the KML document.
 * It can also be used to add additional files to the `externalFiles` object, which is the list of files embedded in the exported KMZ,
 * or otherwise returned with the KML string when exporting.
 * @param [model] The ModelGraphics instance for an Entity.
 * @param [time] The time that any properties should use to get the value.
 * @param [externalFiles] An object that maps a filename to a Blob or a Promise that resolves to a Blob.
 */
typealias exportKmlModelCallback = (model: ModelGraphics, time: JulianDate, externalFiles: Any) -> String
