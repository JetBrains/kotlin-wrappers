package electron.karakum.injections

import arrow.core.raise.impure
import arrow.core.raise.nullable
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
import typescript.DeclarationStatement
import typescript.Node
import typescript.ParameterDeclaration
import typescript.Symbol
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isFunctionTypeNode
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isLiteralTypeNode
import typescript.isMethodDeclaration
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isStringLiteral
import typescript.isTypeAliasDeclaration
import typescript.isTypeReferenceNode

private val eventHandlerMethods = setOf(
    "on",
    "off",
    "once",
    "addListener",
    "removeListener",
)

private val openEvents = mapOf(
    "electron.d.ts" to mapOf(
        "BaseWindow" to setOf(
            "always-on-top-changed",
            "app-command",
            "blur",
            "close",
            "closed",
            "enter-full-screen",
            "focus",
            "hide",
            "leave-full-screen",
            "maximize",
            "minimize",
            "move",
            "moved",
            "new-window-for-tab",
            "resize",
            "resized",
            "restore",
            "rotate-gesture",
            "session-end",
            "sheet-begin",
            "sheet-end",
            "show",
            "swipe",
            "system-context-menu",
            "unmaximize",
            "will-move",
            "will-resize",
        ),
        "View" to setOf(
            "bounds-changed",
        ),
    ),
)

private val overriddenEvents = mapOf(
    "electron.d.ts" to mapOf(
        "BrowserWindow" to setOf(
            "always-on-top-changed",
            "app-command",
            "blur",
            "close",
            "closed",
            "enter-full-screen",
            "focus",
            "hide",
            "leave-full-screen",
            "maximize",
            "minimize",
            "move",
            "moved",
            "new-window-for-tab",
            "resize",
            "resized",
            "restore",
            "rotate-gesture",
            "session-end",
            "sheet-begin",
            "sheet-end",
            "show",
            "swipe",
            "system-context-menu",
            "unmaximize",
            "will-move",
            "will-resize",
        ),
        "WebContentsView" to setOf(
            "bounds-changed"
        )
    )
)

private val ignoredEvents = emptyMap<String, Map<String, Set<String>>>()

private val eventContainerMap = emptyMap<String, String>()

private fun extractEventContainer(node: Node): DeclarationStatement? = nullable {
    val literalType = ensureNotNull(node.getParentOrNull())
    ensure(isLiteralTypeNode(literalType))

    val parameter = ensureNotNull(literalType.getParentOrNull())
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

private fun extractEventPayload(node: Node, context: Context) = nullable {
    val literalType = ensureNotNull(node.getParentOrNull())
    ensure(isLiteralTypeNode(literalType))

    val parameter = ensureNotNull(literalType.getParentOrNull())
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

    val listener = ensureNotNull(method.parameters.asArray().getOrNull(1))

    val listenerType = ensureNotNull(listener.type)

    nullable {
        ensure(isFunctionTypeNode(listenerType))

        listenerType.parameters.asArray()
    } ?: nullable {
        ensure(isTypeReferenceNode(listenerType))

        nullable {
            val listenerTypeName = listenerType.typeName

            ensure(isIdentifier(listenerTypeName))
            ensure(listenerTypeName.text == "Function")

            emptyArray()
        } ?: nullable {
            val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))
            val typeChecker = typeScriptService.program.getTypeChecker()

            val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(listenerType.typeName))

            val declaration = ensureNotNull(symbol.declarations?.firstOrNull())
            ensure(isTypeAliasDeclaration(declaration))

            val declarationType = declaration.type
            ensure(isFunctionTypeNode(declarationType))

            declarationType.parameters.asArray()
        }
    } ?: run {
        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

        console.error("Suspicious listener: ${typeScriptService.printNode(listener)}")

        null
    }
}

class EventInjection : Injection {
    private val events = mutableMapOf<Symbol, MutableMap<String, ReadonlyArray<ParameterDeclaration>>>()

    override fun setup(context: Context) = Unit

    override fun traverse(node: Node, context: Context) = impure {
        ensure(isStringLiteral(node))

        val eventContainer = ensureNotNull(extractEventContainer(node))
        val eventPayload = ensureNotNull(extractEventPayload(node, context))

        val name = ensureNotNull(eventContainer.name)

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(name))

        val symbolEvents = events[symbol] ?: mutableMapOf()

        symbolEvents[node.text] = eventPayload

        events[symbol] = symbolEvents
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
        ensure(isLiteralTypeNode(firstParameterType))

        val firstParameterTypeLiteral = firstParameterType.literal
        ensure(isStringLiteral(firstParameterTypeLiteral))

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

        val mappedContainerName = eventContainerMap[name.text]

        val symbolEvents = ensureNotNull(
            if (mappedContainerName != null) {
                events.firstNotNullOfOrNull { (eventSymbol, it) ->
                    nullable {
                        val valueDeclaration = ensureNotNull(eventSymbol.valueDeclaration)
                        ensure(isClassDeclaration(valueDeclaration))
                        ensure(valueDeclaration.name?.text == mappedContainerName)

                        it
                    }
                }
            } else {
                events[symbol]
            }
        )

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
