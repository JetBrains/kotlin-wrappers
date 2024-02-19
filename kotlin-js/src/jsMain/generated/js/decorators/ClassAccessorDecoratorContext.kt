// Automatically generated - do not modify!

package js.decorators

import js.objects.PropertyKey

/**
 * Context provided to a class `accessor` field decorator.
 * @template This The type on which the class element will be defined. For a static class element, this will be
 * the type of the constructor. For a non-static class element, this will be the type of the instance.
 * @template Value The type of decorated class field.
 */
sealed external interface ClassAccessorDecoratorContext<This : Any, Value : Any> {
    /** The kind of class element that was decorated. */
    val kind: DecoratorContextKind.accessor

    /** The name of the decorated class element. */
    val name: PropertyKey

    /** A value indicating whether the class element is a static (`true`) or instance (`false`) element. */
    val static: Boolean

    /** A value indicating whether the class element has a private name. */
    val private: Boolean

    /** An object that can be used to access the current value of the class element at runtime. */
    val access: Access<This, Value>

    interface Access<This : Any, Value : Any> {
        /**
         * Determines whether an object has a property with the same name as the decorated element.
         */
        fun has(o: This): Boolean

        /**
         * Invokes the getter on the provided object.
         *
         * @example
         * let value = context.access.get(instance);
         */
        fun get(o: This): Value

        /**
         * Invokes the setter on the provided object.
         *
         * @example
         * context.access.set(instance, value);
         */
        fun set(o: This, value: Value)
    }

    /**
     * Adds a callback to be invoked either before static initializers are run (when
     * decorating a `static` element), or before instance initializers are run (when
     * decorating a non-`static` element).
     */
    fun addInitializer(initializer: (/* this: This */) -> Unit)

    val metadata: DecoratorMetadata
}
