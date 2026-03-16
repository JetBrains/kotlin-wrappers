package wrappersgenerator.node.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

fun resolveInterfaceMethodReturnTypePromisePayloadName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    val typeReference = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text == "Promise")

    val method = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isMethodSignature(method))
    ensure(method.type === typeReference)

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    val methodName = methodNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = interfaceNode.name.text

    nullable {
        ensure(methodName == "write")
        ensure(parentName == "FileHandle")

        nullable {
            val typeParameter = ensureNotNull(method.typeParameters?.asArray()?.firstOrNull())

            val constraint = ensureNotNull(typeParameter.constraint)
            ensure(isTypeReferenceNode(constraint))

            val constraintTypeName = constraint.typeName
            ensure(isQualifiedName(constraintTypeName))
            ensure(constraintTypeName.right.text == "ArrayBufferView")

            "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}ViewResultPayload"
        } ?: nullable {
            val firstParameter = ensureNotNull(method.parameters.asArray().firstOrNull())

            val firstParameterType = ensureNotNull(firstParameter.type)
            ensure(firstParameterType.kind == SyntaxKind.StringKeyword)

            "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}StringResultPayload"
        }
    } ?: nullable {
        "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}ResultPayload"
    }
}
