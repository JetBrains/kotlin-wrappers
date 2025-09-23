package node.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.Node
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isVariableDeclaration

fun annotateDefaultExports(node: Node, context: AnnotationContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

    nullable {
        ensure(sourceFileName.endsWith("assert.d.ts"))

        ensure(isFunctionDeclaration(node))
        ensure(node.name?.text == "assert")

        "@JsName(\"default\")"
    } ?: nullable {
        ensure(sourceFileName.endsWith("cluster.d.ts"))

        ensure(isVariableDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "cluster")

        "@JsName(\"default\")"
    } ?: nullable {
        ensure(sourceFileName.endsWith("path.d.ts"))

        ensure(isVariableDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "path")

        "@JsName(\"default\")"
    } ?: nullable {
        ensure(sourceFileName.endsWith("process.d.ts"))

        ensure(isVariableDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "process")

        "@JsName(\"default\")"
    }
}
