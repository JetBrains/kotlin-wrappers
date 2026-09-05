// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Collection of polylines held in ArrayBuffer storage for performance and memory optimization.
 *
 * Default buffer memory allocation is arbitrary, and collections cannot be resized,
 * so specific per-buffer capacities should be provided in the collection
 * constructor when available.
 * ```
 * const collection = new BufferPolylineCollection({
 *   primitiveCountMax: 1024,
 *   vertexCountMax: 4096,
 * });
 *
 * const polyline = new BufferPolyline();
 * const material = new BufferPolylineMaterial({color: Color.WHITE});
 *
 * // Create a new polyline, temporarily bound to 'polyline' local variable.
 * collection.add({
 *   positions: new Float64Array([ ... ]),
 *   material,
 * }, polyline);
 *
 * // Iterate over all polylines in collection, temporarily binding 'polyline'
 * // local variable to each, and updating polyline material.
 * for (let i = 0; i < collection.primitiveCount; i++) {
 *   collection.get(i, polyline);
 *   polyline.setMaterial(material);
 * }
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolylineCollection.html">Online Documentation</a>
 */
open external class BufferPolylineCollection(
    options: ConstructorOptions? = definedExternally,
) : BufferPrimitiveCollection<BufferPolyline> {
    /**
     * @property [modelMatrix] Transforms geometry from model to world coordinates.
     *   Default value - [Matrix4.IDENTITY]
     * @property [allowPicking] When `true`, primitives are pickable with [Scene.pick]. When `false`, memory and initialization cost are lower.
     *   Default value - `false`
     * @property [boundingVolume] Bounding volume, in world space, for the collection.
     * @property [widthUnits] Unit of polyline widths in this collection:
     *   `"pixels"` on the screen, or `"meters"` in world space. A clamped
     *   [HeightReference] measures those meters on the ellipsoid surface, so elevation and terrain
     *   slope stretch the drawn width.
     *   Default value - `"pixels"`
     */
    @JsPlainObject
    interface ConstructorOptions {
        val modelMatrix: Matrix4?
        val primitiveCountMax: Double?
        val vertexCountMax: Double?
        val show: Boolean?
        val positionDatatype: ComponentDatatype?
        val positionNormalized: Boolean?
        val allowPicking: Boolean?
        val boundingVolume: BoundingSphere?
        val debugShowBoundingVolume: Boolean?
        val blendOption: BlendOption?
        val heightReference: HeightReference?
        val widthUnits: JsAny /* "pixels" | "meters" */?
    }

    /**
     * Unit of polyline widths in this collection: `"pixels"` on the screen, or
     * `"meters"` in world space, measured on the ellipsoid surface when clamped.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolylineCollection.html#widthUnits">Online Documentation</a>
     */
    val widthUnits: JsAny /* "pixels" | "meters" */

    /**
     * Adds a new polyline to the collection, with the specified options. A
     * [BufferPolyline] instance is linked to the new polyline, using
     * the 'result' argument if given, or a new instance if not. For repeated
     * calls, prefer to reuse a single BufferPolyline instance rather than
     * allocating a new instance on each call.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BufferPolylineCollection.html#add">Online Documentation</a>
     */
    fun add(
        options: BufferPolylineOptions,
        result: BufferPolyline,
    ): BufferPolyline
}
