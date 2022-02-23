// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Entity instances aggregate multiple forms of visualization into a single high-level object.
 * They can be created manually and added to [Viewer.entities] or be produced by
 * data sources, such as [CzmlDataSource] and [GeoJsonDataSource].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html">Online Documentation</a>
 */
external class Entity {
    /**
     * Gets or sets the entity collection that this entity belongs to.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#entityCollection">Online Documentation</a>
     */
    var entityCollection: EntityCollection

    /**
     * The availability, if any, associated with this object.
     * If availability is undefined, it is assumed that this object's
     * other properties will return valid data for any provided time.
     * If availability exists, the objects other properties will only
     * provide valid data if queried within the given interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#availability">Online Documentation</a>
     */
    var availability: TimeIntervalCollection?

    /**
     * Gets the unique ID associated with this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#id">Online Documentation</a>
     */
    var id: String

    /**
     * Gets the event that is raised whenever a property or sub-property is changed or modified.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: Event

    /**
     * Gets or sets the name of the object.  The name is intended for end-user
     * consumption and does not need to be unique.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#name">Online Documentation</a>
     */
    var name: String?

    /**
     * Gets or sets whether this entity should be displayed. When set to true,
     * the entity is only displayed if the parent entity's show property is also true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets whether this entity is being displayed, taking into account
     * the visibility of any ancestor entities.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#isShowing">Online Documentation</a>
     */
    var isShowing: Boolean

    /**
     * Gets or sets the parent object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#parent">Online Documentation</a>
     */
    var parent: Entity?

    /**
     * Gets the names of all properties registered on this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#propertyNames">Online Documentation</a>
     */
    var propertyNames: Array<out String>

    /**
     * Gets or sets the billboard.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#billboard">Online Documentation</a>
     */
    var billboard: BillboardGraphics?

    /**
     * Gets or sets the box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#box">Online Documentation</a>
     */
    var box: BoxGraphics?

    /**
     * Gets or sets the corridor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#corridor">Online Documentation</a>
     */
    var corridor: CorridorGraphics?

    /**
     * Gets or sets the cylinder.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#cylinder">Online Documentation</a>
     */
    var cylinder: CylinderGraphics?

    /**
     * Gets or sets the description.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#description">Online Documentation</a>
     */
    var description: Property?

    /**
     * Gets or sets the ellipse.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#ellipse">Online Documentation</a>
     */
    var ellipse: EllipseGraphics?

    /**
     * Gets or sets the ellipsoid.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#ellipsoid">Online Documentation</a>
     */
    var ellipsoid: EllipsoidGraphics?

    /**
     * Gets or sets the label.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#label">Online Documentation</a>
     */
    var label: LabelGraphics?

    /**
     * Gets or sets the model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#model">Online Documentation</a>
     */
    var model: ModelGraphics?

    /**
     * Gets or sets the tileset.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#tileset">Online Documentation</a>
     */
    var tileset: Cesium3DTilesetGraphics?

    /**
     * Gets or sets the orientation.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#orientation">Online Documentation</a>
     */
    var orientation: Property?

    /**
     * Gets or sets the path.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#path">Online Documentation</a>
     */
    var path: PathGraphics?

    /**
     * Gets or sets the plane.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#plane">Online Documentation</a>
     */
    var plane: PlaneGraphics?

    /**
     * Gets or sets the point graphic.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#point">Online Documentation</a>
     */
    var point: PointGraphics?

    /**
     * Gets or sets the polygon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#polygon">Online Documentation</a>
     */
    var polygon: PolygonGraphics?

    /**
     * Gets or sets the polyline.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#polyline">Online Documentation</a>
     */
    var polyline: PolylineGraphics?

    /**
     * Gets or sets the polyline volume.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#polylineVolume">Online Documentation</a>
     */
    var polylineVolume: PolylineVolumeGraphics?

    /**
     * Gets or sets the bag of arbitrary properties associated with this entity.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#properties">Online Documentation</a>
     */
    var properties: PropertyBag?

    /**
     * Gets or sets the position.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#position">Online Documentation</a>
     */
    var position: PositionProperty?

    /**
     * Gets or sets the rectangle.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#rectangle">Online Documentation</a>
     */
    var rectangle: RectangleGraphics?

    /**
     * Gets or sets the suggested initial offset when tracking this object.
     * The offset is typically defined in the east-north-up reference frame,
     * but may be another frame depending on the object's velocity.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#viewFrom">Online Documentation</a>
     */
    var viewFrom: Property?

    /**
     * Gets or sets the wall.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#wall">Online Documentation</a>
     */
    var wall: WallGraphics?

    /**
     * Given a time, returns true if this object should have data during that time.
     * @param [time] The time to check availability for.
     * @return true if the object should have data during the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#isAvailable">Online Documentation</a>
     */
    fun isAvailable(time: JulianDate): Boolean

    /**
     * Adds a property to this object.  Once a property is added, it can be
     * observed with [Entity.definitionChanged] and composited
     * with [CompositeEntityCollection]
     * @param [propertyName] The name of the property to add.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#addProperty">Online Documentation</a>
     */
    fun addProperty(propertyName: String)

    /**
     * Removed a property previously added with addProperty.
     * @param [propertyName] The name of the property to remove.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#removeProperty">Online Documentation</a>
     */
    fun removeProperty(propertyName: String)

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#merge">Online Documentation</a>
     */
    fun merge(source: Entity)

    /**
     * Computes the model matrix for the entity's transform at specified time. Returns undefined if orientation or position
     * are undefined.
     * @param [time] The time to retrieve model matrix for.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new Matrix4 instance if one was not provided. Result is undefined if position or orientation are undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#computeModelMatrix">Online Documentation</a>
     */
    fun computeModelMatrix(
        time: JulianDate,
        result: Matrix4? = definedExternally,
    ): Matrix4

    companion object {
        /**
         * Checks if the given Scene supports materials besides Color on Entities draped on terrain or 3D Tiles.
         * If this feature is not supported, Entities with non-color materials but no `height` will
         * instead be rendered as if height is 0.
         * @param [scene] The current scene.
         * @return Whether or not the current scene supports materials for entities on terrain.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#.supportsMaterialsforEntitiesOnTerrain">Online Documentation</a>
         */
        fun supportsMaterialsforEntitiesOnTerrain(scene: Scene): Boolean

        /**
         * Checks if the given Scene supports polylines clamped to terrain or 3D Tiles.
         * If this feature is not supported, Entities with PolylineGraphics will be rendered with vertices at
         * the provided heights and using the `arcType` parameter instead of clamped to the ground.
         * @param [scene] The current scene.
         * @return Whether or not the current scene supports polylines on terrain or 3D TIles.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Entity.html#.supportsPolylinesOnTerrain">Online Documentation</a>
         */
        fun supportsPolylinesOnTerrain(scene: Scene): Boolean
    }
}

inline fun Entity(
    block: Entity.() -> Unit,
): Entity =
    Entity().apply(block)
