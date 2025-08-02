package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.InheritanceModifierService
import io.github.sgrishchenko.karakum.extension.plugins.inheritanceModifierServiceKey
import io.github.sgrishchenko.karakum.extension.renderNullable
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isMappedTypeNode
import typescript.isTypeAliasDeclaration
import typescript.isTypeParameterDeclaration

val convertSignalConstantsGenerics = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("os.d.ts"))

        nullable {
            ensure(isIdentifier(node))
            ensure(node.text == "key")

            val typeParameter = ensureNotNull(node.getParentOrNull())
            ensure(isTypeParameterDeclaration(typeParameter))

            val mappedType = ensureNotNull(typeParameter.getParentOrNull())
            ensure(isMappedTypeNode(mappedType))

            val typeAlias = ensureNotNull(mappedType.getParentOrNull())
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(typeAlias.name.text == "SignalConstants")

            "Key"
        } ?: nullable {
            ensure(isTypeAliasDeclaration(node))
            ensure(node.name.text == "SignalConstants")

            val typeAliasType = node.type
            ensure(isMappedTypeNode(typeAliasType))

            val inheritanceModifierService =
                ensureNotNull(context.lookupService<InheritanceModifierService>(inheritanceModifierServiceKey))

            val inheritanceModifier = inheritanceModifierService.resolveInheritanceModifier(node, context)
            val accessorsInheritanceModifier = inheritanceModifierService.resolveInheritanceModifier(node.type, context)

            val typeParameters = node.typeParameters?.asArray()?.joinToString(", ") { render(it) }

            val readonly = typeAliasType.readonlyToken != null && typeAliasType.readonlyToken?.kind != SyntaxKind.MinusToken

            val typeParameter = render(typeAliasType.typeParameter)

            val type = renderNullable(typeAliasType.type, true, context, render)

            val getter = """
                ${ifPresent(accessorsInheritanceModifier) { "$it " }}operator fun <${typeParameter}> get(key: Key): $type
            """.trimIndent()

            var setter = ""

            if (!readonly) {
                setter = """
                    ${ifPresent(accessorsInheritanceModifier) { "$it " }}operator fun <${typeParameter}> set(key: Key, value: $type)
                """.trimIndent()
            }

            val accessors = """
                ${getter}${ifPresent(setter) { "\n\n${it}" }}
            """.trimIndent()

            """
                ${ifPresent(inheritanceModifier) { "$it " }}external interface SignalConstants${ifPresent(typeParameters) { "<${it}> "}} {
                $accessors
                }
            """.trimIndent()
        }
    }
}
