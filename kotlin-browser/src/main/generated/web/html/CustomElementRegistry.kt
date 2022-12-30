// Automatically generated - do not modify!

package web.html

import dom.Node
import kotlin.js.Promise

sealed external class CustomElementRegistry {
    fun define(
        name: String,
        constructor: CustomElementConstructor,
        options: ElementDefinitionOptions = definedExternally,
    )

    fun get(name: String): CustomElementConstructor?
    fun upgrade(root: Node)
    fun whenDefined(name: String): Promise<CustomElementConstructor>
}
