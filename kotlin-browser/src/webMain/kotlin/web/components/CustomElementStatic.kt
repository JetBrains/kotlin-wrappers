package web.components

import js.array.ReadonlyArray
import js.core.JsString

internal external interface CustomElementStatic {
    var formAssociated: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Web_components/Using_custom_elements#responding_to_attribute_changes)
     */
    var observedAttributes: ReadonlyArray<JsString>?
}
