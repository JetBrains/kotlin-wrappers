package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

val convertTestContextHeritageClause = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        ensure(isHeritageClause(node))

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "TestContextAssert")

        val types = node.types.asArray()
        ensure(types.size == 1)

        val first = types.first()
        ensure(isExpressionWithTypeArguments(first))

        val typeArguments = ensureNotNull(first.typeArguments?.asArray())
        ensure(typeArguments.size == 2)
        ensure(isImportTypeNode(typeArguments.first()))

        // remove import type node of assert module
        ""
    }
}
