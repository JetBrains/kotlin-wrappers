package web.components

import web.html.HTMLElement

fun <T : HTMLElement> CustomElementRegistry.define(
    data: CustomElementData<T>,
) {
    define(
        name = data.name,
        constructor = data.clazz.js,
    )
}
