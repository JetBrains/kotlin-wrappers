package web.components

import js.function.ConstructorFunction
import js.reflect.JsClass
import web.html.HTMLElement

fun <T : HTMLElement> CustomElementConstructor(
    clazz: JsClass<T>,
): CustomElementConstructor<T> =
    ConstructorFunction(clazz)
