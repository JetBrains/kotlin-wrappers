package wrappersgenerator.testing.library.dom.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isFunctionDeclaration

suspend fun annotateWaitFor(node: Node, context: AnnotationContext) = nullable {
    ensure(isFunctionDeclaration(node))
    ensure(node.name?.text == "waitFor")

    "@JsName(\"waitFor\")"
}
