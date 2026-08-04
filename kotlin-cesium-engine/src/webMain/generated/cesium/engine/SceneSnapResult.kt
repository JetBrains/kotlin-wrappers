// Automatically generated - do not modify!

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * The result of a snap operation. See [Scene.snap].
 * @property [object] The snapped primitive or feature.
 * @property [position] The world-space position of the snap point, un-projected from the snap framebuffer's eye-space depth.
 * @property [screenPosition] The window coordinates of the snap point.
 * @property [isEdge] `true` if the snap point lies on an edge; `false` if it lies on a surface.
 */
@JsPlainObject
external interface SceneSnapResult {
    val obj: JsAny
    val position: Cartesian3
    val screenPosition: Cartesian2
    val isEdge: Boolean
}
