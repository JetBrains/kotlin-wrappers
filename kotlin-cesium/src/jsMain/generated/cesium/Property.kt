// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * The interface for all properties, which represent a value that can optionally vary over time.
 * This type defines an interface and cannot be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Property.html">Online Documentation</a>
 */
abstract external class Property {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Property.html#isConstant">Online Documentation</a>
     */
    abstract val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Property.html#definitionChanged">Online Documentation</a>
     */
    abstract val definitionChanged: DefaultEvent

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Property.html#getValue">Online Documentation</a>
     */
    abstract fun getValue(
        time: JulianDate,
        result: Any? = definedExternally,
    ): Any
}
