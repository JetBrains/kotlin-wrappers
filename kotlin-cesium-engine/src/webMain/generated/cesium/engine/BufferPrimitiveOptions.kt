// Automatically generated - do not modify!

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * @property [modelMatrix] Transforms geometry from model to world coordinates.
 *   Default value - [Matrix4.IDENTITY]
 */
@JsPlainObject
external interface BufferPrimitiveOptions {
    val modelMatrix: Matrix4?
    val show: Boolean?
    val material: BufferPrimitiveMaterial?
    val featureId: Int?
    val pickObject: JsAny?
}
