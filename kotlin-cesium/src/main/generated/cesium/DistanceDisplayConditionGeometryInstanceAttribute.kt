// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.typedarrays.Float32Array

/**
 * Value and type information for per-instance geometry attribute that determines if the geometry instance has a distance display condition.
 * ```
 * const instance = new GeometryInstance({
 *   geometry : new BoxGeometry({
 *     vertexFormat : VertexFormat.POSITION_AND_NORMAL,
 *     minimum : new Cartesian3(-250000.0, -250000.0, -250000.0),
 *     maximum : new Cartesian3(250000.0, 250000.0, 250000.0)
 *   }),
 *   modelMatrix : Matrix4.multiplyByTranslation(Transforms.eastNorthUpToFixedFrame(
 *     Cartesian3.fromDegrees(-75.59777, 40.03883)), new Cartesian3(0.0, 0.0, 1000000.0), new Matrix4()),
 *   id : 'box',
 *   attributes : {
 *     distanceDisplayCondition : new DistanceDisplayConditionGeometryInstanceAttribute(100.0, 10000.0)
 *   }
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayConditionGeometryInstanceAttribute.html">Online Documentation</a>
 *
 * @constructor
 * @param [near] The near distance.
 *   Default value - `0.0`
 * @param [far] The far distance.
 *   Default value - [Number.MAX_VALUE]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayConditionGeometryInstanceAttribute.html">Online Documentation</a>
 */
external class DistanceDisplayConditionGeometryInstanceAttribute(
    near: Double? = definedExternally,
    far: Double? = definedExternally,
) {
    /**
     * The values for the attributes stored in a typed array.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayConditionGeometryInstanceAttribute.html#value">Online Documentation</a>
     */
    var value: Float32Array

    /**
     * The datatype of each component in the attribute, e.g., individual elements in
     * [DistanceDisplayConditionGeometryInstanceAttribute.value].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayConditionGeometryInstanceAttribute.html#componentDatatype">Online Documentation</a>
     */
    val componentDatatype: ComponentDatatype

    /**
     * The number of components in the attributes, i.e., [DistanceDisplayConditionGeometryInstanceAttribute.value].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayConditionGeometryInstanceAttribute.html#componentsPerAttribute">Online Documentation</a>
     */
    val componentsPerAttribute: Int

    /**
     * When `true` and `componentDatatype` is an integer format,
     * indicate that the components should be mapped to the range [0, 1] (unsigned)
     * or [-1, 1] (signed) when they are accessed as floating-point for rendering.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayConditionGeometryInstanceAttribute.html#normalize">Online Documentation</a>
     */
    val normalize: Boolean

    companion object {
        /**
         * Creates a new [DistanceDisplayConditionGeometryInstanceAttribute] instance given the provided an enabled flag and [DistanceDisplayCondition].
         * ```
         * const distanceDisplayCondition = new DistanceDisplayCondition(100.0, 10000.0);
         * const instance = new GeometryInstance({
         *   geometry : geometry,
         *   attributes : {
         *     distanceDisplayCondition : fromDistanceDisplayCondition(distanceDisplayCondition)
         *   }
         * });
         * ```
         * @param [distanceDisplayCondition] The distance display condition.
         * @return The new [DistanceDisplayConditionGeometryInstanceAttribute] instance.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayConditionGeometryInstanceAttribute.html#.fromDistanceDisplayCondition">Online Documentation</a>
         */
        fun fromDistanceDisplayCondition(distanceDisplayCondition: DistanceDisplayCondition): DistanceDisplayConditionGeometryInstanceAttribute

        /**
         * Converts a distance display condition to a typed array that can be used to assign a distance display condition attribute.
         * ```
         * const attributes = primitive.getGeometryInstanceAttributes('an id');
         * attributes.distanceDisplayCondition = DistanceDisplayConditionGeometryInstanceAttribute.toValue(distanceDisplayCondition, attributes.distanceDisplayCondition);
         * ```
         * @param [distanceDisplayCondition] The distance display condition value.
         * @param [result] The array to store the result in, if undefined a new instance will be created.
         * @return The modified result parameter or a new instance if result was undefined.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DistanceDisplayConditionGeometryInstanceAttribute.html#.toValue">Online Documentation</a>
         */
        fun toValue(
            distanceDisplayCondition: DistanceDisplayCondition,
            result: Float32Array? = definedExternally,
        ): Float32Array
    }
}
