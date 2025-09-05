package node.karakum.injections

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.GeneratedFile
import io.github.sgrishchenko.karakum.extension.Injection
import io.github.sgrishchenko.karakum.extension.InjectionContext
import io.github.sgrishchenko.karakum.extension.InjectionType
import io.github.sgrishchenko.karakum.extension.Render
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.camelize
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.array.ReadonlyArray
import arrow.core.raise.impure
import arrow.core.raise.nullable
import typescript.DeclarationStatement
import typescript.Node
import typescript.ParameterDeclaration
import typescript.Symbol
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isFunctionTypeNode
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isMethodDeclaration
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isPropertySignature
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode
import typescript.isTypeOperatorNode
import typescript.isTypeReferenceNode

private val eventHandlerMethods = setOf(
    "on",
    "off",
    "once",
    "emit",
    "addListener",
    "removeListener",
    "prependListener",
    "prependOnceListener",
    "listeners",
)

private val openEvents = mapOf<String, Map<String, Set<String>>>()

private val overriddenEvents = mapOf(
    "fs.d.ts" to mapOf(
        "ReadStream" to setOf(
            "close",
            "data",
            "end",
            "error",
            "pause",
            "readable",
            "resume",
        ),
        "WriteStream" to setOf(
            "close",
            "drain",
            "error",
            "finish",
            "pipe",
            "unpipe",
        ),
    ),
)

private val ignoredEvents = mapOf<String, Map<String, Set<String>>>()

private fun extractEventContainer(node: Node): DeclarationStatement? = nullable {
    ensure(isIdentifier(node))
    ensure(node.text == "K")

    val typeReference = ensureNotNull(node.getParentOrNull())
    ensure(isTypeReferenceNode(typeReference))

    val parameter = ensureNotNull(typeReference.getParentOrNull())
    ensure(isParameter(parameter))

    val parameterName = parameter.name
    ensure(isIdentifier(parameterName))
    ensure(parameterName.text == "event")

    nullable {
        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodDeclaration(method))

        val methodName = ensureNotNull(method.name)
        ensure(isIdentifier(methodName))
        ensure(methodName.text in eventHandlerMethods)

        val classNode = ensureNotNull(method.getParentOrNull())
        ensure(isClassDeclaration(classNode))

        classNode
    } ?: nullable {
        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodSignature(method))

        val methodName = ensureNotNull(method.name)
        ensure(isIdentifier(methodName))
        ensure(methodName.text in eventHandlerMethods)

        val interfaceNode = ensureNotNull(method.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))

        interfaceNode
    }
}

private fun extractEventPayloads(node: Node, context: Context) = nullable {
    ensure(isIdentifier(node))
    ensure(node.text == "K")

    val typeReference = ensureNotNull(node.getParentOrNull())
    ensure(isTypeReferenceNode(typeReference))

    val parameter = ensureNotNull(typeReference.getParentOrNull())
    ensure(isParameter(parameter))

    val parameterName = parameter.name
    ensure(isIdentifier(parameterName))
    ensure(parameterName.text == "event")

    val method = ensureNotNull(
        nullable {
            val method = ensureNotNull(parameter.getParentOrNull())
            ensure(isMethodDeclaration(method))

            val methodName = ensureNotNull(method.name)
            ensure(isIdentifier(methodName))
            ensure(methodName.text == "addListener")

            val classNode = ensureNotNull(method.getParentOrNull())
            ensure(isClassDeclaration(classNode))

            method
        } ?: nullable {
            val method = ensureNotNull(parameter.getParentOrNull())
            ensure(isMethodSignature(method))

            val methodName = ensureNotNull(method.name)
            ensure(isIdentifier(methodName))
            ensure(methodName.text == "addListener")

            val interfaceNode = ensureNotNull(method.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))

            method
        }
    )

    val typeParameter = method.typeParameters?.asArray()
        ?.find { it.name.text == "K" }
        .let { ensureNotNull(it) }

    val typeParameterConstraint = ensureNotNull(typeParameter.constraint)
    ensure(isTypeOperatorNode(typeParameterConstraint))

    val typeReferenceConstraintType = typeParameterConstraint.type
    ensure(isTypeReferenceNode(typeReferenceConstraintType))

    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))
    val typeChecker = typeScriptService.program.getTypeChecker()

    val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(typeReferenceConstraintType.typeName))

    val declaration = ensureNotNull(symbol.declarations?.firstOrNull())
    ensure(isTypeAliasDeclaration(declaration))

    val declarationType = declaration.type
    ensure(isIntersectionTypeNode(declarationType))

    val eventMap = declarationType.types.asArray()
        .find { isTypeLiteralNode(it) }
        .let { ensureNotNull(it) }
    ensure(isTypeLiteralNode(eventMap))

    eventMap.members.asArray()
        .mapNotNull { member ->
            nullable {
                ensure(isPropertySignature(member))

                val propertyName = member.name
                ensure(isIdentifier(propertyName))

                val propertyType = ensureNotNull(member.type)
                ensure(isFunctionTypeNode(propertyType))

                propertyName.text to propertyType.parameters.asArray()
            }
        }
        .toMap()
}

