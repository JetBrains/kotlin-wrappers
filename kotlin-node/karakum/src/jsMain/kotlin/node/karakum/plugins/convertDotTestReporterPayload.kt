package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isTypeReferenceNode
import typescript.isUnionTypeNode

val convertDotTestReporterPayload = createPlugin { node, context, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        ensure(isUnionTypeNode(node))

        val typeReference = ensureNotNull(node.getParentOrNull())
        ensure(isTypeReferenceNode(typeReference))

        val typeReferenceName = typeReference.typeName
        ensure(isIdentifier(typeReferenceName))
        ensure(typeReferenceName.text == "AsyncGenerator")

        val function = ensureNotNull(typeReference.getParentOrNull())
        ensure(isFunctionDeclaration(function))

        val functionName = ensureNotNull(function.name)
        ensure(functionName.text == "dot")

        val typeScriptService = context.lookupService<TypeScriptService>(typeScriptServiceKey)

        "String /* ${typeScriptService?.printNode(node)} */"
    }
}
