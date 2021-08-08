package react

import kotlinext.js.asJsObject

external interface ReactNode

fun ReactNode.asStringOrNull(): String? =
    asDynamic() as? String

fun ReactNode.asElementOrNull(): ReactElement? = when {
    asJsObject().hasOwnProperty("\$\$typeof") -> unsafeCast<ReactElement>()
    else -> null
}

inline fun ReactNode(string: String): ReactNode =
    string.unsafeCast<ReactNode>()

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("ReactNode", "react.ReactNode"),
)
typealias Child = ReactNode
