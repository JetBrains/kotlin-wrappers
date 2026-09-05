// Automatically generated - do not modify!

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * @property [heightReference] Allows clamping (draping)
 *   polylines and polygons on terrain and 3D Tiles. Point clamping is not currently supported.
 *   Default value - [HeightReference.NONE]
 * @property [scene] Required for primitives that use a clamping [HeightReference].
 */
@JsPlainObject
external interface GeoJsonPrimitiveConstructorOptions {
    val geoJson: JsAny?
    val url: Resource?
    val ellipsoid: Ellipsoid?
    val allowPicking: Boolean?
    val show: Boolean?
    val pickObjectFactory: Function<*>?
    val heightReference: HeightReference?
    val scene: Scene?
}
