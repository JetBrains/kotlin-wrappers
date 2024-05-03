// Automatically generated - do not modify!

package cesium.engine

import js.objects.JsPlainObject

/**
 * An object describing a uniform, its type, and an initial value
 * @property [type] The Glsl type of the uniform.
 * @property [value] The initial value of the uniform
 */
@JsPlainObject
sealed external interface UniformSpecifier {
    var type: UniformType
    var value: dynamic
}
