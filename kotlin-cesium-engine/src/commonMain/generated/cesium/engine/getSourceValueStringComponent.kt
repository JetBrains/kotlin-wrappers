// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

import js.core.JsAny
import kotlin.js.JsModule

/**
 * Creates a shader statement that returns the value of the specified
 * component of the given property, normalized to the range [0, 1].
 * @param [classProperty] The class property
 * @param [metadataProperty] The metadata property, either
 *   a `PropertyTextureProperty` or a `PropertyAttributeProperty`
 * @param [componentName] The name, in ["x", "y", "z", "w"]
 * @return The string
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#getSourceValueStringComponent">Online Documentation</a>
 */
external fun getSourceValueStringComponent(
    classProperty: MetadataClassProperty,
    metadataProperty: JsAny,
    componentName: String,
): String
