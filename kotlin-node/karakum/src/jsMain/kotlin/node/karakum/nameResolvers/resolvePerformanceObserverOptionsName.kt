package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.nullable
import typescript.Node
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration
import typescript.isParameter
import typescript.isPropertySignature
import typescript.isTypeLiteralNode
import typescript.isUnionTypeNode

fun resolvePerformanceObserverOptionsName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
    ensure(sourceFileName.endsWith("perf_hooks.d.ts"))

    val parameterType = ensureNotNull(typeScriptService.getParent(node))
    ensure(isUnionTypeNode(parameterType))

    val parameter = ensureNotNull(typeScriptService.getParent(parameterType))
    ensure(isParameter(parameter))

    val parameterNameNode = parameter.name
    ensure(isIdentifier(parameterNameNode))
    val parameterName = parameterNameNode.text
    ensure(parameterName == "options")

    val method = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isMethodDeclaration(method))

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    val methodName = methodNameNode.text
    ensure(methodName == "observe")

    val classNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isClassDeclaration(classNode))
    val parentName = ensureNotNull(classNode.name).text
    ensure(parentName == "PerformanceObserver")

    nullable {
        ensure(isTypeLiteralNode(node))
        ensure(node.members.asArray().any { member ->
            nullable {
                ensure(isPropertySignature(member))

                val propertyName = member.name
                ensure(isIdentifier(propertyName))
                ensure(propertyName.text == "entryTypes")
            } != null
        })

        "PerformanceObserverObserveTypesOptions"
    } ?: run {
        "PerformanceObserverObserveTypeOptions"
    }
}
