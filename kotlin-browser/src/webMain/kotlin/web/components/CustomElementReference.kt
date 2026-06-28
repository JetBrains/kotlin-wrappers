package web.components

import js.array.ReadonlyArray
import js.reflect.JsClass
import js.reflect.unsafeCast
import web.html.HTMLElement

open class CustomElementReference<T : HTMLElement>
protected constructor(
    clazz: JsClass<T>,
    formAssociated: Boolean? = null,
    observedAttributes: ReadonlyArray<JsString>? = null,
) {
    val value: CustomElementConstructor<T> =
        CustomElementConstructor(clazz)

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
