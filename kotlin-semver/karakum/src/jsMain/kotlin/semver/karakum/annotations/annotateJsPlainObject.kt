package semver.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.Node
import typescript.isInterfaceDeclaration

private val jsoInterfaces = setOf(
    "RangeOptions",
    "Options",
    "CoerceOptions"
)

fun annotateJsPlainObject(node: Node, context: AnnotationContext) = nullable {
    ensure(isInterfaceDeclaration(node))
    ensure(node.name.text in jsoInterfaces)

    "@kotlinx.js.JsPlainObject"
}
