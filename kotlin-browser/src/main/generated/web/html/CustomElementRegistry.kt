// Automatically generated - do not modify!

package web.html

import web.dom.Node
import kotlin.js.Promise

sealed external class CustomElementRegistry {
    fun define(
        name: String,
        constructor: CustomElementConstructor,
        options: ElementDefinitionOptions = definedExternally,
    )

    operator fun get(name: String): CustomElementConstructor?
    fun upgrade(root: Node)
    fun whenDefined(name: String): Promise<CustomElementConstructor>
}
