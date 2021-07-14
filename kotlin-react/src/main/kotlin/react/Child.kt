package react

import kotlinext.js.asJsObject

external interface Child

fun Child.asStringOrNull(): String? =
    asDynamic() as? String

fun Child.asElementOrNull(): ReactElement? = when {
    asJsObject().hasOwnProperty("\$\$typeof") -> unsafeCast<ReactElement>()
    else -> null
}
