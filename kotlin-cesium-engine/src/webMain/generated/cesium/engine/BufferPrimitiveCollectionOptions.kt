// Automatically generated - do not modify!

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * @property [modelMatrix] Transforms geometry from model to world coordinates.
 *   Default value - [Matrix4.IDENTITY]
 * @property [primitiveCountMax] Maximum number of primitives.
 *   Default value - [BufferPrimitiveCollection.DEFAULT_CAPACITY]
 * @property [vertexCountMax] Maximum number of vertices.
 *   Default value - [BufferPrimitiveCollection.DEFAULT_CAPACITY]
 * @property [positionDatatype] The component datatype used to store position values.
 *   Default value - [ComponentDatatype.DOUBLE]
 * @property [positionNormalized] When `true`, integer position values are treated as normalized,
 *   where the full integer range maps to [-1, 1] (signed) or [0, 1] (unsigned). Only relevant for integer position datatypes
 *   (BYTE, UNSIGNED_BYTE, SHORT, UNSIGNED_SHORT).
 *   Default value - `false`
 * @property [allowPicking] When `true`, primitives are pickable with [Scene.pick]. When `false`, memory and initialization cost are lower.
 *   Default value - `false`
 * @property [boundingVolume] Bounding volume, in world space, for the collection. When
 *   unspecified, a bounding volume is computed automatically and updated when primitive positions change. When
 *   specified, users are responsible for updating bounding volume as needed. Pre-computing the bounding volume
 *   manually, and updating it only as needed, will improve performance for larger dynamic collections.
 * @property [options.heightReference] When set to a clamping value, the
 *   collection is draped onto the surfaces selected by the value: [HeightReference.CLAMP_TO_TERRAIN] drapes
 *   onto the globe, [HeightReference.CLAMP_TO_3D_TILE] drapes onto 3D Tiles, and
 *   [HeightReference.CLAMP_TO_GROUND] drapes onto both. Only [BufferPolylineCollection] and
 *   [BufferPolygonCollection] support draping, and only once the collection has been added to
 *   [Scene.primitives]. A draped collection is not also drawn as geometry of its own.
 *   Default value - [HeightReference.NONE]
 */
@JsPlainObject
external interface BufferPrimitiveCollectionOptions {
    val modelMatrix: Matrix4?
    val primitiveCountMax: Double?
    val vertexCountMax: Double?
    val show: Boolean?
    val positionDatatype: ComponentDatatype?
    val positionNormalized: Boolean?
    val allowPicking: Boolean?
    val boundingVolume: BoundingSphere?
    val debugShowBoundingVolume: Boolean?
    val blendOption: BlendOption?
}
