// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A tile in a [Cesium3DTileset].  When a tile is first created, its content is not loaded;
 * the content is loaded on-demand when needed based on the view.
 *
 * Do not construct this directly, instead access tiles through [Cesium3DTileset.tileVisible].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html">Online Documentation</a>
 */
sealed external class Cesium3DTile {
    /**
     * The local transform of this tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#transform">Online Documentation</a>
     */
    var transform: Matrix4

    /**
     * The final computed transform of this tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#computedTransform">Online Documentation</a>
     */
    val computedTransform: Matrix4

    /**
     * The error, in meters, introduced if this tile is rendered and its children are not.
     * This is used to compute screen space error, i.e., the error measured in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#geometricError">Online Documentation</a>
     */
    val geometricError: Double

    /**
     * Gets the tile's children.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#children">Online Documentation</a>
     */
    val children: ReadonlyArray<Cesium3DTile>

    /**
     * This tile's parent or `undefined` if this tile is the root.
     *
     * When a tile's content points to an external tileset JSON file, the external tileset's
     * root tile's parent is not `undefined`; instead, the parent references
     * the tile (with its content pointing to an external tileset JSON file) as if the two tilesets were merged.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#parent">Online Documentation</a>
     */
    val parent: Cesium3DTile

    /**
     * The time in seconds after the tile's content is ready when the content expires and new content is requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#expireDuration">Online Documentation</a>
     */
    var expireDuration: Double

    /**
     * The date when the content expires and new content is requested.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#expireDate">Online Documentation</a>
     */
    var expireDate: JulianDate

    /**
     * The tileset containing this tile.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#tileset">Online Documentation</a>
     */
    val tileset: Cesium3DTileset

    /**
     * The tile's content.  This represents the actual tile's payload,
     * not the content's metadata in the tileset JSON file.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#content">Online Documentation</a>
     */
    val content: Cesium3DTileContent

    /**
     * Get the bounding sphere derived from the tile's bounding volume.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#boundingSphere">Online Documentation</a>
     */
    val boundingSphere: BoundingSphere

    /**
     * Returns the `extras` property in the tileset JSON for this tile, which contains application specific metadata.
     * Returns `undefined` if `extras` does not exist.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTile.html#extras">Online Documentation</a>
     */
    val extras: Any
}
