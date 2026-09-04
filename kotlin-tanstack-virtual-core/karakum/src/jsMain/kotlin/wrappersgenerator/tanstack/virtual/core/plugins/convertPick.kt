package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

// `ScrollToEndOptions = Pick<ScrollToOptions, 'behavior'>`
val convertPick = createPlugin { node, context, render ->
    nullable {
        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        ensure(isTypeAliasDeclaration(node))

        val type = node.type
        ensure(isTypeReferenceNode(type))

        val typeName = type.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Pick")

        val typeArguments = ensureNotNull(type.typeArguments?.asArray())
        ensure(typeArguments.size == 2)

        val (source, keys) = typeArguments
        ensure(isTypeReferenceNode(source))

        val keyNames = ensureNotNull(pickedKeyNames(keys))

        val declaration = ensureNotNull(
            typeChecker.getSymbolAtLocation(source.typeName)?.declarations?.singleOrNull(),
        )
        ensure(isInterfaceDeclaration(declaration))

        val members = declaration.members.asArray()
            .filter { member ->
                isPropertySignature(member) && member.name.let { isIdentifier(it) && it.text in keyNames }
            }
            .map { render(it) }
            .joinToString("\n")

        // language=kotlin
        """
        @kotlinx.js.JsPlainObject
        external interface ${render(node.name)} {
        $members
        }
        """.trimIndent()
    }
}

// `'behavior'` / `'behavior' | 'align'`
private fun pickedKeyNames(keys: TypeNode) = nullable {
    val keyTypes = if (isUnionTypeNode(keys)) keys.types.asArray().toList() else listOf(keys)

    keyTypes.mapTo(mutableSetOf()) { key ->
        ensure(isLiteralTypeNode(key))

        val literal = key.literal
        ensure(isStringLiteral(literal))
        literal.text
    }
}
