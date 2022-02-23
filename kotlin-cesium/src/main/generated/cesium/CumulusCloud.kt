// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A cumulus cloud billboard positioned in the 3D scene, that is created and rendered using a [CloudCollection].
 * A cloud is created and its initial properties are set by calling [CloudCollection.add].
 * and [CloudCollection.remove].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CumulusCloud.html">Online Documentation</a>
 */
external class CumulusCloud {
    /**
     * Determines if this cumulus cloud will be shown.  Use this to hide or show a cloud, instead
     * of removing it and re-adding it to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CumulusCloud.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the Cartesian position of this cumulus cloud.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CumulusCloud.html#position">Online Documentation</a>
     */
    var position: Cartesian3

    /**
     * Gets or sets the scale of the cumulus cloud billboard in meters.
     * The `scale` property will affect the size of the billboard,
     * but not the cloud's actual appearance.
     *
     * To modify the cloud's appearance, modify its `maximumSize`
     * and `slice` properties.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CumulusCloud.html#scale">Online Documentation</a>
     */
    var scale: Cartesian2

    /**
     * Gets or sets the maximum size of the cumulus cloud rendered on the billboard.
     * This defines a maximum ellipsoid volume that the cloud can appear in.
     * Rather than guaranteeing a specific size, this specifies a boundary for the
     * cloud to appear in, and changing it can affect the shape of the cloud.
     * Changing the z-value of `maximumSize` has the most dramatic effect
     * on the cloud's appearance because it changes the depth of the cloud, and thus the
     * positions at which the cloud-shaping texture is sampled.
     *
     * To modify the billboard's actual size, modify the cloud's `scale` property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CumulusCloud.html#maximumSize">Online Documentation</a>
     */
    var maximumSize: Cartesian3

    /**
     * Sets the color of the cloud
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CumulusCloud.html#color">Online Documentation</a>
     */
    var color: Color

    /**
     * Gets or sets the "slice" of the cloud that is rendered on the billboard, i.e.
     * the specific cross-section of the cloud chosen for the billboard's appearance.
     * Given a value between 0 and 1, the slice specifies how deeply into the cloud
     * to intersect based on its maximum size in the z-direction.
     *
     * Due to the nature in which this slice is calculated,
     * values below `0.2` may result in cross-sections that are too small,
     * and the edge of the ellipsoid will be visible. Similarly, values above `0.7`
     * will cause the cloud to appear smaller. Values outside the range `[0.1, 0.9]`
     * should be avoided entirely because they do not produce desirable results.
     *
     * If `slice` is set to a negative number, the cloud will not render a cross-section.
     * Instead, it will render the outside of the ellipsoid that is visible. For clouds with
     * small values of `maximumSize.z`, this can produce good-looking results, but for larger
     * clouds, this can result in a cloud that is undesirably warped to the ellipsoid volume.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CumulusCloud.html#slice">Online Documentation</a>
     */
    var slice: Double

    /**
     * Gets or sets the brightness of the cloud. This can be used to give clouds
     * a darker, grayer appearance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CumulusCloud.html#brightness">Online Documentation</a>
     */
    var brightness: Double
}
