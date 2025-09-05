package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIdentifier
import typescript.isLiteralTypeNode
import typescript.isStringLiteral
import typescript.isTypeReferenceNode

val convertKeyUnionReferences = createPlugin { node, _, _ ->
    nullable {
        ensure(isStringLiteral(node))

        val literalType = ensureNotNull(node.getParentOrNull())
        ensure(isLiteralTypeNode(literalType))

        val typeReference = ensureNotNull(literalType.getParentOrNull())
        ensure(isTypeReferenceNode(typeReference))

        val typeName = typeReference.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "KeyExportOptions")

        "KeyFormat.${node.text}"
    }
}
