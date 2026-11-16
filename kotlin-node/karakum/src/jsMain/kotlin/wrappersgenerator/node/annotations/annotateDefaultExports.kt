package wrappersgenerator.node.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isFunctionDeclaration
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isVariableDeclaration

suspend fun annotateDefaultExports(node: Node, context: AnnotationContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFile()).fileName

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
