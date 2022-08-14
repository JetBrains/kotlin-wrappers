// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A [Property] whose value is an array whose items are the computed value
 * of other property instances.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyArray.html">Online Documentation</a>
 *
 * @constructor
 * @param [value] An array of Property instances.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyArray.html">Online Documentation</a>
 */
external class PropertyArray(value: ReadonlyArray<Property>? = definedExternally) {
    /**
     * Gets a value indicating if this property is constant.  This property
     * is considered constant if all property items in the array are constant.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyArray.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is changed whenever setValue is called with data different
     * than the current value or one of the properties in the array also changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyArray.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the value of the property.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter, which is an array of values produced by evaluating each of the contained properties at the given time or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyArray.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: ReadonlyArray<Any>? = definedExternally,
    ): ReadonlyArray<Any>

    /**
     * Sets the value of the property.
     * @param [value] An array of Property instances.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyArray.html#setValue">Online Documentation</a>
     */
    fun setValue(value: ReadonlyArray<Property>)
}
