// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

import kotlinx.js.ReadonlyArray

/**
 * A [Property] whose value is a key-value mapping of property names to the computed value of other properties.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html">Online Documentation</a>
 *
 * @constructor
 * @param [value] An object, containing key-value mapping of property names to properties.
 * @param [createPropertyCallback] A function that will be called when the value of any of the properties in value are not a Property.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html">Online Documentation</a>
 */
external class PropertyBag(
    value: Any? = definedExternally,
    createPropertyCallback: Function<*>? = definedExternally,
) {
    /**
     * Gets the names of all properties registered on this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html#propertyNames">Online Documentation</a>
     */
    var propertyNames: ReadonlyArray<Any>

    /**
     * Gets a value indicating if this property is constant.  This property
     * is considered constant if all property items in this object are constant.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the set of properties contained in this
     * object changes, or one of the properties itself changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Determines if this object has defined a property with the given name.
     * @param [propertyName] The name of the property to check for.
     * @return True if this object has defined a property with the given name, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html#hasProperty">Online Documentation</a>
     */
    fun hasProperty(propertyName: String): Boolean

    /**
     * Adds a property to this object.
     * @param [propertyName] The name of the property to add.
     * @param [value] The value of the new property, if provided.
     * @param [createPropertyCallback] A function that will be called when the value of this new property is set to a value that is not a Property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html#addProperty">Online Documentation</a>
     */
    fun addProperty(
        propertyName: String,
        value: Any? = definedExternally,
        createPropertyCallback: Function<*>? = definedExternally,
    )

    /**
     * Removed a property previously added with addProperty.
     * @param [propertyName] The name of the property to remove.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html#removeProperty">Online Documentation</a>
     */
    fun removeProperty(propertyName: String)

    /**
     * Gets the value of this property.  Each contained property will be evaluated at the given time, and the overall
     * result will be an object, mapping property names to those values.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     *   Note that any properties in result which are not part of this PropertyBag will be left as-is.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: Any? = definedExternally,
    ): Any

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @param [createPropertyCallback] A function that will be called when the value of any of the properties in value are not a Property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PropertyBag.html#merge">Online Documentation</a>
     */
    fun merge(
        source: Any,
        createPropertyCallback: Function<*>? = definedExternally,
    )
}
