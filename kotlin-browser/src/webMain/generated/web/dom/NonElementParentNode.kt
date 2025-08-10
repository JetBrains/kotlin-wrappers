// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.dom

import kotlin.js.definedExternally

/* mixin */
sealed
external interface NonElementParentNode {
    /**
     * Returns the first element within node's descendants whose ID is elementId.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementById)
     */
    fun getElementById(elementId: ElementId): Element? = definedExternally
}
