// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A [Property] whose value does not change with respect to simulation time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantProperty.html">Online Documentation</a>
 *
 * @constructor
 * @param [value] The property value.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantProperty.html">Online Documentation</a>
 */
external class ConstantProperty(value: Any? = definedExternally) {
    /**
     * Gets a value indicating if this property is constant.
     * This property always returns `true`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is changed whenever setValue is called with data different
     * than the current value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the value of the property.
     * @param [time] The time for which to retrieve the value.  This parameter is unused since the value does not change with respect to time.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate? = definedExternally,
        result: Any? = definedExternally,
    ): Any

    /**
     * Sets the value of the property.
     * @param [value] The property value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantProperty.html#setValue">Online Documentation</a>
     */
    fun setValue(value: Any)

    /**
     * Gets this property's value.
     * @return This property's value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ConstantProperty.html#valueOf">Online Documentation</a>
     */
    fun valueOf(): Any
}
