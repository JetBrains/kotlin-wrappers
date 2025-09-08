package typescript.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isIndexedAccessTypeNode
import typescript.isLiteralTypeNode
import typescript.isStringLiteral
import typescript.isTypeReferenceNode

val convertJSDocAugmentsTagClassReference = createPlugin { node, _, _ ->
    nullable {
        ensure(isIndexedAccessTypeNode(node))

        val objectType = node.objectType
        ensure(isTypeReferenceNode(objectType))

        val objectTypeName = objectType.typeName
        ensure(isIdentifier(objectTypeName))
        ensure(objectTypeName.text == "JSDocAugmentsTag")

        val indexType = node.indexType
        ensure(isLiteralTypeNode(indexType))

        val indexTypeLiteral = indexType.literal
        ensure(isStringLiteral(indexTypeLiteral))
        ensure(indexTypeLiteral.text == "class")

        "JSDocAugmentsTagClass"
    } ?: nullable {
        ensure(isIndexedAccessTypeNode(node))

        val objectType = node.objectType
        ensure(isTypeReferenceNode(objectType))

        val objectTypeName = objectType.typeName
        ensure(isIdentifier(objectTypeName))
        ensure(objectTypeName.text == "JSDocImplementsTag")

        val indexType = node.indexType
        ensure(isLiteralTypeNode(indexType))

        val indexTypeLiteral = indexType.literal
        ensure(isStringLiteral(indexTypeLiteral))
        ensure(indexTypeLiteral.text == "class")

        "JSDocImplementsTagClass"
    }
}
