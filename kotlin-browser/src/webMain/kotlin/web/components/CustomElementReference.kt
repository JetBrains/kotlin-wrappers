package web.components

import js.array.ReadonlyArray
import js.reflect.JsClass
import js.reflect.unsafeCast
import web.html.HTMLElement
import kotlin.js.JsString

open class CustomElementReference<T : HTMLElement>
protected constructor(
    val value: JsClass<T>,
    formAssociated: Boolean? = null,
    observedAttributes: ReadonlyArray<JsString>? = null,
) {
    init {
        val static = unsafeCast<CustomElementStatic>(value)

        if (formAssociated != null) {
            static.formAssociated = formAssociated
        }

        if (observedAttributes != null) {
            static.observedAttributes = observedAttributes
        }
    }
}
