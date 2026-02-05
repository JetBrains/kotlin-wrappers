package testinglibrary.dom.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.Node
import typescript.isFunctionDeclaration

fun annotateWaitFor(node: Node, context: AnnotationContext) = nullable {
    nullable {
        ensure(isFunctionDeclaration(node))
        ensure(node.name?.text == "waitFor")

        "@JsName(\"waitFor\")"
    }
}
