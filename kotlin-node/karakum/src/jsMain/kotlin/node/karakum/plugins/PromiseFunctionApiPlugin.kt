package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.plugins.*
import io.github.sgrishchenko.karakum.extension.plugins.Signature
import io.github.sgrishchenko.karakum.structure.derived.DerivedDeclaration
import io.github.sgrishchenko.karakum.structure.derived.generateDerivedDeclarations
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import typescript.*

private fun isPromiseType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text.endsWith("Promise"))
} != null

private fun isPromiseFunction(node: Node) = nullable {
    ensure(isFunctionDeclaration(node))

    val type = ensureNotNull(node.type)
    ensure(isPromiseType(type))
} != null

private fun isConflictingOverload(node: FunctionDeclaration, signature: Signature) = nullable {
    val name = ensureNotNull(node.name)

    nullable {
        ensure(name.text == "mkdir")

        val type = ensureNotNull(node.type)
        ensure(isTypeReferenceNode(type))
        ensure(isPromiseType(type))

        val typeArguments = ensureNotNull(type.typeArguments)
        ensure(isUnionTypeNode( typeArguments.asArray().first()))

        nullable {
            ensure(signature.size == 1)
        } ?: nullable {
            val secondParameter = ensureNotNull(signature.getOrNull(1))

            val secondParameterType = ensureNotNull(secondParameter.type)
            ensure(isTypeReferenceNode(secondParameterType))

            val secondParameterTypeName = secondParameterType.typeName
            ensure(isIdentifier(secondParameterTypeName))
            ensure(secondParameterTypeName.text == "Mode")
        }
    } ?: nullable {
        ensure(
            name.text == "mkdtemp"
                    || name.text == "realpath"
        )

        val type = ensureNotNull(node.type)
        ensure(isTypeReferenceNode(type))
        ensure(isPromiseType(type))

        val typeArguments = ensureNotNull(type.typeArguments)
        ensure(isUnionTypeNode( typeArguments.asArray().first()))

        nullable {
            ensure(signature.size == 1)
        } ?: nullable {
            val secondParameter = ensureNotNull(signature.getOrNull(1))

            val secondParameterType = ensureNotNull(secondParameter.type)
            ensure(isTypeReferenceNode(secondParameterType))

            val secondParameterTypeName = secondParameterType.typeName
            ensure(isIdentifier(secondParameterTypeName))
            ensure(
                secondParameterTypeName.text == "ObjectEncodingOptions"
                        || secondParameterTypeName.text == "BufferEncoding"
            )
        }
    } ?: nullable {
        ensure(name.text == "readlink")

        val type = ensureNotNull(node.type)
        ensure(isTypeReferenceNode(type))
        ensure(isPromiseType(type))

        val typeArguments = ensureNotNull(type.typeArguments)
        ensure(isUnionTypeNode( typeArguments.asArray().first()))

        nullable {
            ensure(signature.size == 1)
        } ?: nullable {
            val secondParameter = ensureNotNull(signature.getOrNull(1))

            val secondParameterType = ensureNotNull(secondParameter.type)
            ensure(isTypeReferenceNode(secondParameterType))

            val secondParameterTypeName = secondParameterType.typeName
            ensure(isIdentifier(secondParameterTypeName))
            ensure(secondParameterTypeName.text == "ObjectEncodingOptions")
        }
    } ?: nullable {
        ensure(name.text == "readdir")

        val type = ensureNotNull(node.type)
        ensure(isTypeReferenceNode(type))
        ensure(isPromiseType(type))

        val typeArguments = ensureNotNull(type.typeArguments)
        ensure(isUnionTypeNode( typeArguments.asArray().first()))

        nullable {
            ensure(signature.size == 1)
        } ?: nullable {
            val secondParameter = ensureNotNull(signature.getOrNull(1))

            val secondParameterType = ensureNotNull(secondParameter.type)
            ensure(isTypeReferenceNode(secondParameterType))

            val secondParameterTypeName = secondParameterType.typeName
            ensure(isIdentifier(secondParameterTypeName))
            ensure(secondParameterTypeName.text == "BufferEncoding")
        } ?: nullable {
            val secondParameter = ensureNotNull(signature.getOrNull(1))

            val secondParameterType = ensureNotNull(secondParameter.type)
            ensure(isIntersectionTypeNode(secondParameterType))

            val secondParameterTypeFirstType = secondParameterType.types.asArray().first()
            ensure(isTypeReferenceNode(secondParameterTypeFirstType))

            val secondParameterTypeFirstTypeName = secondParameterTypeFirstType.typeName
            ensure(isIdentifier(secondParameterTypeFirstTypeName))
            ensure(secondParameterTypeFirstTypeName.text == "ObjectEncodingOptions")
        }
    }
} != null

class PromiseFunctionApiPlugin : Plugin {
    private val promiseApiDeclarations = mutableListOf<DerivedDeclaration>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = Unit

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        val sourceFileName = node.getSourceFileOrNull()?.fileName ?: "generated.d.ts"

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

        val namespace = typeScriptService.findClosestNamespace(node)

        ensure(isFunctionDeclaration(node))
        ensure(isPromiseFunction(node))

        val nameNode = ensureNotNull(node.name)

        val name = escapeIdentifier(next(nameNode))

        val typeParameters = node.typeParameters?.asArray()
            ?.joinToString(", ") { next(it) }

        val returnType = node.type ?.let { next(it) }

        val type = requireNotNull(node.type)
        require(isTypeReferenceNode(type))

        val typeArguments = requireNotNull(type.typeArguments)

        var returnTypePayload = next(typeArguments.asArray().first())

        val typeName = type.typeName

        if (isIdentifier(typeName) && typeName.text == "PipelinePromise") {
            returnTypePayload = "Any?"
        }

        val body = convertParameterDeclarations(
            node, context, next,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = template@{ parameters, signature ->
                    if (isConflictingOverload(node, signature)) return@template ""

                    """
                        @seskar.js.JsAsync
                        external suspend fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnTypePayload) { ": $it"}}
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
            node, context, next,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = template@{ parameters, signature ->
                    if (isConflictingOverload(node, signature)) return@template ""

                    """
                        @JsName("$name")
                        external fun ${ifPresent(typeParameters) { "<${it}> " }}${name}Async(${parameters})${ifPresent(returnType) { ": $it" }}
                    """.trimIndent()
                }
            )
        )
    }

    override fun generate(context: Context, render: Render<Node>): ReadonlyArray<GeneratedFile> {
        return generateDerivedDeclarations(promiseApiDeclarations.toTypedArray(), context)
    }
}
