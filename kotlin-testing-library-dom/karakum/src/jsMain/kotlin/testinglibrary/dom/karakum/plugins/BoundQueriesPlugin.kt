package testinglibrary.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertMappedTypeBody
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarationWithFixedType
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.convertTypeLiteralBody
import io.github.sgrishchenko.karakum.extension.plugins.function
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

private val queryFunctionTypes = setOf(
    "QueryByBoundAttribute",
    "AllByBoundAttribute",
    "FindAllByBoundAttribute",
    "GetByBoundAttribute",
    "FindByBoundAttribute",
    "QueryByText",
    "AllByText",
    "FindAllByText",
    "GetByText",
    "FindByText",
    "AllByRole",
    "GetByRole",
    "QueryByRole",
    "FindByRole",
    "FindAllByRole",
)

private fun isPromiseType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text.endsWith("Promise"))
} != null

private fun convertQueryMethod(node: MethodSignature, typeName: Identifier, context: Context, render: Render<Node>) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
    val typeChecker = typeScriptService.program.getTypeChecker()

    val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(typeName))

    val declaration = ensureNotNull(symbol.declarations?.firstOrNull())
    ensure(isTypeAliasDeclaration(declaration))

    val declarationType = declaration.type
    ensure(isFunctionTypeNode(declarationType))

    val name = escapeIdentifier(render(node.name))

    val typeParameters = node.typeParameters
        ?.asArray()
        ?.map { render(it) }
        ?.filter { it.isNotEmpty() }
        ?.joinToString(separator = ", ")

    val type = declarationType.type
    val renderedReturnType = render(type)

    if (isPromiseType(type)) {
        ensure(isTypeReferenceNode(type))

        val promiseDeclaration = convertParameterDeclarations(
            declarationType, context, render,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = { _, signature ->
                    val parameters = signature
                        .drop(1)
                        .joinToString(", ") {
                            convertParameterDeclarationWithFixedType(
                                it.parameter, context, render,
                                ParameterDeclarationConfiguration(
                                    strategy = ParameterDeclarationStrategy.function,
                                    type = it.type,
                                    nullable = it.nullable,
                                )
                            )
                        }

                    """
                        @JsName("$name")
                        fun ${ifPresent(typeParameters) { "<${it}> " }}${name}Async(${parameters})${ifPresent(renderedReturnType) { ": $it" }}
                    """.trimIndent()
                }
            )
        )

        val typeArguments = requireNotNull(type.typeArguments)

        val returnTypePayload = render(typeArguments.asArray().first())

        val suspendDeclaration = convertParameterDeclarations(
            declarationType, context, render,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = { _, signature ->
                    val parameters = signature
                        .drop(1)
                        .joinToString(", ") {
                            convertParameterDeclarationWithFixedType(
                                it.parameter, context, render,
                                ParameterDeclarationConfiguration(
                                    strategy = ParameterDeclarationStrategy.function,
                                    type = it.type,
                                    nullable = it.nullable,
                                )
                            )
                        }

                    """
                        @seskar.js.JsAsync
                        suspend fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnTypePayload) { ": $it" }}
                    """.trimIndent()
                }
            )
        )

        "${promiseDeclaration}\n\n${suspendDeclaration}"
    } else {
        convertParameterDeclarations(
            declarationType, context, render,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = { _, signature ->
                    val parameters = signature
                        .drop(1)
                        .joinToString(", ") {
                            convertParameterDeclarationWithFixedType(
                                it.parameter, context, render,
                                ParameterDeclarationConfiguration(
                                    strategy = ParameterDeclarationStrategy.function,
                                    type = it.type,
                                    nullable = it.nullable,
                                )
                            )
                        }

                    """
                        fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(renderedReturnType) { ": $it" }}
                    """.trimIndent()
                }
            )
        )
    }
}

