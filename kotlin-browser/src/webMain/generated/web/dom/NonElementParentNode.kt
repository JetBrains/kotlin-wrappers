// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.dom

import js.internal.InternalApi
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface NonElementParentNode {
    /**
     * Returns the first element within node's descendants whose ID is elementId.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementById)
     */
    fun getElementById(elementId: ElementId): Element? = definedExternally
}
