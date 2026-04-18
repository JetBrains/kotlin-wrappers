package wrappersgenerator.testing.library.dom.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.Node
import typescript.isInterfaceDeclaration

fun annotateJsPlainObject(node: Node, context: AnnotationContext) = nullable {
    ensure(isInterfaceDeclaration(node))
    ensure(
        node.name.text == "PrettyDOMOptions"
    )

    "@kotlinx.js.JsPlainObject"
}
