package tanstack.history.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.extension.plugins.nameResolverServiceKey
import typescript.*

private val plainObjects = setOf(
    "BlockerFnArgs",
    "CreateBrowserHistoryOpts",
    "CreateHashHistoryOpts",
    "CreateHistoryOpts",
    "CreateMemoryHistoryOpts",
    "HistoryLocation",
    "NavigateOptions",
    "NavigationBlocker",
    "ParsedHistoryState",
    "ParsedPath",
    "SubscriberArgs",
)

fun annotateJsPlainObject(node: Node, context: AnnotationContext) = nullable {
    nullable {
        ensure(isInterfaceDeclaration(node))
        ensure(node.name.text in plainObjects)

        "@kotlinx.js.JsPlainObject"
    } ?: nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text in plainObjects)

        "@kotlinx.js.JsPlainObject"
    } ?: nullable {
        ensure(context.isAnonymousDeclaration)

        val nameResolverService = context.requireService(nameResolverServiceKey)
        val name = nameResolverService.resolveName(node, context)

        ensure(name in plainObjects)

        "@kotlinx.js.JsPlainObject"
    }
}
