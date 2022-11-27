// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * A [Property] whose value is an array whose items are the computed value
 * of other PositionProperty instances.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionPropertyArray.html">Online Documentation</a>
 *
 * @constructor
 * @param [value] An array of Property instances.
 * @property [referenceFrame] The reference frame in which the position is defined.
 *   Default value - [ReferenceFrame.FIXED]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionPropertyArray.html">Online Documentation</a>
 */
external class PositionPropertyArray(
    value: ReadonlyArray<Property>? = definedExternally,
    var referenceFrame: ReferenceFrame = definedExternally,
) {
    /**
     * Gets a value indicating if this property is constant.  This property
     * is considered constant if all property items in the array are constant.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionPropertyArray.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is changed whenever setValue is called with data different
     * than the current value or one of the properties in the array also changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionPropertyArray.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the value of the property.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionPropertyArray.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: ReadonlyArray<Cartesian3>? = definedExternally,
    ): ReadonlyArray<Cartesian3>

    /**
     * Gets the value of the property at the provided time and in the provided reference frame.
     * @param [time] The time for which to retrieve the value.
     * @param [referenceFrame] The desired referenceFrame of the result.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionPropertyArray.html#getValueInReferenceFrame">Online Documentation</a>
     */
    fun getValueInReferenceFrame(
        time: JulianDate,
        referenceFrame: ReferenceFrame,
        result: ReadonlyArray<Cartesian3>? = definedExternally,
    ): ReadonlyArray<Cartesian3>

    /**
     * Sets the value of the property.
     * @param [value] An array of Property instances.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionPropertyArray.html#setValue">Online Documentation</a>
     */
    fun setValue(value: ReadonlyArray<Property>)
}