val BoundQueriesPlugin = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "BoundFunctions")

        // skip generics
        render(typeName)
    } ?: nullable {
        ensure(isTypeAliasDeclaration(node))
        ensure(node.name.text == "BoundFunctions")

        val type = node.type
        ensure(isConditionalTypeNode(type))

        val trueType = type.trueType
        ensure(isIntersectionTypeNode(trueType))

        val name = render(node.name)

        val typeLiterals = trueType.types.asArray().filter { isTypeLiteralNode(it) }
        val mappedType = ensureNotNull(trueType.types.asArray().find { isMappedTypeNode(it) })
        ensure(isMappedTypeNode(mappedType))

        val members = typeLiterals
            .mapNotNull {
                if (!isTypeLiteralNode(it)) return@mapNotNull null
                convertTypeLiteralBody(it, context, render)
            }
            .joinToString(separator = "\n")

        val accessors = convertMappedTypeBody(mappedType, context, render)

        """
            external interface $name {
            ${ifPresent(accessors) { "${it}\n" }}${members}
            }
        """.trimIndent()
    } ?: nullable {
        ensure(isTypeParameterDeclaration(node))

        val mappedType = ensureNotNull(node.getParentOrNull())
        ensure(isMappedTypeNode(mappedType))

        val constraint = ensureNotNull(node.constraint)
        ensure(isTypeOperatorNode(constraint))

        val constraintType = constraint.type
        ensure(isTypeReferenceNode(constraintType))

        val constraintTypeName = constraintType.typeName
        ensure(isIdentifier(constraintTypeName))
        ensure(constraintTypeName.text == "Q")

        val name = render(node.name)

        val renderedConstraintType = node.constraint?.let { render(it) }
        val defaultType = node.default?.let { render(it) }

        val bound = "${ifPresent(renderedConstraintType) { " : $it" }}${ifPresent(defaultType) { " default is $it" }}"

        // skip constraint
        "${name}${ifPresent(bound) { " /* $it */" }}"
    } ?: nullable {
        ensure(isMethodSignature(node))

        val firstParameter = ensureNotNull(node.parameters.asArray().firstOrNull())
        ensureNotNull(firstParameter.dotDotDotToken)

        val firstParameterType = ensureNotNull(firstParameter.type)
        ensure(isTypeReferenceNode(firstParameterType))

        val firstParameterTypeName = firstParameterType.typeName
        ensure(isIdentifier(firstParameterTypeName))
        ensure(firstParameterTypeName.text == "Parameters")

        val firstParameterTypeArgument = ensureNotNull(firstParameterType.typeArguments?.asArray()?.firstOrNull())
        ensure(isTypeReferenceNode(firstParameterTypeArgument))

        val firstParameterTypeArgumentName = firstParameterTypeArgument.typeName
        ensure(isIdentifier(firstParameterTypeArgumentName))
        ensure(firstParameterTypeArgumentName.text == "BoundFunction")

        val firstParameterTypeArgumentTypeArgument = ensureNotNull(firstParameterTypeArgument.typeArguments?.asArray()?.firstOrNull())
        ensure(isTypeReferenceNode(firstParameterTypeArgumentTypeArgument))

        val firstParameterTypeArgumentTypeArgumentName = firstParameterTypeArgumentTypeArgument.typeName
        ensure(isQualifiedName(firstParameterTypeArgumentTypeArgumentName))
        ensure(firstParameterTypeArgumentTypeArgumentName.right.text in queryFunctionTypes)

        val returnType = ensureNotNull(node.type)
        ensure(isTypeReferenceNode(returnType))

        val returnTypeName = returnType.typeName
        ensure(isIdentifier(returnTypeName))
        ensure(returnTypeName.text == "ReturnType")

        val returnTypeArgument = ensureNotNull(returnType.typeArguments?.asArray()?.firstOrNull())
        ensure(isTypeReferenceNode(returnTypeArgument))

        val returnTypeArgumentName = returnTypeArgument.typeName
        ensure(isQualifiedName(returnTypeArgumentName))
        ensure(returnTypeArgumentName.right.text in queryFunctionTypes)

        ensure(firstParameterTypeArgumentTypeArgumentName.right.text == returnTypeArgumentName.right.text)

        convertQueryMethod(node, returnTypeArgumentName.right, context, render)
    }
}

