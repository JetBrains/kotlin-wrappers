// Automatically generated - do not modify!

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * @property [primitiveCountMax] Maximum number of polygons.
 *   Default value - [BufferPrimitiveCollection.DEFAULT_CAPACITY]
 * @property [vertexCountMax] Maximum number of vertices.
 *   Default value - [BufferPrimitiveCollection.DEFAULT_CAPACITY]
 * @property [holeCountMax] Maximum number of holes.
 *   Default value - [BufferPrimitiveCollection.DEFAULT_CAPACITY]
 * @property [triangleCountMax] Maximum number of triangles.
 *   Default value - [BufferPrimitiveCollection.DEFAULT_CAPACITY]
 * @property [positionDatatype] The component datatype used to store position values.
 *   Default value - [ComponentDatatype.DOUBLE]
 * @property [positionNormalized] When `true`, integer position values are treated as normalized,
 *   where the full integer range maps to [-1, 1] (signed) or [0, 1] (unsigned). Only relevant for integer position datatypes
 *   (BYTE, UNSIGNED_BYTE, SHORT, UNSIGNED_SHORT).
 *   Default value - `false`
 * @property [allowPicking] When `true`, primitives are pickable with [Scene.pick]. When `false`, memory and initialization cost are lower.
 *   Default value - `true`
 * @property [boundingVolume] Bounding volume, in world space, for the collection. When
 *   unspecified, a bounding volume is computed automatically and updated when primitive positions change. When
 *   specified, users are responsible for updating bounding volume as needed. Pre-computing the bounding volume
 *   manually, and updating it only as needed, will improve performance for larger dynamic collections.
 * @property [heightReference] When set to a clamping value, the
 *   collection is draped onto terrain and/or 3D Tiles, rather than drawn as geometry of its own.
 *   Default value - [HeightReference.NONE]
 */
@JsPlainObject
external interface BufferPolygonCollectionOptions {
    val primitiveCountMax: Double?
    val vertexCountMax: Double?
    val holeCountMax: Double?
    val triangleCountMax: Double?
    val positionDatatype: ComponentDatatype?
    val positionNormalized: Boolean?
    val show: Boolean?
    val allowPicking: Boolean?
    val boundingVolume: BoundingSphere?
    val debugShowBoundingVolume: Boolean?
    val blendOption: BlendOption?
    val heightReference: HeightReference?
}
