package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.renderNullable
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isIntersectionTypeNode
import typescript.isLiteralTypeNode
import typescript.isPropertySignature
import typescript.isQualifiedName
import typescript.isStringLiteral
import typescript.isTypeLiteralNode
import typescript.isTypeReferenceNode

val convertOverriddenGcOptionPropertySignature = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("globals.d.ts"))

        ensure(isPropertySignature(node))

        val propertyName = node.name
        ensure(isIdentifier(propertyName))
        ensure(propertyName.text == "execution")

        val propertyType = ensureNotNull(node.type)
        ensure(isLiteralTypeNode(propertyType))

        val propertyTypeLiteral = propertyType.literal
        ensure(isStringLiteral(propertyTypeLiteral))
        ensure(propertyTypeLiteral.text == "async")

        val typeLiteral = ensureNotNull(node.getParentOrNull())
        ensure(isTypeLiteralNode(typeLiteral))

        val intersection = ensureNotNull(typeLiteral.getParentOrNull())
        ensure(isIntersectionTypeNode(intersection))

        val firstType = ensureNotNull(intersection.types.asArray().firstOrNull())
        ensure(isTypeReferenceNode(firstType))

        val typeName = firstType.typeName
        ensure(isQualifiedName(typeName))
        ensure(typeName.right.text == "GCOptions")

        val readonly = node.modifiers?.asArray()?.find { it.kind == SyntaxKind.ReadonlyKeyword }

        val modifier = if (readonly != null) "val " else "var "

        val name = render(node.name)

        val isOptional = node.questionToken != null

        val type = renderNullable(node.type, isOptional, context, render)

        val alias = "asyncExecution"
        val jsName = "@JsName(\"$name\")"
        val aliasSignature = "${modifier}${alias}: $type"

        arrayOf(
            jsName,
            aliasSignature,
        ).joinToString("\n")
    }
}
