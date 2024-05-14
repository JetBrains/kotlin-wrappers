import ts from "typescript";
import * as karakum from "karakum";

const eventHandlerMethods = new Set([
    "on",
    "off",
    "once",
    "addListener",
    "removeListener",
])

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
        const listener = method.parameters[1]
        const container = node.parent.parent.parent.parent

        if (
            listener
            && listener.type
        ) {
            const containerTypeParameters = container.typeParameters ?? []
            const extractedTypeParameters = karakum.extractTypeParameters(listener.type, context)

            const typeParameters = containerTypeParameters.map(typeParameter => (
                extractedTypeParameters
                    .find(([, declaration]) => declaration === typeParameter)
            ))

            if (ts.isFunctionTypeNode(listener.type)) {
                return [listener.type.parameters, typeParameters]
            } else if (ts.isTypeReferenceNode(listener.type)) {
                if (
                    ts.isIdentifier(listener.type.typeName)
                    && listener.type.typeName.text === "Function"
                ) {
                    return [[], typeParameters]
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
                    return [symbol.declarations[0].type.parameters, typeParameters]
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
            if (!eventContainer) return null

            const name = eventContainer.name
            if (!name) return null

            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
            const typeChecker = typeScriptService?.program.getTypeChecker()

            const symbol = typeChecker?.getSymbolAtLocation(name)
            if (!symbol) return

            const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
            const namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)

            const events = this.events.get(symbol) ?? {
                sourceFileName,
                namespace,
                containerName: name.text,
                eventInfo: new Map()
            }

            events.eventInfo.set(node.text, {
                payload: "",
                payloadLength: 0,

                typeParameters: "",
                fullTypeParameters: "",
            })

            this.events.set(symbol, events)
        }
    },

    render(node, context, next) {
        if (ts.isStringLiteral(node)) {
            const eventContainer = extractEventContainer(node)
            if (!eventContainer) return null

            const name = eventContainer.name
            if (!name) return null

            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
            const typeChecker = typeScriptService?.program.getTypeChecker()

            const symbol = typeChecker?.getSymbolAtLocation(name)
            if (!symbol) return null

            const events = this.events.get(symbol)
            if (!events) return null

            const eventPayload = extractEventPayload(node, context)
            const eventInfo = events.eventInfo.get(node.text)
            if (eventPayload && eventInfo) {
                const [parameters, typeParameters] = eventPayload

                eventInfo.payload = parameters
                    .map(parameter => (
                        parameter.type
                            ? next(parameter.type)
                            : "Any?"
                    ))
                    .join(", ")

                eventInfo.payloadLength = parameters.length

                eventInfo.typeParameters = typeParameters
                    .filter(Boolean)
                    .map(([, declaration]) => next(declaration))
                    .join(", ")

                eventInfo.fullTypeParameters = typeParameters
                    .map(typeParameter => (
                        typeParameter
                            ? next(typeParameter[0])
                            : "*"
                    ))
                    .join(", ")
            }

            return `${events.containerName}Event.${karakum.constIdentifier(node.text)}`
        }

        return null
    },

    generate(context) {
        const declarations = Array.from(this.events.values()).map(events => {
            const name = `${events.containerName}Event`

            const body = Array.from(events.eventInfo.keys())
                .map(eventName => {
                    const key = karakum.constIdentifier(eventName)

                    return `sealed interface ${key} : node.events.LegacyEventType`;
                })
                .join("\n")

            const legacyCompanionBody = Array.from(events.eventInfo.keys())
                .map(eventName => {
                    const key = karakum.constIdentifier(eventName)

                    return (
                        `
@seskar.js.JsValue("${eventName}")
val ${key}: ${key}
                        `.trim()
                    );
                })
                .join("\n")

            const companionBody = Array.from(events.eventInfo.entries())
                .map(([eventName, { payload, payloadLength, typeParameters, fullTypeParameters }]) => {
                    const key = karakum.identifier(eventName)

                    const tuple = payloadLength > 0
                        ? `js.array.JsTuple${payloadLength}<${payload}>`
                        : "js.array.JsTuple"

                    const targetReference = fullTypeParameters !== ""
                        ? `${events.containerName}<${fullTypeParameters}>`
                        : events.containerName

                    return (
                        `
@seskar.js.JsValue("${eventName}")
fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${key}(): node.events.EventType<${targetReference}, ${tuple}>
                        `.trim()
                    );
                })
                .join("\n")

            const declaration = `
@seskar.js.JsVirtual
sealed external interface ${name} {
${body}

companion object {
${legacyCompanionBody}
${companionBody}
}
}
            `

            return {
                sourceFileName: events.sourceFileName,
                namespace: events.namespace,
                fileName: `${name}.kt`,
                body: declaration,
            }
        })

        return karakum.generateDerivedDeclarations(declarations, context);
    },
}
