// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * A [Property] which transparently links to another property on a provided object.
 * ```
 * const collection = new EntityCollection();
 *
 * //Create a new entity and assign a billboard scale.
 * const object1 = new Entity({id:'object1'});
 * object1.billboard = new BillboardGraphics();
 * object1.billboard.scale = new ConstantProperty(2.0);
 * collection.add(object1);
 *
 * //Create a second entity and reference the scale from the first one.
 * const object2 = new Entity({id:'object2'});
 * object2.model = new ModelGraphics();
 * object2.model.scale = new ReferenceProperty(collection, 'object1', ['billboard', 'scale']);
 * collection.add(object2);
 *
 * //Create a third object, but use the fromString helper function.
 * const object3 = new Entity({id:'object3'});
 * object3.billboard = new BillboardGraphics();
 * object3.billboard.scale = ReferenceProperty.fromString(collection, 'object1#billboard.scale');
 * collection.add(object3);
 *
 * //You can refer to an entity with a # or . in id and property names by escaping them.
 * const object4 = new Entity({id:'#object.4'});
 * object4.billboard = new BillboardGraphics();
 * object4.billboard.scale = new ConstantProperty(2.0);
 * collection.add(object4);
 *
 * const object5 = new Entity({id:'object5'});
 * object5.billboard = new BillboardGraphics();
 * object5.billboard.scale = ReferenceProperty.fromString(collection, '\\#object\\.4#billboard.scale');
 * collection.add(object5);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html">Online Documentation</a>
 *
 * @constructor
 * @property [targetCollection] The entity collection which will be used to resolve the reference.
 * @property [targetId] The id of the entity which is being referenced.
 * @property [targetPropertyNames] The names of the property on the target entity which we will use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html">Online Documentation</a>
 */
external class ReferenceProperty(
    val targetCollection: EntityCollection,
    val targetId: String,
    val targetPropertyNames: ReadonlyArray<String>,
) {
    /**
     * Gets a value indicating if this property is constant.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html#isConstant">Online Documentation</a>
     */
    val isConstant: Boolean

    /**
     * Gets the event that is raised whenever the definition of this property changes.
     * The definition is changed whenever the referenced property's definition is changed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets the reference frame that the position is defined in.
     * This property is only valid if the referenced property is a [PositionProperty].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html#referenceFrame">Online Documentation</a>
     */
    val referenceFrame: ReferenceFrame

    /**
     * Gets the resolved instance of the underlying referenced property.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html#resolvedProperty">Online Documentation</a>
     */
    val resolvedProperty: Property?

    /**
     * Gets the value of the property at the provided time.
     * @param [time] The time for which to retrieve the value.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html#getValue">Online Documentation</a>
     */
    fun getValue(
        time: JulianDate,
        result: Any? = definedExternally,
    ): Any

    /**
     * Gets the value of the property at the provided time and in the provided reference frame.
     * This method is only valid if the property being referenced is a [PositionProperty].
     * @param [time] The time for which to retrieve the value.
     * @param [referenceFrame] The desired referenceFrame of the result.
     * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
     * @return The modified result parameter or a new instance if the result parameter was not supplied.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html#getValueInReferenceFrame">Online Documentation</a>
     */
    fun getValueInReferenceFrame(
        time: JulianDate,
        referenceFrame: ReferenceFrame,
        result: Cartesian3? = definedExternally,
    ): Cartesian3

    /**
     * Gets the [Material] type at the provided time.
     * This method is only valid if the property being referenced is a [MaterialProperty].
     * @param [time] The time for which to retrieve the type.
     * @return The type of material.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html#getType">Online Documentation</a>
     */
    fun getType(time: JulianDate): String

    companion object {
        /**
         * Creates a new instance given the entity collection that will
         * be used to resolve it and a string indicating the target entity id and property.
         * The format of the string is "objectId#foo.bar", where # separates the id from
         * property path and . separates sub-properties.  If the reference identifier or
         * or any sub-properties contains a # . or \ they must be escaped.
         * @return A new instance of ReferenceProperty.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ReferenceProperty.html#.fromString">Online Documentation</a>
         */
        fun fromString(
            targetCollection: EntityCollection,
            referenceString: String,
        ): ReferenceProperty
    }
}
