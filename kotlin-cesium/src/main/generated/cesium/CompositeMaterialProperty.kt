// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A [CompositeProperty] which is also a [MaterialProperty].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeMaterialProperty.html">Online Documentation</a>
 */
external class CompositeMaterialProperty : MaterialProperty {
    /**
     * Gets a value indicating if this property is constant.  A property is considered
     * constant if getValue always returns the same result for the current definition.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeMaterialProperty.html#isConstant">Online Documentation</a>
     */
    override val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is changed whenever setValue is called with data different
     * than the current value.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeMaterialProperty.html#definitionChanged">Online Documentation</a>
     */
    override val definitionChanged: Event<*>

    /**
     * Gets the interval collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeMaterialProperty.html#intervals">Online Documentation</a>
     */
    var intervals: TimeIntervalCollection

    /**
     * Gets the [Material] type at the provided time.
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeMaterialProperty.html#getType">Online Documentation</a>
     */
    override fun getType(time: JulianDate): String

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompositeMaterialProperty.html#getValue">Online Documentation</a>
     */
    override fun getValue(
        time: JulianDate,
        result: Any?,
    ): Any
}
