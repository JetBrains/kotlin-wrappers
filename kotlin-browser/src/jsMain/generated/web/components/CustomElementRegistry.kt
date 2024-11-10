// Automatically generated - do not modify!

package web.components

import js.promise.Promise
import seskar.js.JsAsync
import web.dom.Node
import web.html.HTMLElement
import web.html.HtmlTagName

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry)
 */
external class CustomElementRegistry
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/define)
     */
    fun <T : P, P : HTMLElement> define(
        name: HtmlTagName<T>,
        constructor: CustomElementConstructor<T>,
        options: ElementDefinitionOptions<P> = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/get)
     */
    operator fun <T : HTMLElement> get(name: HtmlTagName<T>): CustomElementConstructor<T>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/getName)
     */
    fun <T : HTMLElement> getName(constructor: CustomElementConstructor<T>): HtmlTagName<T>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/upgrade)
     */
    fun upgrade(root: Node)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/whenDefined)
     */
    @JsAsync
    suspend fun <T : HTMLElement> whenDefined(name: HtmlTagName<T>): CustomElementConstructor<T>

    @JsName("whenDefined")
    fun <T : HTMLElement> whenDefinedAsync(name: HtmlTagName<T>): Promise<CustomElementConstructor<T>>
}
