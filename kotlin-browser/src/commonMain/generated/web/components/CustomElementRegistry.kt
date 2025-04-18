// Automatically generated - do not modify!

package web.components

import js.promise.Promise
import seskar.js.JsAsync
import web.dom.Node
import web.html.HTMLElement
import web.html.HtmlTagName
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry)
 */
open external class CustomElementRegistry {
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
    fun <T : HTMLElement> get(name: HtmlTagName<T>): CustomElementConstructor<T>?

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
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun <T : HTMLElement> whenDefined(name: HtmlTagName<T>): CustomElementConstructor<T>

    @JsName("whenDefined")
    fun <T : HTMLElement> whenDefinedAsync(name: HtmlTagName<T>): Promise<CustomElementConstructor<T>>
}
