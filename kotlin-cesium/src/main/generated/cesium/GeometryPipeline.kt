// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Content pipeline functions for geometries.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html">Online Documentation</a>
 */
external object GeometryPipeline {
    /**
     * Converts a geometry's triangle indices to line indices.  If the geometry has an `indices`
     * and its `primitiveType` is `TRIANGLES`, `TRIANGLE_STRIP`,
     * `TRIANGLE_FAN`, it is converted to `LINES`; otherwise, the geometry is not changed.
     *
     * This is commonly used to create a wireframe geometry for visual debugging.
     * ```
     * geometry = GeometryPipeline.toWireframe(geometry);
     * ```
     * @param [geometry] The geometry to modify.
     * @return The modified `geometry` argument, with its triangle indices converted to lines.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.toWireframe">Online Documentation</a>
     */
    fun toWireframe(geometry: Geometry): Geometry

    /**
     * Creates a new [Geometry] with `LINES` representing the provided
     * attribute (`attributeName`) for the provided geometry.  This is used to
     * visualize vector attributes like normals, tangents, and bitangents.
     * ```
     * const geometry = GeometryPipeline.createLineSegmentsForVectors(instance.geometry, 'bitangent', 100000.0);
     * ```
     * @param [geometry] The `Geometry` instance with the attribute.
     * @param [attributeName] The name of the attribute.
     *   Default value - `'normal'`
     * @param [length] The length of each line segment in meters.  This can be negative to point the vector in the opposite direction.
     *   Default value - `10000.0`
     * @return A new `Geometry` instance with line segments for the vector.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.createLineSegmentsForVectors">Online Documentation</a>
     */
    fun createLineSegmentsForVectors(
        geometry: Geometry,
        attributeName: String? = definedExternally,
        length: Int? = definedExternally,
    ): Geometry

    /**
     * Creates an object that maps attribute names to unique locations (indices)
     * for matching vertex attributes and shader programs.
     * ```
     * const attributeLocations = GeometryPipeline.createAttributeLocations(geometry);
     * // Example output
     * // {
     * //   'position' : 0,
     * //   'normal' : 1
     * // }
     * ```
     * @param [geometry] The geometry, which is not modified, to create the object for.
     * @return An object with attribute name / index pairs.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.createAttributeLocations">Online Documentation</a>
     */
    fun createAttributeLocations(geometry: Geometry): Any

    /**
     * Reorders a geometry's attributes and `indices` to achieve better performance from the GPU's pre-vertex-shader cache.
     * ```
     * geometry = GeometryPipeline.reorderForPreVertexCache(geometry);
     * ```
     * @param [geometry] The geometry to modify.
     * @return The modified `geometry` argument, with its attributes and indices reordered for the GPU's pre-vertex-shader cache.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.reorderForPreVertexCache">Online Documentation</a>
     */
    fun reorderForPreVertexCache(geometry: Geometry): Geometry

    /**
     * Reorders a geometry's `indices` to achieve better performance from the GPU's
     * post vertex-shader cache by using the Tipsify algorithm.  If the geometry `primitiveType`
     * is not `TRIANGLES` or the geometry does not have an `indices`, this function has no effect.
     * ```
     * geometry = GeometryPipeline.reorderForPostVertexCache(geometry);
     * ```
     * @param [geometry] The geometry to modify.
     * @param [cacheCapacity] The number of vertices that can be held in the GPU's vertex cache.
     *   Default value - `24`
     * @return The modified `geometry` argument, with its indices reordered for the post-vertex-shader cache.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.reorderForPostVertexCache">Online Documentation</a>
     */
    fun reorderForPostVertexCache(
        geometry: Geometry,
        cacheCapacity: Int? = definedExternally,
    ): Geometry

    /**
     * Splits a geometry into multiple geometries, if necessary, to ensure that indices in the
     * `indices` fit into unsigned shorts.  This is used to meet the WebGL requirements
     * when unsigned int indices are not supported.
     *
     * If the geometry does not have any `indices`, this function has no effect.
     * ```
     * const geometries = GeometryPipeline.fitToUnsignedShortIndices(geometry);
     * ```
     * @param [geometry] The geometry to be split into multiple geometries.
     * @return An array of geometries, each with indices that fit into unsigned shorts.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.fitToUnsignedShortIndices">Online Documentation</a>
     */
    fun fitToUnsignedShortIndices(geometry: Geometry): ReadonlyArray<Geometry>

    /**
     * Projects a geometry's 3D `position` attribute to 2D, replacing the `position`
     * attribute with separate `position3D` and `position2D` attributes.
     *
     * If the geometry does not have a `position`, this function has no effect.
     * ```
     * geometry = GeometryPipeline.projectTo2D(geometry, 'position', 'position3D', 'position2D');
     * ```
     * @param [geometry] The geometry to modify.
     * @param [attributeName] The name of the attribute.
     * @param [attributeName3D] The name of the attribute in 3D.
     * @param [attributeName2D] The name of the attribute in 2D.
     * @param [projection] The projection to use.
     *   Default value - [GeographicProjection()][GeographicProjection]
     * @return The modified `geometry` argument with `position3D` and `position2D` attributes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.projectTo2D">Online Documentation</a>
     */
    fun projectTo2D(
        geometry: Geometry,
        attributeName: String,
        attributeName3D: String,
        attributeName2D: String,
        projection: Any? = definedExternally,
    ): Geometry

    /**
     * Encodes floating-point geometry attribute values as two separate attributes to improve
     * rendering precision.
     *
     * This is commonly used to create high-precision position vertex attributes.
     * ```
     * geometry = GeometryPipeline.encodeAttribute(geometry, 'position3D', 'position3DHigh', 'position3DLow');
     * ```
     * @param [geometry] The geometry to modify.
     * @param [attributeName] The name of the attribute.
     * @param [attributeHighName] The name of the attribute for the encoded high bits.
     * @param [attributeLowName] The name of the attribute for the encoded low bits.
     * @return The modified `geometry` argument, with its encoded attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.encodeAttribute">Online Documentation</a>
     */
    fun encodeAttribute(
        geometry: Geometry,
        attributeName: String,
        attributeHighName: String,
        attributeLowName: String,
    ): Geometry

    /**
     * Transforms a geometry instance to world coordinates.  This changes
     * the instance's `modelMatrix` to [Matrix4.IDENTITY] and transforms the
     * following attributes if they are present: `position`, `normal`,
     * `tangent`, and `bitangent`.
     * ```
     * GeometryPipeline.transformToWorldCoordinates(instance);
     * ```
     * @param [instance] The geometry instance to modify.
     * @return The modified `instance` argument, with its attributes transforms to world coordinates.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.transformToWorldCoordinates">Online Documentation</a>
     */
    fun transformToWorldCoordinates(instance: GeometryInstance): GeometryInstance

    /**
     * Computes per-vertex normals for a geometry containing `TRIANGLES` by averaging the normals of
     * all triangles incident to the vertex.  The result is a new `normal` attribute added to the geometry.
     * This assumes a counter-clockwise winding order.
     * ```
     * GeometryPipeline.computeNormal(geometry);
     * ```
     * @param [geometry] The geometry to modify.
     * @return The modified `geometry` argument with the computed `normal` attribute.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.computeNormal">Online Documentation</a>
     */
    fun computeNormal(geometry: Geometry): Geometry

    /**
     * Computes per-vertex tangents and bitangents for a geometry containing `TRIANGLES`.
     * The result is new `tangent` and `bitangent` attributes added to the geometry.
     * This assumes a counter-clockwise winding order.
     *
     * Based on <a href="http://www.terathon.com/code/tangent.html">Computing Tangent Space Basis Vectors
     * for an Arbitrary Mesh</a> by Eric Lengyel.
     * ```
     * GeometryPipeline.computeTangentAndBiTangent(geometry);
     * ```
     * @param [geometry] The geometry to modify.
     * @return The modified `geometry` argument with the computed `tangent` and `bitangent` attributes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.computeTangentAndBitangent">Online Documentation</a>
     */
    fun computeTangentAndBitangent(geometry: Geometry): Geometry

    /**
     * Compresses and packs geometry normal attribute values to save memory.
     * ```
     * geometry = GeometryPipeline.compressVertices(geometry);
     * ```
     * @param [geometry] The geometry to modify.
     * @return The modified `geometry` argument, with its normals compressed and packed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeometryPipeline.html#.compressVertices">Online Documentation</a>
     */
    fun compressVertices(geometry: Geometry): Geometry
}
