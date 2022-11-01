// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * This class implements an I3S Geometry. Each I3SGeometry
 * generates an in memory glTF to be used as content for a Cesium3DTile
 *
 * Do not construct this directly, instead access tiles through [I3SNode].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SGeometry.html">Online Documentation</a>
 */
sealed external class I3SGeometry {
    /**
     * Gets the resource for the geometry
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SGeometry.html#resource">Online Documentation</a>
     */
    val resource: Resource

    /**
     * Gets the I3S data for this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SGeometry.html#data">Online Documentation</a>
     */
    val data: Any

    /**
     * Gets the custom attributes of the geometry.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SGeometry.html#customAttributes">Online Documentation</a>
     */
    val customAttributes: Any

    /**
     * Find a triangle touching the point [px, py, pz], then return the vertex closest to the search point
     * @param [px] The x component of the point to query
     * @param [py] The y component of the point to query
     * @param [pz] The z component of the point to query
     * @return A structure containing the index of the closest point,
     *   the squared distance from the queried point to the point that is found,
     *   the distance from the queried point to the point that is found,
     *   the queried position in local space,
     *   the closest position in local space
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SGeometry.html#getClosestPointIndexOnTriangle">Online Documentation</a>
     */
    fun getClosestPointIndexOnTriangle(
        px: Double,
        py: Double,
        pz: Double,
    ): Any
}
