// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.navigator

import js.array.ReadonlyArray
import js.internal.InternalApi
import kotlin.js.JsString
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface NavigatorLanguage {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/language)
     */
    val language: String
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/languages)
     */
    val languages: ReadonlyArray<JsString>
        get() = definedExternally
}
