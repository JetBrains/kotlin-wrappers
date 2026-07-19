// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.html

import js.internal.InternalApi
import web.origin.OriginSource
import web.window.WindowTarget

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface HTMLHyperlinkElementUtils :
    OriginSource {
    /**
     * The **`href`** property of the HTMLAnchorElement interface is a stringifier that returns the absolute URL corresponding to the element's href attribute (or an empty string if href is unset). Setting this property updates the element's href attribute to the provided value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/href)
     */
    var href: String
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`target`** property of the HTMLAnchorElement interface is a string that indicates where to display the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/target)
     */
    var target: WindowTarget
        get() = definedExternally
        set(value) = definedExternally
}
