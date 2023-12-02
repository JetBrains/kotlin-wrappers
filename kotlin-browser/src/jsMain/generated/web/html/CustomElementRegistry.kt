// Automatically generated - do not modify!

package web.html

import js.promise.Promise
import web.dom.Node

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry) */
sealed external class CustomElementRegistry {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/define) */
    fun <T : HTMLElement> define(
        name: HtmlTagName<T>,
        constructor: CustomElementConstructor<T>,
        options: ElementDefinitionOptions = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/get) */
    operator fun <T : HTMLElement> get(name: HtmlTagName<T>): CustomElementConstructor<T>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/getName) */
    fun <T : HTMLElement> getName(constructor: CustomElementConstructor<T>): HtmlTagName<T>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/upgrade) */
    fun upgrade(root: Node)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/whenDefined) */
    fun <T : HTMLElement> whenDefined(name: HtmlTagName<T>): Promise<CustomElementConstructor<T>>
}
