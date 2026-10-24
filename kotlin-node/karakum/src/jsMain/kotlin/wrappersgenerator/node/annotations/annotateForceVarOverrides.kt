package wrappersgenerator.node.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature

suspend fun annotateForceVarOverrides(node: Node, context: AnnotationContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFile()).fileName

    nullable {
        ensure(sourceFileName.endsWith("readline/promises.d.ts"))

        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "completer")

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "ReadLineOptions")

        "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
    } ?: nullable {
        ensure(sourceFileName.endsWith("http.d.ts"))

        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "family")

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "ClientRequestArgs")

        "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
    }
}
