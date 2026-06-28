package web.components

import web.html.HTMLElement
import kotlin.reflect.KClass

inline fun <reified T : HTMLElement> CustomElementConstructor(): CustomElementConstructor<T> =
    CustomElementConstructor(T::class)

fun <T : HTMLElement> CustomElementConstructor(
    clazz: KClass<T>,
): CustomElementConstructor<T> =
    CustomElementConstructor(clazz.js)
