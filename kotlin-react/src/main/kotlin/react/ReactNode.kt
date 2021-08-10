@file:Suppress("NOTHING_TO_INLINE")

package react

import kotlinext.js.asJsObject

external interface ReactNode

inline fun ReactNode(string: String): ReactNode =
    string.unsafeCast<ReactNode>()

fun ReactNode.asStringOrNull(): String? =
    asDynamic() as? String

fun ReactNode.asElementOrNull(): ReactElement? = when {
    asJsObject().hasOwnProperty("\$\$typeof") -> unsafeCast<ReactElement>()
    else -> null
}

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("ReactNode", "react.ReactNode"),
)
typealias Child = ReactNode
