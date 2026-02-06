package testinglibrary.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Plugin
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
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

class QueriesPlugin : Plugin {
    private val promiseApiDeclarations = mutableListOf<DerivedDeclaration>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = Unit

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        ensure(isFunctionDeclaration(node))

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
        ensure(firstParameterTypeArgumentName.text in queryFunctionTypes)

        val returnType = ensureNotNull(node.type)
        ensure(isTypeReferenceNode(returnType))

        val returnTypeName = returnType.typeName
        ensure(isIdentifier(returnTypeName))
        ensure(returnTypeName.text == "ReturnType")

        val returnTypeArgument = ensureNotNull(returnType.typeArguments?.asArray()?.firstOrNull())
        ensure(isTypeReferenceNode(returnTypeArgument))

        val returnTypeArgumentName = returnTypeArgument.typeName
        ensure(isIdentifier(returnTypeArgumentName))
        ensure(returnTypeArgumentName.text in queryFunctionTypes)

        ensure(firstParameterTypeArgumentName.text == returnTypeArgumentName.text)

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(returnTypeArgumentName))

        val declaration = ensureNotNull(symbol.declarations?.firstOrNull())
        ensure(isTypeAliasDeclaration(declaration))

        val declarationType = declaration.type
        ensure(isFunctionTypeNode(declarationType))

        val name = next(ensureNotNull(node.name))

        val typeParameters = node.typeParameters
            ?.asArray()
            ?.map { next(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(separator = ", ")

        val type = declarationType.type
        val renderedReturnType = next(type)

        if (isPromiseType(type)) {
            ensure(isTypeReferenceNode(type))

            val typeArguments = requireNotNull(type.typeArguments)

            val returnTypePayload = next(typeArguments.asArray().first())

            val sourceFileName = node.getSourceFileOrNull()?.fileName ?: "generated.d.ts"

            val namespace = typeScriptService.findClosestNamespace(node)

            val body = convertParameterDeclarations(
                declarationType, context, next,
                ParameterDeclarationsConfiguration(
                    strategy = ParameterDeclarationStrategy.function,
                    template = template@{ parameters, _ ->
                        """
                            @seskar.js.JsAsync
                            external suspend fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnTypePayload) { ": $it" }}
                        """.trimIndent()
                    }
                )
            )

            val nodeInfo = DerivedDeclaration(
                sourceFileName,
                namespace,
                fileName = "${name}.suspend.kt",
                body,
            )

            promiseApiDeclarations += nodeInfo

            convertParameterDeclarations(
                declarationType, context, next,
                ParameterDeclarationsConfiguration(
                    strategy = ParameterDeclarationStrategy.function,
                    template = { parameters, _ ->
                        """
                            @JsName("$name")
                            external fun ${ifPresent(typeParameters) { "<${it}> " }}${name}Async(${parameters})${ifPresent(renderedReturnType) { ": $it" }}
                        """.trimIndent()
                    }
                )
            )
        } else {
            convertParameterDeclarations(
                declarationType, context, next,
                ParameterDeclarationsConfiguration(
                    strategy = ParameterDeclarationStrategy.function,
                    template = { parameters, _ ->
                        """
                            external fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(renderedReturnType) { ": $it" }}
                        """.trimIndent()
                    }
                )
            )
        }
    }

    override fun generate(
        context: Context,
        render: Render<Node>,
    ): ReadonlyArray<GeneratedFile> {
        return generateDerivedDeclarations(promiseApiDeclarations.toTypedArray(), context)
    }

}
