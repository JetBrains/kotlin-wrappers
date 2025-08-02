package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.renderNullable
import io.github.sgrishchenko.karakum.util.capitalize
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isIntersectionTypeNode
import typescript.isPropertySignature
import typescript.isTypeLiteralNode
import typescript.isTypeReferenceNode

val convertOverriddenFsOptionPropertySignature = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(
            sourceFileName.endsWith("fs.d.ts")
                    || sourceFileName.endsWith("fs/promises.d.ts")
        )

        ensure(isPropertySignature(node))

        val propertyName = node.name
        ensure(isIdentifier(propertyName))

        val typeLiteral = ensureNotNull(node.getParentOrNull())
        ensure(isTypeLiteralNode(typeLiteral))

        ensureNotNull(
            nullable {
                ensure(
                    propertyName.text == "bigint"
                            || propertyName.text == "throwIfNoEntry"
                )
            } ?: nullable {
                ensure(propertyName.text == "recursive")

                val intersection = ensureNotNull(typeLiteral.getParentOrNull())
                ensure(isIntersectionTypeNode(intersection))

                val firstType = ensureNotNull(intersection.types.asArray().firstOrNull())
                ensure(isTypeReferenceNode(firstType))

                val typeName = firstType.typeName
                ensure(isIdentifier(typeName))
                ensure(typeName.text == "MakeDirectoryOptions")
            } ?: nullable {
                ensure(propertyName.text == "encoding")

                val intersection = ensureNotNull(typeLiteral.getParentOrNull())
                ensure(isIntersectionTypeNode(intersection))

                val firstType = ensureNotNull(intersection.types.asArray().firstOrNull())
                ensure(isTypeReferenceNode(firstType))

                val typeName = firstType.typeName
                ensure(isIdentifier(typeName))
                ensure(typeName.text == "WatchOptions")
            }
        )

        val readonly = node.modifiers?.asArray()?.find { it.kind == SyntaxKind.ReadonlyKeyword }

        val modifier = if (readonly != null) "val " else "var "

        val name = render(node.name)

        val isOptional = node.questionToken != null

        val type = renderNullable(node.type, isOptional, context, render)

        val hasAlias = !isOptional

        if (hasAlias) {
            val alias = if (propertyName.text == "bigint") {
                "requiredBigInt"
            } else {
                "required${capitalize(name)}"
            }
            val jsName = "@JsName(\"$name\")"
            val aliasSignature = "${modifier}${alias}: $type"

            arrayOf(
                jsName,
                aliasSignature,
            ).joinToString("\n")
        } else {
            "override ${modifier}${name}: $type"
        }
    }
}
