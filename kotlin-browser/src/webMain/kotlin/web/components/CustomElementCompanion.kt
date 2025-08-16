package web.components

import js.array.ReadonlyArray
import js.core.JsString
import kotlin.js.definedExternally

external interface CustomElementCompanion {
    val formAssociated: Boolean?
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components/Using_custom_elements#responding_to_attribute_changes)
     */
    val observedAttributes: ReadonlyArray<JsString>?
        get() = definedExternally
}
