package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.Node
import typescript.asArray
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isTypeParameterDeclaration
import typescript.isTypeQueryNode
import typescript.isTypeReferenceNode

private fun isInstanceType(node: Node) = nullable {
    ensure(isTypeReferenceNode(node))

    val typeName = node.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text == "InstanceType")
} != null

val convertReporterConstructorWrapperTypeParameter = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("test.d.ts"))

        nullable {
            ensure(isTypeParameterDeclaration(node))

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ReporterConstructorWrapper")
            ensure(node.name.text == "T")

            "T : Transform"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))
            ensure(isInstanceType(node))

            val interfaceNode = node
                .getParentOrNull() // MethodSignature
                ?.getParentOrNull() // InterfaceDeclaration
                .let { ensureNotNull(it) }
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ReporterConstructorWrapper")

            val firstTypeArgument = ensureNotNull(node.typeArguments?.asArray()?.getOrNull(0))

            render(firstTypeArgument)
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "T")

            val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))
            val typeChecker = typeScriptService.program.getTypeChecker()

            val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(node.typeName))

            val typeParameterDeclarations = ensureNotNull(symbol.declarations)
            val typeParameterDeclaration =
                ensureNotNull(typeParameterDeclarations.find { isTypeParameterDeclaration(it) })

            val interfaceNode = ensureNotNull(typeParameterDeclaration.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ReporterConstructorWrapper")

            val parent = ensureNotNull(node.getParentOrNull())
            ensure(!isInstanceType(parent))

            "JsClass<${render(node)}>"
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val typeName = node.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "ReporterConstructorWrapper")

            val firstTypeArgument = ensureNotNull(node.typeArguments?.asArray()?.getOrNull(0))
            ensure(isTypeQueryNode(firstTypeArgument))

            "ReporterConstructorWrapper<${render(firstTypeArgument.exprName)}>"
        }
    }
}
