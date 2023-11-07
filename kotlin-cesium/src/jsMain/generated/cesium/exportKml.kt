// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.promise.Promise

/**
 * Exports an EntityCollection as a KML document. Only Point, Billboard, Model, Path, Polygon, Polyline geometries
 * will be exported. Note that there is not a 1 to 1 mapping of Entity properties to KML Feature properties. For
 * example, entity properties that are time dynamic but cannot be dynamic in KML are exported with their values at
 * options.time or the beginning of the EntityCollection's time interval if not specified. For time-dynamic properties
 * that are supported in KML, we use the samples if it is a [SampledProperty] otherwise we sample the value using
 * the options.sampleDuration. Point, Billboard, Model and Path geometries with time-dynamic positions will be exported
 * as gx:Track Features. Not all Materials are representable in KML, so for more advanced Materials just the primary
 * color is used. Canvas objects are exported as PNG images.
 * ```
 * exportKml({
 *      entities: entityCollection
 *  })
 *   .then(function(result) {
 *     // The XML string is in result.kml
 *
 *     const externalFiles = result.externalFiles
 *     for(const file in externalFiles) {
 *       // file is the name of the file used in the KML document as the href
 *       // externalFiles[file] is a blob with the contents of the file
 *     }
 *   });
 * ```
 * @return A promise that resolved to an object containing the KML string and a dictionary of external file blobs, or a kmz file as a blob if options.kmz is true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#exportKml">Online Documentation</a>
 */
external fun exportKml(options: ExportKmlOptions): Promise<dynamic>

/**
 * @property [entities] The EntityCollection to export as KML.
 * @property [ellipsoid] The ellipsoid for the output file.
 *   Default value - [Ellipsoid.WGS84]
 * @property [modelCallback] A callback that will be called with a [ModelGraphics] instance and should return the URI to use in the KML. Required if a model exists in the entity collection.
 * @property [time] The time value to use to get properties that are not time varying in KML.
 *   Default value - `entities.computeAvailability().start`
 * @property [defaultAvailability] The interval that will be sampled if an entity doesn't have an availability.
 *   Default value - `entities.computeAvailability()`
 * @property [sampleDuration] The number of seconds to sample properties that are varying in KML.
 *   Default value - `60`
 * @property [kmz] If true KML and external files will be compressed into a kmz file.
 *   Default value - `false`
 */
external interface ExportKmlOptions {
    var entities: EntityCollection
    var ellipsoid: Ellipsoid?
    var modelCallback: exportKmlModelCallback?
    var time: JulianDate?
    var defaultAvailability: TimeInterval?
    var sampleDuration: Int?
    var kmz: Boolean?
}
