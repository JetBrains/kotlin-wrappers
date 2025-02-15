import ts from "typescript";
import * as karakum from "../karakum.mjs";

const eventHandlerMethods = new Set([
    "on",
    "off",
    "once",
    "emit",
    "addListener",
    "removeListener",
    "prependListener",
    "prependOnceListener",
    "listeners",
])

const openEvents = {}

const overriddenEvents = {
    "fs.d.ts": {
        "ReadStream": [
            "close",
            "data",
            "end",
            "error",
            "pause",
            "readable",
            "resume",
        ],
        "WriteStream": [
            "close",
            "drain",
            "error",
            "finish",
            "pipe",
            "unpipe",
        ],
    },
}

const ignoredEvents = {}

function extractEventContainer(node) {
    if (
        node.text === "K"

        && node.parent
        && ts.isTypeReferenceNode(node.parent)

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

function extractEventPayloads(node, context) {
    if (
        node.text === "K"

        && node.parent
        && ts.isTypeReferenceNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "event"

        && node.parent.parent.parent
        && (
            (
                ts.isMethodDeclaration(node.parent.parent.parent)
                && ts.isIdentifier(node.parent.parent.parent.name)
                && node.parent.parent.parent.name.text === "addListener"

                && node.parent.parent.parent.parent
                && ts.isClassDeclaration(node.parent.parent.parent.parent)
            )
            || (
                ts.isMethodSignature(node.parent.parent.parent)
                && ts.isIdentifier(node.parent.parent.parent.name)
                && node.parent.parent.parent.name.text === "addListener"

                && node.parent.parent.parent.parent
                && ts.isInterfaceDeclaration(node.parent.parent.parent.parent)
            )
        )
    ) {
        const method = node.parent.parent.parent
        const typeParameter = method.typeParameters?.find(it => it.name.text === "K")

        if (
            typeParameter
            && typeParameter.constraint
            && ts.isTypeOperatorNode(typeParameter.constraint)
            && ts.isTypeReferenceNode(typeParameter.constraint.type)
        ) {
            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
            const typeChecker = typeScriptService?.program.getTypeChecker()

            const symbol = typeChecker?.getSymbolAtLocation(typeParameter.constraint.type.typeName)

            if (
                symbol
                && symbol.declarations
                && symbol.declarations[0]
                && ts.isTypeAliasDeclaration(symbol.declarations[0])
                && ts.isIntersectionTypeNode(symbol.declarations[0].type)
            ) {
                const eventMap = symbol.declarations[0].type.types.find(it => ts.isTypeLiteralNode(it))

                if (
                    eventMap
                    && ts.isTypeLiteralNode(eventMap)
                ) {
                    return eventMap.members.reduce((acc, member) => {
                        if (
                            ts.isPropertySignature(member)
                            && ts.isIdentifier(member.name)

                            && member.type
                            && ts.isFunctionTypeNode(member.type)
                        ) {
                            acc.set(member.name.text, member.type.parameters)
                        }

                        return acc
                    }, new Map())
                }
            }
        }

        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

        console.error(`Suspicious listener: ${typeScriptService?.printNode(listener)}`)
    }

    return null
}

export default {
    setup(context) {
        this.events = new Map()
    },

    traverse(node, context) {
        if (ts.isIdentifier(node)) {
            const eventContainer = extractEventContainer(node)
            const eventPayloads = extractEventPayloads(node, context)

            if (!eventContainer) return null
            if (!eventPayloads) return null

            const name = eventContainer.name
            if (!name) return null

            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
            const typeChecker = typeScriptService?.program.getTypeChecker()

            const symbol = typeChecker?.getSymbolAtLocation(name)
            if (!symbol) return

            this.events.set(symbol, eventPayloads)
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

            && node.parameters[0]
            && ts.isIdentifier(node.parameters[0].name)
            && node.parameters[0].name.text === "event"

            && node.parameters[0].type
            && ts.isTypeReferenceNode(node.parameters[0].type)
            && ts.isIdentifier(node.parameters[0].type.typeName)
            && node.parameters[0].type.typeName.text === "K"
        ) {
            return ""
        }

        return null
    },

    inject(node, context, render) {
        if (context.type !== "MEMBER") return []

        let name

        if (ts.isClassDeclaration(node) && node.name) {
            name = node.name
        } else if (ts.isInterfaceDeclaration(node)) {
            name = node.name
        }

        if (!name) return []

        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
        const typeChecker = typeScriptService?.program.getTypeChecker()

        const symbol = typeChecker?.getSymbolAtLocation(name)
        if (!symbol) return []

        const events = this.events.get(symbol)
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

                const tuple = parameters.length > 0
                    ? `js.array.JsTuple${parameters.length}<${payload}>`
                    : "js.array.JsTuple"

                return (
                    `
@web.events.JsEvent("${eventName}")
${modifier}val ${key}Event: node.events.EventInstance<${tuple}>
                    `.trim()
                );
            })
    },

    generate() {
        return []
    },
}
