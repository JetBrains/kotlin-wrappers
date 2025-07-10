// Automatically generated - do not modify!

package web.components

import js.promise.Promise
import js.promise.await
import web.dom.Node
import web.dom.TagName
import web.html.HTMLElement
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`CustomElementRegistry`** interface provides methods for registering custom elements and querying registered elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry)
 */
open external class CustomElementRegistry {
    /**
     * The **`define()`** method of the CustomElementRegistry interface adds a definition for a custom element to the custom element registry, mapping its name to the constructor which will be used to create it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/define)
     */
    fun <T : P, P : HTMLElement> define(
        name: TagName<T>,
        constructor: CustomElementConstructor<T>,
        options: ElementDefinitionOptions<P> = definedExternally,
    )

    /**
     * The **`get()`** method of the previously-defined custom element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/get)
     */
    fun <T : HTMLElement> get(name: TagName<T>): CustomElementConstructor<T>?

    /**
     * The **`getName()`** method of the previously-defined custom element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/getName)
     */
    fun <T : HTMLElement> getName(constructor: CustomElementConstructor<T>): TagName<T>?

    /**
     * The **`upgrade()`** method of the elements in a Node subtree, even before they are connected to the main document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/upgrade)
     */
    fun upgrade(root: Node)

    /**
     * The **`whenDefined()`** method of the resolves when the named element is defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/whenDefined)
     */
    @JsName("whenDefined")
    fun <T : HTMLElement> whenDefinedAsync(name: TagName<T>): Promise<CustomElementConstructor<T>>
}

/**
 * The **`whenDefined()`** method of the resolves when the named element is defined.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/whenDefined)
 */
suspend inline fun <T : HTMLElement> CustomElementRegistry.whenDefined(name: TagName<T>): CustomElementConstructor<T> {
    return whenDefinedAsync(name = name).await()
}
