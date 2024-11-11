import ts from "typescript";
import * as karakum from "karakum";

const eventHandlerMethods = new Set([
    "addEventListener",
    "removeEventListener",
])

const openEvents = {}

const overriddenEvents = {}

const ignoredEvents = {
    "electron.d.ts": {
        "WebviewTag": [
            "context-menu"
        ]
    }
}

const eventContainerMap = {}

function extractEventContainer(node) {
    if (
        node.parent
        && ts.isLiteralTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "event"

        && node.parent.parent.parent
        && (
            (
                ts.isMethodDeclaration(node.parent.parent.parent)
                && ts.isIdentifier(node.parent.parent.parent.name)
                && eventHandlerMethods.has(node.parent.parent.parent.name.text)

                && node.parent.parent.parent.parent
                && ts.isClassDeclaration(node.parent.parent.parent.parent)
            )
            || (
                ts.isMethodSignature(node.parent.parent.parent)
                && ts.isIdentifier(node.parent.parent.parent.name)
                && eventHandlerMethods.has(node.parent.parent.parent.name.text)

                && node.parent.parent.parent.parent
                && ts.isInterfaceDeclaration(node.parent.parent.parent.parent)
            )
        )
    ) {
        return node.parent.parent.parent.parent
    }

    return null
}

function extractEventPayload(node, context) {
    if (
        node.parent
        && ts.isLiteralTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "event"

        && node.parent.parent.parent
        && (
            (
                ts.isMethodDeclaration(node.parent.parent.parent)
                && ts.isIdentifier(node.parent.parent.parent.name)
                && node.parent.parent.parent.name.text === "addEventListener"

                && node.parent.parent.parent.parent
                && ts.isClassDeclaration(node.parent.parent.parent.parent)
            )
            || (
                ts.isMethodSignature(node.parent.parent.parent)
                && ts.isIdentifier(node.parent.parent.parent.name)
                && node.parent.parent.parent.name.text === "addEventListener"

                && node.parent.parent.parent.parent
                && ts.isInterfaceDeclaration(node.parent.parent.parent.parent)
            )
        )
    ) {
        const method = node.parent.parent.parent
        const listener = method.parameters[1]

        if (
            listener
            && listener.type
        ) {
            if (ts.isFunctionTypeNode(listener.type)) {
                return listener.type.parameters
            } else if (ts.isTypeReferenceNode(listener.type)) {
                if (
                    ts.isIdentifier(listener.type.typeName)
                    && listener.type.typeName.text === "Function"
                ) {
                    return []
                }

                const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
                const typeChecker = typeScriptService?.program.getTypeChecker()

                const symbol = typeChecker?.getSymbolAtLocation(listener.type.typeName)

                if (
                    symbol
                    && symbol.declarations
                    && symbol.declarations[0]
                    && ts.isTypeAliasDeclaration(symbol.declarations[0])
                    && ts.isFunctionTypeNode(symbol.declarations[0].type)
                ) {
                    return symbol.declarations[0].type.parameters
                }
            }
        }

        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        console.error(`Suspicious listener: ${typeScriptService?.printNode(listener)}`)

        return null
    }

    return null
}

export default {
    setup(context) {
        this.events = new Map()
    },

    traverse(node, context) {
        if (ts.isStringLiteral(node)) {
            const eventContainer = extractEventContainer(node)
            const eventPayload = extractEventPayload(node, context)

            if (!eventContainer) return null
            if (!eventPayload) return null

            const name = eventContainer.name
            if (!name) return null

            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
            const typeChecker = typeScriptService?.program.getTypeChecker()

            const symbol = typeChecker?.getSymbolAtLocation(name)
            if (!symbol) return

            const events = this.events.get(symbol) ?? new Map()

            events.set(node.text, eventPayload)

            this.events.set(symbol, events)
        }
    },

    render(node) {
        if (
            (
                ts.isMethodDeclaration(node)
                || ts.isMethodSignature(node)
            )
            && ts.isIdentifier(node.name)
            && eventHandlerMethods.has(node.name.text)
        ) {
            return ""
        }

        return null
    },

    inject(node, context, render) {
        if (context.type !== karakum.InjectionType.MEMBER) return []

        let name

        if (ts.isClassDeclaration(node) && node.name) {
            name = node.name
        } else if (ts.isInterfaceDeclaration(node)) {
            name = node.name
        }

        if (!name) return []

        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
        const typeChecker = typeScriptService?.program.getTypeChecker()

        const symbol = typeChecker?.getSymbolAtLocation(name)
        if (!symbol) return []

        let events = this.events.get(symbol)
        const mappedContainerName = eventContainerMap[name.text]

        if (mappedContainerName) {
            [, events] = Array.from(this.events.entries())
                    .find(([eventSymbol]) => (
                        eventSymbol.valueDeclaration
                        && ts.isClassDeclaration(eventSymbol.valueDeclaration)
                        && eventSymbol.valueDeclaration.name
                        && eventSymbol.valueDeclaration.name.text === mappedContainerName
                    ))
                ?? []
        }

        if (!events) return []

        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
        const [, moduleOpenEvents] = Array.from(Object.entries(openEvents))
            .find(([fileName]) => sourceFileName.endsWith(fileName))
        ?? []
        const [, moduleOverriddenEvents] = Array.from(Object.entries(overriddenEvents))
            .find(([fileName]) => sourceFileName.endsWith(fileName))
        ?? []
        const [, moduleIgnoredEvents] = Array.from(Object.entries(ignoredEvents))
            .find(([fileName]) => sourceFileName.endsWith(fileName))
        ?? []

        return Array.from(events.entries())
            .map(([eventName, parameters]) => {
                const isOpen = moduleOpenEvents?.[name.text]?.includes(eventName) ?? false
                const isOverridden = moduleOverriddenEvents?.[name.text]?.includes(eventName) ?? false
                const isIgnored = moduleIgnoredEvents?.[name.text]?.includes(eventName) ?? false

                if (isIgnored) return ""

                let modifier = ""

                if (isOpen) {
                    modifier = "open "
                }

                if (isOverridden) {
                    modifier = "override "
                }

                const payload = parameters
                    .map(parameter => (
                        parameter.type
                            ? render(parameter.type)
                            : "Any?"
                    ))
                    .join(", ")

                const key = karakum.identifier(eventName).replaceAll("`", "")

                return (
                    `
@web.events.JsEvent("${eventName}")
${modifier}val ${key}Event: web.events.EventInstance<${payload}, ${name.text}, web.dom.Node>
                    `.trim()
                );
            })
    },

    generate() {
        return []
    },
}
