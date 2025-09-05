package node.karakum.annotations

import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.nullable
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature

fun annotateForceVarOverrides(node: Node, context: AnnotationContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

    ensure(sourceFileName.endsWith("readline/promises.d.ts"))

    ensure(isPropertySignature(node))

    val name = node.name
    ensure(isIdentifier(name))
    ensure(name.text == "completer")


    val interfaceNode = ensureNotNull(node.getParentOrNull())
    ensure(isInterfaceDeclaration(interfaceNode))
    ensure(interfaceNode.name.text == "ReadLineOptions")

    "@Suppress(\"VAR_TYPE_MISMATCH_ON_OVERRIDE\")"
}
