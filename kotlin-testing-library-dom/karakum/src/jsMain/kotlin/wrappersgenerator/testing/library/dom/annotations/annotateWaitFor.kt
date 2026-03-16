package wrappersgenerator.testing.library.dom.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.Node
import typescript.isFunctionDeclaration

fun annotateWaitFor(node: Node, context: AnnotationContext) = nullable {
    ensure(isFunctionDeclaration(node))
    ensure(node.name?.text == "waitFor")

    "@JsName(\"waitFor\")"
}
