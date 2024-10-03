// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium.engine

/**
 * A [PositionProperty] whose value is lazily evaluated by a callback function.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackPositionProperty.html">Online Documentation</a>
 *
 * @constructor
 * @param [callback] The function to be called when the position property is evaluated.
 * @property [isConstant] `true` when the callback function returns the same value every time, `false` if the value will change.
 * @property [referenceFrame] The reference frame in which the position is defined.
 *   Default value - [ReferenceFrame.FIXED]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackPositionProperty.html">Online Documentation</a>
 */
external class CallbackPositionProperty(
    callback: CallbackPositionProperty,
    val isConstant: Boolean,
    var referenceFrame: ReferenceFrame = definedExternally,
) {
    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is considered to have changed if a call to getValue would return
     * a different result for the same time.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackPositionProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the value of the property at the provided time in the fixed frame.
     * @param [time] The time for which to retrieve the value. If omitted, the current system time is used.
     *   Default value - `JulianDate.now()`
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackPositionProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate? = definedExternally,
        result: Cartesian3? = definedExternally,
    ): Cartesian3?

    /**
     * Sets the callback to be used.
     * @param [callback] The function to be called when the property is evaluated.
     * @param [isConstant] `true` when the callback function returns the same value every time, `false` if the value will change.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackPositionProperty.html#setCallback">Online Documentation</a>
     */
    fun setCallback(
        callback: CallbackPositionProperty,
        isConstant: Boolean,
    )

    /**
     * Gets the value of the property at the provided time and in the provided reference frame.
     * @param [time] The time for which to retrieve the value.
     * @param [referenceFrame] The desired referenceFrame of the result.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CallbackPositionProperty.html#getValueInReferenceFrame">Online Documentation</a>
     */
    fun getValueInReferenceFrame(
        time: JulianDate,
        referenceFrame: ReferenceFrame,
        result: Cartesian3? = definedExternally,
    ): Cartesian3?
}
