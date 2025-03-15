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

const openEvents = {
    "stream.d.ts": {
        "Readable": [
            "close",
            "data",
            "end",
            "error",
            "pause",
            "readable",
            "resume",
        ],
        "Writable": [
            "close",
            "drain",
            "error",
            "finish",
            "pipe",
            "unpipe",
        ]
    },
    "net.d.ts": {
        "Server": [
            "close",
            "connection",
            "error",
            "listening",
        ]
    },
    "tls.d.ts": {
        "Server": [
            "keylog",
            "OCSPRequest",
            "secureConnection",
            "tlsClientError",
            "close",
            "connection",
            "error",
            "listening",
            "checkContinue",
            "checkExpectation",
            "clientError",
            "connect",
            "request",
            "upgrade",
        ]
    },
    "http.d.ts": {
        "Server": [
            "checkContinue",
            "checkExpectation",
            "clientError",
            "connect",
            "request",
            "upgrade",
        ]
    },
    "readline.d.ts": {
        "Interface": [
            "close",
            "line",
            "pause",
            "resume",
            "SIGCONT",
            "SIGINT",
            "SIGTSTP",
        ]
    }
}

const overriddenEvents = {
    "stream.d.ts": {
        "Duplex": [
            "close",
            "data",
            "drain",
            "end",
            "error",
            "finish",
            "pause",
            "pipe",
            "readable",
            "resume",
            "unpipe",
        ]
    },
    "http.d.ts": {
        "Server": [
            "close",
            "connection",
            "error",
            "listening",
        ],
        "ClientRequest": [
            "close",
            "drain",
            "error",
            "finish",
            "pipe",
            "unpipe",
        ],
    },
    "http2.d.ts": {
        "Http2ServerRequest": [
            "close",
            "data",
            "end",
            "readable",
            "error",
        ],
        "Http2ServerResponse": [
            "close",
            "drain",
            "error",
            "finish",
            "pipe",
            "unpipe",
        ],
        "Http2Stream": [
            "close",
            "data",
            "drain",
            "end",
            "error",
            "finish",
            "pipe",
            "unpipe",
        ],
    },
    "https.d.ts": {
        "Server": [
            "keylog",
            "OCSPRequest",
            "secureConnection",
            "tlsClientError",
            "close",
            "connection",
            "error",
            "listening",
            "checkContinue",
            "checkExpectation",
            "clientError",
            "connect",
            "request",
            "upgrade",
        ],
    },
    "net.d.ts": {
        "Socket": [
            "close",
            "data",
            "drain",
            "end",
            "error",
        ],
    },
    "repl.d.ts": {
        "REPLServer": [
            "close",
            "line",
            "pause",
            "resume",
            "SIGCONT",
            "SIGINT",
            "SIGTSTP",
        ],
    }
}

const ignoredEvents = {
    "https.d.ts": {
        "Server": [
            "newSession",
            "resumeSession",
            "connection",
        ]
    }
}

const eventContainerMap = {
    "Readable": "ReadableBase",
    "Writable": "WritableBase",
}

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

                const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
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

        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

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

            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
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

            && node.parameters[0]
            && ts.isIdentifier(node.parameters[0].name)
            && node.parameters[0].name.text === "event"

            && node.parameters[0].type
            && ts.isLiteralTypeNode(node.parameters[0].type)
            && ts.isStringLiteral(node.parameters[0].type.literal)
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