class EventMapInjection : Injection {
    private val events = mutableMapOf<Symbol, Map<String, ReadonlyArray<ParameterDeclaration>>>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensureNotNull(isIdentifier(node))

        val eventContainer = ensureNotNull(extractEventContainer(node))
        val eventPayloads = ensureNotNull(extractEventPayloads(node, context))

        val name = ensureNotNull(eventContainer.name)

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(name))

        events[symbol] = eventPayloads
    }

    override fun render(node: Node, context: Context, next: Render<Node>) = nullable {
        val method = ensureNotNull(
            nullable {
                ensure(isMethodDeclaration(node))
                node
            } ?: nullable {
                ensure(isMethodSignature(node))
                node
            }
        )

        val name = ensureNotNull(method.name)
        ensure(isIdentifier(name))
        ensure(name.text in eventHandlerMethods)

        val firstParameter = ensureNotNull(method.parameters.asArray().firstOrNull())

        val firstParameterName = firstParameter.name
        ensure(isIdentifier(firstParameterName))
        ensure(firstParameterName.text == "event")

        val firstParameterType = ensureNotNull(firstParameter.type)
        ensure(isTypeReferenceNode(firstParameterType))

        val firstParameterTypeName = firstParameterType.typeName
        ensure(isIdentifier(firstParameterTypeName))
        ensure(firstParameterTypeName.text == "K")

        ""
    }

    override fun inject(node: Node, context: InjectionContext, render: Render<Node>) = nullable {
        ensure(context.type == InjectionType.MEMBER)

        val name = ensureNotNull(
            nullable {
                ensure(isClassDeclaration(node))
                ensureNotNull(node.name)
            } ?: nullable {
                ensure(isInterfaceDeclaration(node))
                node.name
            }
        )

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(name))

        val symbolEvents = ensureNotNull(events[symbol])

        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

        val moduleOpenEvents = openEvents.entries
            .firstOrNull { (fileName) -> sourceFileName.endsWith(fileName) }
            ?.value

        val moduleOverriddenEvents = overriddenEvents.entries
            .firstOrNull { (fileName) -> sourceFileName.endsWith(fileName) }
            ?.value

        val moduleIgnoredEvents = ignoredEvents.entries
            .firstOrNull { (fileName) -> sourceFileName.endsWith(fileName) }
            ?.value

        symbolEvents.entries
            .map { (eventName, parameters) ->
                val isOpen = moduleOpenEvents?.get(name.text)?.contains(eventName) ?: false
                val isOverridden = moduleOverriddenEvents?.get(name.text)?.contains(eventName) ?: false
                val isIgnored = moduleIgnoredEvents?.get(name.text)?.contains(eventName) ?: false

                if (isIgnored) {
                    ""
                } else {
                    val modifier = when {
                        isOpen -> "open "
                        isOverridden -> "override "
                        else -> ""
                    }

                    val payload = parameters.joinToString(", ") { parameter ->
                        parameter.type?.let { render(it) } ?: "Any?"
                    }

                    val key = camelize(
                        eventName.replace("\\W".toRegex(), "-")
                    )

                    val tuple = if (parameters.isNotEmpty()) {
                        "js.array.Tuple${parameters.size}<${payload}>"
                    } else {
                        "js.array.Tuple"
                    }

                    """
                        @web.events.JsEvent("$eventName")
                        ${modifier}val ${key}Event: node.events.EventInstance<${tuple}>
                    """.trimIndent()
                }
            }
            .toTypedArray()
    }

    override fun generate(context: Context, render: Render<Node>) = emptyArray<GeneratedFile>()
}
