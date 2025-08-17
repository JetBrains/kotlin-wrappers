package web.components

import js.array.ReadonlyArray
import js.core.JsString
import js.reflect.JsClass
import js.reflect.JsClassReference
import js.reflect.unsafeCast
import web.html.HTMLElement

open class CustomElementReference<T : HTMLElement>
protected constructor(
    override val value: JsClass<T>,
    formAssociated: Boolean? = null,
    observedAttributes: ReadonlyArray<JsString>? = null,
) : JsClassReference<T> {
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
