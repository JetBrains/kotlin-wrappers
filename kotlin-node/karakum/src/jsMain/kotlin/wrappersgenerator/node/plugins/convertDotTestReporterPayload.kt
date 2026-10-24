package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isTypeReferenceNode
import typescript.isUnionTypeNode

val convertDotTestReporterPayload = createPlugin { node, context, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        ensure(isUnionTypeNode(node))

        val typeReference = ensureNotNull(node.parent)
        ensure(isTypeReferenceNode(typeReference))

        val typeReferenceName = typeReference.typeName
        ensure(isIdentifier(typeReferenceName))
        ensure(typeReferenceName.text == "AsyncGenerator")

        val function = ensureNotNull(typeReference.parent)
        ensure(isFunctionDeclaration(function))

        val functionName = ensureNotNull(function.name)
        ensure(functionName.text == "dot")

        val typeScriptService = context.lookupService(typeScriptServiceKey)

        "String /* ${typeScriptService?.printNode(node)} */"
    }
}
