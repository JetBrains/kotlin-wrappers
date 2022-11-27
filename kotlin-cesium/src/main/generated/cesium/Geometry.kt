// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray

/**
 * A geometry representation with attributes forming vertices and optional index data
 * defining primitives.  Geometries and an [Appearance], which describes the shading,
 * can be assigned to a [Primitive] for visualization.  A `Primitive` can
 * be created from many heterogeneous - in many cases - geometries for performance.
 *
 * Geometries can be transformed and optimized using functions in [GeometryPipeline].
 * ```
 * // Create geometry with a position attribute and indexed lines.
 * const positions = new Float64Array([
 *   0.0, 0.0, 0.0,
 *   7500000.0, 0.0, 0.0,
 *   0.0, 7500000.0, 0.0
 * ]);
 *
 * const geometry = new Geometry({
 *   attributes : {
 *     position : new GeometryAttribute({
 *       componentDatatype : ComponentDatatype.DOUBLE,
 *       componentsPerAttribute : 3,
 *       values : positions
 *     })
 *   },
 *   indices : new Uint16Array([0, 1, 1, 2, 2, 0]),
 *   primitiveType : PrimitiveType.LINES,
 *   boundingSphere : BoundingSphere.fromVertices(positions)
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geometry.html">Online Documentation</a>
 */
external class Geometry(options: ConstructorOptions) {
    /**
     * @property [attributes] Attributes, which make up the geometry's vertices.
     * @property [primitiveType] The type of primitives in the geometry.
     *   Default value - [PrimitiveType.TRIANGLES]
     * @property [indices] Optional index data that determines the primitives in the geometry.
     * @property [boundingSphere] An optional bounding sphere that fully enclosed the geometry.
     */
    interface ConstructorOptions {
        var attributes: GeometryAttributes
        var primitiveType: PrimitiveType?
        var indices: dynamic
        var boundingSphere: BoundingSphere?
    }

    /**
     * Attributes, which make up the geometry's vertices.  Each property in this object corresponds to a
     * [GeometryAttribute] containing the attribute's data.
     *
     * Attributes are always stored non-interleaved in a Geometry.
     *
     * There are reserved attribute names with well-known semantics.  The following attributes
     * are created by a Geometry (depending on the provided [VertexFormat].
     * - `position` - 3D vertex position.  64-bit floating-point (for precision).  3 components per attribute.  See [VertexFormat.position].
     * - `normal` - Normal (normalized), commonly used for lighting.  32-bit floating-point.  3 components per attribute.  See [VertexFormat.normal].
     * - `st` - 2D texture coordinate.  32-bit floating-point.  2 components per attribute.  See [VertexFormat.st].
     * - `bitangent` - Bitangent (normalized), used for tangent-space effects like bump mapping.  32-bit floating-point.  3 components per attribute.  See [VertexFormat.bitangent].
     * - `tangent` - Tangent (normalized), used for tangent-space effects like bump mapping.  32-bit floating-point.  3 components per attribute.  See [VertexFormat.tangent].
     *
     * The following attribute names are generally not created by a Geometry, but are added
     * to a Geometry by a [Primitive] or [GeometryPipeline] functions to prepare
     * the geometry for rendering.
     * - `position3DHigh` - High 32 bits for encoded 64-bit position computed with [GeometryPipeline.encodeAttribute].  32-bit floating-point.  4 components per attribute.
     * - `position3DLow` - Low 32 bits for encoded 64-bit position computed with [GeometryPipeline.encodeAttribute].  32-bit floating-point.  4 components per attribute.
     * - `position3DHigh` - High 32 bits for encoded 64-bit 2D (Columbus view) position computed with [GeometryPipeline.encodeAttribute].  32-bit floating-point.  4 components per attribute.
     * - `position2DLow` - Low 32 bits for encoded 64-bit 2D (Columbus view) position computed with [GeometryPipeline.encodeAttribute].  32-bit floating-point.  4 components per attribute.
     * - `color` - RGBA color (normalized) usually from [GeometryInstance.color].  32-bit floating-point.  4 components per attribute.
     * - `pickColor` - RGBA color used for picking.  32-bit floating-point.  4 components per attribute.
     * ```
     * geometry.attributes.position = new GeometryAttribute({
     *   componentDatatype : ComponentDatatype.FLOAT,
     *   componentsPerAttribute : 3,
     *   values : new Float32Array(0)
     * });
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geometry.html#attributes">Online Documentation</a>
     */
    var attributes: GeometryAttributes

    /**
     * Optional index data that - along with [Geometry.primitiveType] -
     * determines the primitives in the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geometry.html#indices">Online Documentation</a>
     */
    var indices: ReadonlyArray<Any>

    /**
     * The type of primitives in the geometry.  This is most often [PrimitiveType.TRIANGLES],
     * but can varying based on the specific geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geometry.html#primitiveType">Online Documentation</a>
     */
    var primitiveType: PrimitiveType

    /**
     * An optional bounding sphere that fully encloses the geometry.  This is
     * commonly used for culling.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geometry.html#boundingSphere">Online Documentation</a>
     */
    var boundingSphere: BoundingSphere

    companion object {
        /**
         * Computes the number of vertices in a geometry.  The runtime is linear with
         * respect to the number of attributes in a vertex, not the number of vertices.
         * ```
         * const numVertices = Geometry.computeNumberOfVertices(geometry);
         * ```
         * @param [geometry] The geometry.
         * @return The number of vertices in the geometry.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Geometry.html#.computeNumberOfVertices">Online Documentation</a>
         */
        fun computeNumberOfVertices(geometry: Geometry): Int
    }
}

inline fun Geometry(
    block: Geometry.ConstructorOptions.() -> Unit,
): Geometry {
    val options: Geometry.ConstructorOptions = js("({})")
    block(options)
    return Geometry(options)
}
