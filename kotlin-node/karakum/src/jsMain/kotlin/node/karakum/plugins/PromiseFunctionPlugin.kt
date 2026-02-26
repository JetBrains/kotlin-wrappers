package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.plugins.Signature
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseFunctionPlugin
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
        ensure(isUnionTypeNode(typeArguments.asArray().first()))

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
        ensure(isUnionTypeNode(typeArguments.asArray().first()))

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
        ensure(isUnionTypeNode(typeArguments.asArray().first()))

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
        ensure(isUnionTypeNode(typeArguments.asArray().first()))

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

fun createPromiseFunctionPlugin() = PromiseFunctionPlugin(
    isPromiseType = { node, _ -> isPromiseType(node) },
    exclude = ::isConflictingOverload,
    renderPayload = { node, _, render ->
        val typeName = node.typeName

        if (isIdentifier(typeName) && typeName.text == "PipelinePromise") {
            "Any?"
        } else {
            val typeArguments = requireNotNull(node.typeArguments)
            render(typeArguments.asArray().first())
        }
    }
)
