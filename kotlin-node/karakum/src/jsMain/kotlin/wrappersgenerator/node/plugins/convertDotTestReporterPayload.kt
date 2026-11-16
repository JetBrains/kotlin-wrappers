package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import js.reflect.invoke
import typescript.ast.`is`.isFunctionDeclaration
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isTypeReferenceNode
import typescript.ast.`is`.isUnionTypeNode

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
