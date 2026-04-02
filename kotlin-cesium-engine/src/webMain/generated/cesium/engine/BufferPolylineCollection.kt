// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

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
open external class BufferPolylineCollection {
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
