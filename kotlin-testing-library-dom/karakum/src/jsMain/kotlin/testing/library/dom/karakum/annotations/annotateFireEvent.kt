package testing.library.dom.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.Node
import typescript.isIdentifier
import typescript.isVariableDeclaration

fun annotateFireEvent(node: Node, context: AnnotationContext) = nullable {
    ensure(isVariableDeclaration(node))

    val name = node.name
    ensure(isIdentifier(name))
    ensure(name.text == "fireEvent")

    "@JsName(\"fireEvent\")"
}
