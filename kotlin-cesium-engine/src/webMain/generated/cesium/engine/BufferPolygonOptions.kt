// Automatically generated - do not modify!

package cesium.engine

import js.typedarrays.TypedArray
import kotlinx.js.JsPlainObject

/**
 * @property [modelMatrix] Transforms geometry from model to world coordinates.
 *   Default value - [Matrix4.IDENTITY]
 */
@JsPlainObject
external interface BufferPolygonOptions {
    val modelMatrix: Matrix4?
    val show: Boolean?
    val material: BufferPolygonMaterial?
    val featureId: Int?
    val pickObject: JsAny?
    val positions: TypedArray<*, *, *, *>?
    val holes: TypedArray<*, *, *, *>?
    val triangles: TypedArray<*, *, *, *>?
}
