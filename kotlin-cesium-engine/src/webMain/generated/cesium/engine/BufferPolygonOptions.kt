// Automatically generated - do not modify!

package cesium.engine

import js.typedarrays.TypedArray
import kotlinx.js.JsPlainObject

/**
 * @property [options.modelMatrix] Transforms geometry from model to world coordinates.
 *   Default value - [Matrix4.IDENTITY]
 */
@JsPlainObject
external interface BufferPolygonOptions {
    val show: Boolean?
    val material: BufferPolygonMaterial?
    val positions: TypedArray<*, *, *, *>?
    val holes: TypedArray<*, *, *, *>?
    val triangles: TypedArray<*, *, *, *>?
}
