// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A utility object for tracking an entity with the camera.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityView.html">Online Documentation</a>
 *
 * @constructor
 * @property [entity] The entity to track with the camera.
 * @property [scene] The scene to use.
 * @property [ellipsoid] The ellipsoid to use for orienting the camera.
 *   Default value - [Ellipsoid.WGS84]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityView.html">Online Documentation</a>
 */
external class EntityView(
    var entity: Entity,
    var scene: Scene,
    var ellipsoid: Ellipsoid = definedExternally,
) {
    /**
     * The bounding sphere of the object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityView.html#boundingSphere">Online Documentation</a>
     */
    var boundingSphere: BoundingSphere

    /**
     * Should be called each animation frame to update the camera
     * to the latest settings.
     * @param [time] The current animation time.
     * @param [boundingSphere] bounding sphere of the object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityView.html#update">Online Documentation</a>
     */
    fun update(
        time: JulianDate,
        boundingSphere: BoundingSphere? = definedExternally,
    )

    companion object {
        /**
         * Gets or sets a camera offset that will be used to
         * initialize subsequent EntityViews.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityView.html#.defaultOffset3D">Online Documentation</a>
         */
        var defaultOffset3D: Cartesian3
    }
}
