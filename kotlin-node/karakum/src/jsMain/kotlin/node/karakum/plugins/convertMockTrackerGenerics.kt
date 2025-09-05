package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.MethodSignature
import typescript.asArray
import typescript.isConditionalTypeNode
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isTypeOperatorNode
import typescript.isTypeParameterDeclaration
import typescript.isTypeReferenceNode
import typescript.isUnionTypeNode

private fun isMockTrackerMethod(node: MethodSignature) = nullable {
    val classNode = ensureNotNull(node.getParentOrNull())
    ensure(isInterfaceDeclaration(classNode))
    ensure(classNode.name.text == "MockTracker")
} != null

val convertMockTrackerGenerics = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        nullable {
            ensure(isTypeParameterDeclaration(node))
            ensure(
                node.name.text == "MockedObject"
                        || node.name.text == "MethodName"
                        || node.name.text == "PropertyName"
                        || node.name.text == "Implementation"
            )

            val method = ensureNotNull(node.getParentOrNull())
            ensure(isMethodSignature(method))
            ensure(isMockTrackerMethod(method))

            ""
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))

            val parameter = ensureNotNull(node.getParentOrNull())
            ensure(isParameter(parameter))

            val method = ensureNotNull(parameter.getParentOrNull())
            ensure(isMethodSignature(method))
            ensure(isMockTrackerMethod(method))

            when (typeName.text) {
                "MockedObject" -> "Any"
                "MethodName" -> "String"
                "PropertyName" -> "String"
                "Implementation" -> "Function<*>"
                else -> null
            }
        } ?: nullable {
            ensure(isTypeOperatorNode(node))

            val typeTypeReference = node.type
            ensure(isTypeReferenceNode(typeTypeReference))

            val typeName = typeTypeReference.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "MockedObject")

            "String"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "Mock")

            val typeArguments = ensureNotNull(node.typeArguments)
            ensure(isUnionTypeNode(typeArguments.asArray().first()))

            val method = ensureNotNull(node.getParentOrNull())
            ensure(isMethodSignature(method))
            ensure(isMockTrackerMethod(method))
            ensure(method.type === node)

            "Mock<Function<*>>"
        } ?: nullable {
            ensure(isConditionalTypeNode(node))

            val method = ensureNotNull(node.getParentOrNull())
            ensure(isMethodSignature(method))
            ensure(isMockTrackerMethod(method))
            ensure(method.type === node)

            "Mock<Function<*>>"
        } ?: nullable {
            ensure(isIntersectionTypeNode(node))

            val fistType = node.types.asArray().first()
            ensure(isTypeReferenceNode(fistType))

            val firstTypeName = fistType.typeName
            ensure(isIdentifier(firstTypeName))
            ensure(firstTypeName.text == "MockedObject")

            val method = ensureNotNull(node.getParentOrNull())
            ensure(isMethodSignature(method))
            ensure(isMockTrackerMethod(method))
            ensure(method.type === node)

            val secondType = node.types.asArray()[1]

            render(secondType)
                // remove generics
                .removeSuffix("<MockedObject, PropertyName>")
        }
    }
}
