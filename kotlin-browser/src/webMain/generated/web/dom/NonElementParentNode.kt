// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.dom

import js.internal.InternalApi

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface NonElementParentNode {
    /**
     * The **`getElementById()`** method of the Document interface returns an Element object representing the element whose id property matches the specified string. Since element IDs are required to be unique if specified, they're a useful way to get access to a specific element quickly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementById)
     */
    fun getElementById(elementId: ElementId): Element? = definedExternally
}
