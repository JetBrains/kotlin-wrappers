// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * An affine transformation defined by a translation, rotation, and scale.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TranslationRotationScale.html">Online Documentation</a>
 *
 * @constructor
 * @property [translation] A [Cartesian3] specifying the (x, y, z) translation to apply to the node.
 *   Default value - [Cartesian3.ZERO]
 * @property [rotation] A [Quaternion] specifying the (x, y, z, w) rotation to apply to the node.
 *   Default value - [Quaternion.IDENTITY]
 * @property [scale] A [Cartesian3] specifying the (x, y, z) scaling to apply to the node.
 *   Default value - [Cartesian3(1.0, 1.0, 1.0)][Cartesian3]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TranslationRotationScale.html">Online Documentation</a>
 */
external class TranslationRotationScale(
    var translation: Cartesian3 = definedExternally,
    var rotation: Quaternion = definedExternally,
    var scale: Cartesian3 = definedExternally,
)
