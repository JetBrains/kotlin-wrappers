package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isLiteralTypeNode
import typescript.ast.`is`.isStringLiteral
import typescript.ast.`is`.isTypeReferenceNode

val convertKeyUnionReferences = createPlugin { node, _, _ ->
    nullable {
        ensure(isStringLiteral(node))

        val literalType = ensureNotNull(node.parent)
        ensure(isLiteralTypeNode(literalType))

        val typeReference = ensureNotNull(literalType.parent)
        ensure(isTypeReferenceNode(typeReference))

        val typeName = typeReference.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "KeyExportOptions")

        "KeyFormat.${node.text}"
    }
}
