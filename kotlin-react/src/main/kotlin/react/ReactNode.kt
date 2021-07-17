package react

import kotlinext.js.asJsObject

external interface ReactNode

fun ReactNode.asStringOrNull(): String? =
    asDynamic() as? String

fun ReactNode.asElementOrNull(): ReactElement? = when {
    asJsObject().hasOwnProperty("\$\$typeof") -> unsafeCast<ReactElement>()
    else -> null
}

@Deprecated(
    message = "Will be removed soon",
    replaceWith = ReplaceWith("ReactNode"),
)
typealias Child = ReactNode