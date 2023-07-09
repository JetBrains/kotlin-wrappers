package js.reflect

import js.core.PropertyKey
import js.core.ReadonlyArray
import js.core.TypedPropertyDescriptor

external object Reflect {
    /**
     * Constructs the target with the elements of specified array as the arguments
     * and the specified constructor as the `new.target` value.
     * @param target The constructor to invoke.
     * @param argumentsList An array of argument values to be passed to the constructor.
     */
    fun <T : Any> construct(
        target: JsClass<T>,
        argumentsList: ReadonlyArray<Any?>,
    ): T

    /**
     * Adds a property to an object, or modifies attributes of an existing property.
     * @param target Object on which to add or modify the property. This can be a native JavaScript object
     *        (that is, a user-defined object or a built in object) or a DOM object.
     * @param propertyKey The property name.
     * @param attributes Descriptor for the property. It can be for a data property or an accessor property.
     */
    fun defineProperty(
        target: Any,
        propertyKey: PropertyKey,
        attributes: TypedPropertyDescriptor<*>,
    ): Boolean

    /**
     * Removes a property from an object, equivalent to `delete target[propertyKey]`,
     * except it won't throw if `target[propertyKey]` is non-configurable.
     * @param target Object from which to remove the own property.
     * @param propertyKey The property name.
     */
    fun deleteProperty(
        target: Any,
        propertyKey: PropertyKey,
    ): Boolean

    /**
     * Gets the property of target, equivalent to `target[propertyKey]` when `receiver === target`.
     * @param target Object that contains the property on itself or in its prototype chain.
     * @param propertyKey The property name.
     */
    fun get(
        target: Any,
        propertyKey: PropertyKey,
    ): Any?

    /**
     * Gets the own property descriptor of the specified object.
     * An own property descriptor is one that is defined directly on the object and is not inherited from the object's prototype.
     * @param target Object that contains the property.
     * @param propertyKey The property name.
     */
    fun getOwnPropertyDescriptor(
        target: Any,
        propertyKey: PropertyKey,
    ): TypedPropertyDescriptor<*>

    /**
     * Returns the prototype of an object.
     * @param target The object that references the prototype.
     */
    fun getPrototypeOf(target: Any): Any?

    /**
     * Equivalent to `propertyKey in target`.
     * @param target Object that contains the property on itself or in its prototype chain.
     * @param propertyKey Name of the property.
     */
    fun has(target: Any, propertyKey: PropertyKey): Boolean

    /**
     * Returns a value that indicates whether new properties can be added to an object.
     * @param target Object to test.
     */
    fun isExtensible(target: Any): Boolean

    /**
     * Returns the string and symbol keys of the own properties of an object. The own properties of an object
     * are those that are defined directly on that object, and are not inherited from the object's prototype.
     * @param target Object that contains the own properties.
     */
    fun ownKeys(target: Any): ReadonlyArray<Any /* String | Symbol */>

    /**
     * Prevents the addition of new properties to an object.
     * @param target Object to make non-extensible.
     * @return Whether the object has been made non-extensible.
     */
    fun preventExtensions(target: Any): Boolean

    /**
     * Sets the property of target, equivalent to `target[propertyKey] = value` when `receiver === target`.
     * @param target Object that contains the property on itself or in its prototype chain.
     * @param propertyKey Name of the property.
     */
    fun set(
        target: Any,
        propertyKey: PropertyKey,
        value: Any?,
    ): Boolean

    /**
     * Sets the prototype of a specified object o to object proto or null.
     * @param target The object to change its prototype.
     * @param proto The value of the new prototype or null.
     * @return Whether setting the prototype was successful.
     */
    fun setPrototypeOf(
        target: Any,
        proto: Any?,
    ): Boolean
}
