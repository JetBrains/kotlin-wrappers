// Automatically generated - do not modify!

package web.html

import web.dom.Node
import kotlin.js.Promise

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry) */
sealed external class CustomElementRegistry {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/define) */
    fun define(
        name: String,
        constructor: CustomElementConstructor,
        options: ElementDefinitionOptions = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/get) */
    operator fun get(name: String): CustomElementConstructor?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/upgrade) */
    fun upgrade(root: Node)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/whenDefined) */
    fun whenDefined(name: String): Promise<CustomElementConstructor>
}
