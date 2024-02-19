// Automatically generated - do not modify!

package js.decorators

/**
 * Context provided to a class decorator.
 * @template Class The type of the decorated class associated with this context.
 */
sealed external interface ClassDecoratorContext<Class : JsClass<*>> {
    /** The kind of element that was decorated. */
    val kind: DecoratorContextKind.`class`

    /** The name of the decorated class. */
    val name: String?

    /**
     * Adds a callback to be invoked after the class definition has been finalized.
     *
     * @example
     * ```ts
     * function customElement(name: string): ClassDecoratorFunction {
     *   return (target, context) => {
     *     context.addInitializer(function () {
     *       customElements.define(name, this);
     *     });
     *   }
     * }
     *
     * @customElement("my-element")
     * class MyElement {}
     * ```
     */
    fun addInitializer(initializer: (/* this: Class */) -> Unit)

    val metadata: DecoratorMetadata
}
