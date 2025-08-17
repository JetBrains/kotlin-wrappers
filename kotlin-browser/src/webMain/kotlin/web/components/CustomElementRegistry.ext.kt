package web.components

import web.dom.TagName
import web.html.HTMLElement

/**
 * The **`define()`** method of the CustomElementRegistry interface adds a definition for a custom element to the custom element registry, mapping its name to the constructor which will be used to create it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/define)
 */
inline fun <T : HTMLElement> CustomElementRegistry.define(
    name: TagName<T>,
    reference: CustomElementReference<T>,
) {
    define(
        name = name,
        constructor = reference.value,
    )
}

/**
 * The **`getName()`** method of the CustomElementRegistry interface returns the name for a previously-defined custom element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/getName)
 */
inline fun <T : HTMLElement> CustomElementRegistry.getName(
    reference: CustomElementReference<T>,
): TagName<T>? =
    getName(constructor = reference.value)
