// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.navigator

import js.internal.InternalApi
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface NavigatorPlugins {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/pdfViewerEnabled)
     */
    val pdfViewerEnabled: Boolean
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/javaEnabled)
     */
    fun javaEnabled(): Boolean = definedExternally
}
