package wrappersgenerator.tanstack.react.virtual.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.AnonymousDeclaration
import io.github.sgrishchenko.karakum.extension.plugins.createAnonymousDeclarationPlugin
import io.github.sgrishchenko.karakum.extension.plugins.nameResolverServiceKey
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import js.numbers.contains
import typescript.*
import wrappersgenerator.tanstack.react.virtual.resolveDeclaration

// `useVirtualizer(options: PartialKeys<ReactVirtualizerOptions<S, I>, 'scrollToFn' | ...>)`
val convertUseVirtualizerOptions = createAnonymousDeclarationPlugin { node, context, render ->
    nullable {
        val typeScriptService = context.requireService(typeScriptServiceKey)
        val nameResolverService = context.requireService(nameResolverServiceKey)
        val typeChecker = typeScriptService.program.getTypeChecker()

        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "PartialKeys")

        val optionsReference = ensureNotNull(node.typeArguments?.asArray()?.firstOrNull())
        ensure(isTypeReferenceNode(optionsReference))

        val name = nameResolverService.resolveName(node, context)
        val typeParameters = extractTypeParameters(node, context)

        val properties = typeChecker.getPropertiesOfType(typeChecker.getTypeFromTypeNode(optionsReference))
        ensure(properties.isNotEmpty())

        val partialOptionsType = typeChecker.getTypeFromTypeNode(node)

        var body = properties.map { property ->
            val member = ensureNotNull(property.declarations?.singleOrNull())
            val partialProperty = ensureNotNull(typeChecker.getPropertyOfType(partialOptionsType, property.name))

            if (
                isPropertySignature(member) &&
                member.questionToken == null &&
                SymbolFlags.Optional in partialProperty.flags
            ) {
                "val ${render(member.name)}: ${renderNullable(member.type, true, context, render)}"
            } else {
                render(member)
            }
        }.joinToString("\n")

        for ((from, to) in typeArgumentSubstitutions(optionsReference, context, render)) {
            body = body.replace(Regex("\\b$from\\b"), to)
        }

        AnonymousDeclaration(
            name = name,
            // language=kotlin
            declaration = """
            @kotlinx.js.JsPlainObject
            external interface $name<${renderDeclaration(typeParameters, render)}> {
            $body
            }
            """.trimIndent(),
            reference = "$name<${renderReference(typeParameters, render)}>",
        )
    }
}

// `ReactVirtualizerOptions<Window, TItemElement>` -> `TScrollElement` is `web.window.Window`
private suspend fun typeArgumentSubstitutions(
    reference: TypeReferenceNode,
    context: Context,
    render: Render<Node>,
): Map<String, String> {
    val declaration = resolveDeclaration(reference.typeName, context)

    val typeParameters = when {
        declaration == null -> null
        isTypeAliasDeclaration(declaration) -> declaration.typeParameters
        isInterfaceDeclaration(declaration) -> declaration.typeParameters
        else -> null
    }?.asArray().orEmpty()

    val typeArguments = reference.typeArguments?.asArray().orEmpty()

    return typeParameters
        .zip(typeArguments) { typeParameter, typeArgument ->
            typeParameter.name.text to render(typeArgument)
        }
        .filter { (from, to) -> from != to }
        .toMap()
}
