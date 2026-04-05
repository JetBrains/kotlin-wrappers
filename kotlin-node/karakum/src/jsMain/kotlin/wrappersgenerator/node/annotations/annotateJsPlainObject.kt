package wrappersgenerator.node.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.*

private val jsoInterfaces = setOf(
    // http(s)
    "AgentOptions",
    "ClientRequestArgs",
    "RequestOptions",

    // net
    "OnReadOpts",

    // util
    "InspectOptionsStylized",

    // vm
    "CompileFunctionOptions",
    "ModuleEvaluateOptions",
    "RunningCodeInNewContextOptions",
    "RunningCodeOptions",
    "RunningScriptInNewContextOptions",
    "SourceTextModuleOptions",
)

fun annotateJsPlainObject(node: Node, context: AnnotationContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

    nullable {
        ensure(isInterfaceDeclaration(node))
        ensure(node.name.text in jsoInterfaces)

        "@kotlinx.js.JsPlainObject"
    } ?: nullable {
        ensure(isInterfaceDeclaration(node))
        ensure(node.name.text == "ReadLineOptions")
        ensure(sourceFileName.endsWith("readline/promises.d.ts"))

        "@kotlinx.js.JsPlainObject"
    }
}
