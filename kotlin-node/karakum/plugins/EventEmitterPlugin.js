import ts from "typescript";
import * as karakum from "karakum";

function extractModifiers(member) {
    if (
        ts.isPropertyDeclaration(member)
        || ts.isMethodDeclaration(member)
        || ts.isConstructorDeclaration(member)
        || ts.isGetAccessorDeclaration(member)
        || ts.isSetAccessorDeclaration(member)
        || ts.isIndexSignatureDeclaration(member)
    ) {
        return Array.from(member.modifiers ?? [])
    }

    return []
}

function isEventEmitterInterfaceNode(node) {
    return (
        ts.isInterfaceDeclaration(node)
        && node.name.text === "EventEmitter"

        && node.parent
        && ts.isModuleBlock(node.parent)

        && node.parent.parent
        && ts.isModuleDeclaration(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "NodeJS"
    )
}

function isEventEmitterClassNode(node) {
    return (
        ts.isClassDeclaration(node)
        && node.name
        && node.name.text === "EventEmitter"
    )
}

function isEventMethod(node) {
    return (
        ts.isMethodSignature(node)
        && node.parameters.length === 1

        && ts.isIdentifier(node.parameters[0].name)
        && (
            node.parameters[0].name.text === "event"
            || node.parameters[0].name.text === "eventName"
        )
    )
}

function isEventListenerMethod(node) {
    return (
        ts.isMethodSignature(node)
        && node.parameters.length === 2

        && ts.isIdentifier(node.parameters[0].name)
        && (
            node.parameters[0].name.text === "event"
            || node.parameters[0].name.text === "eventName"
        )

        && ts.isIdentifier(node.parameters[1].name)
        && node.parameters[1].name.text === "listener"
    )
}

export default {
    setup(context) {
        this.eventEmitterInterfaceNode = null
        this.eventEmitterClassNode = null
    },

    traverse(node) {
        if (isEventEmitterInterfaceNode(node)) {
            this.eventEmitterInterfaceNode = node
        }
        if (isEventEmitterClassNode(node)) {
            this.eventEmitterClassNode = node
        }
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
        if (!sourceFileName.endsWith("events.d.ts")) return null

        if (
            ts.isTypeReferenceNode(node)
            && ts.isIdentifier(node.typeName)
            && node.typeName.text === "Key"
        ) {
            return "EventType<*, *>"
        }

        if (
            ts.isTypeReferenceNode(node)
            && ts.isIdentifier(node.typeName)
            && (
                node.typeName.text === "Listener1"
                || node.typeName.text === "Listener2"
            )
        ) {
            return "Function<Unit>"
        }

        if (
            ts.isTypeReferenceNode(node)
            && ts.isIdentifier(node.typeName)
            && node.typeName.text === "_NodeEventTarget"
        ) {
            return "EventEmitter"
        }

        if (
            ts.isTypeReferenceNode(node)
            && ts.isIdentifier(node.typeName)
            && node.typeName.text === "_DOMEventTarget"
        ) {
            return "EventTarget"
        }

        if (
            ts.isMethodDeclaration(node)

            && node.parent
            && isEventEmitterClassNode(node.parent)
        ) {
            const name = next(node.name)

            const returnType = node.type && next(node.type)

            return karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: (parameters, signature) => {
                    if (signature.some(it => it.type.kind === ts.SyntaxKind.SymbolKeyword)) {
                        return ""
                    }

                    if (
                        signature.length === 3
                        && ts.isTypeReferenceNode(signature[0].type)
                        && (
                            (
                                ts.isIdentifier(signature[0].type.typeName)
                                && signature[0].type.typeName.text === "_NodeEventTarget"
                            )
                            || (
                                ts.isQualifiedName(signature[0].type.typeName)
                                && signature[0].type.typeName.right.text === "EventEmitter"
                            )
                        )
                    ) {
                        const enhancedReturnType = name === "once"
                            ? "Promise<P>"
                            : "AsyncIterableIterator<P>"

                        return `fun <T : EventEmitter, P : JsTuple> ${name}(emitter: T, eventName: EventType<T, P>, options: StaticEventEmitterOptions = definedExternally)${karakum.ifPresent(enhancedReturnType, it => `: ${it}`)}`
                    }

                    if (
                        signature.length === 3
                        && ts.isTypeReferenceNode(signature[0].type)
                        && ts.isIdentifier(signature[0].type.typeName)
                        && (
                            signature[0].type.typeName.text === "_DOMEventTarget"
                            || signature[0].type.typeName.text === "EventTarget"
                        )
                    ) {
                        const enhancedReturnType = name === "once"
                            ? "Promise<JsTuple1<E>>"
                            : "AsyncIterableIterator<JsTuple1<E>>"

                        return `fun <E : Event, T : EventTarget> ${name}(emitter: T, eventName: web.events.EventType<E, T>, options: StaticEventEmitterOptions = definedExternally)${karakum.ifPresent(enhancedReturnType, it => `: ${it}`)}`
                    }

                    if (
                        signature.length === 2
                        && ts.isTypeReferenceNode(signature[0].type)
                        && (
                            (
                                ts.isIdentifier(signature[0].type.typeName)
                                && signature[0].type.typeName.text === "_NodeEventTarget"
                            )
                            || (
                                ts.isQualifiedName(signature[0].type.typeName)
                                && signature[0].type.typeName.right.text === "EventEmitter"
                            )
                        )
                    ) {
                        return `fun <T : EventEmitter> ${name}(emitter: T, eventName: EventType<T, *>)${karakum.ifPresent(returnType, it => `: ${it}`)}`
                    }

                    if (
                        signature.length === 2
                        && ts.isTypeReferenceNode(signature[0].type)
                        && (
                            signature[0].type.typeName.text === "_DOMEventTarget"
                            || signature[0].type.typeName.text === "EventTarget"
                        )
                    ) {
                        return `fun <T : EventTarget> ${name}(emitter: T, eventName: web.events.EventType<*, T>)${karakum.ifPresent(returnType, it => `: ${it}`)}`
                    }

                    return `fun ${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
                }
            })
        }

        if (
            ts.isMethodSignature(node)

            && node.parent
            && isEventEmitterInterfaceNode(node.parent)
        ) {
            const name = next(node.name)

            const isInternal =
                isEventMethod(node)
                || isEventListenerMethod(node)
                || name === "emit"

            const returnType = node.type && next(node.type)

            return karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: parameters => {
                    return `
${isInternal ? `@JsName("${name}")` : ""}
${isInternal ? 'internal ' : ""}fun ${isInternal ? `${name}Internal` : name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}
                    `
                }
            })
        }

        if (
            ts.isClassDeclaration(node)
            && node.name
            && node.name.text === "EventEmitter"
        ) {
            const heritageClauses = node.heritageClauses
                ?.map(heritageClause => next(heritageClause))
                ?.join(", ")

            const members = [
                ...node.members
                    .filter(member => extractModifiers(member).every(it => it.kind !== ts.SyntaxKind.StaticKeyword)),

                ...this.eventEmitterInterfaceNode.members,
            ]
                .map(member => next(member))
                .join("\n")

            const staticMembers = node.members
                .filter(member => extractModifiers(member).some(it => it.kind === ts.SyntaxKind.StaticKeyword))
                .map(member => next(member))
                .join("\n")

            const companionObject = `
companion object {
${staticMembers}
}
            `

            return `
open external class EventEmitter${karakum.ifPresent(heritageClauses, it => ` : ${it}`)} {
${members}\n${companionObject}
}
            `
        }

        return null
    },

    generate(context, render) {
        const declarations = []

        const sourceFileName = this.eventEmitterClassNode.getSourceFile()?.fileName ?? "generated.d.ts"

        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
        const commentService = context.lookupService(karakum.commentServiceKey)

        const namespace = typeScriptService?.findClosest(this.eventEmitterClassNode, ts.isModuleDeclaration)

        for (const member of this.eventEmitterInterfaceNode.members) {
            const comment = commentService?.renderLeadingComments(member) ?? ""

            if (isEventListenerMethod(member)) {
                const name = render(member.name)

                const isDefinedExternally = Boolean(member.parameters[1].questionToken)

                declarations.push(
                    {
                        sourceFileName,
                        namespace,
                        fileName: `EventEmitter.ext.kt`,
                        body: `
${comment}
fun <T : EventEmitter, P : JsTuple> T.${name}(eventName: EventType<T, P>, listener: (P) -> Unit${isDefinedExternally ? ` = undefined.unsafeCast<Nothing>()` : ""}) =
    ${name}Internal(eventName, decorateListener(listener))
                        `,
                    }
                )
            }

            if (isEventMethod(member)) {
                const name = render(member.name)

                const isDefinedExternally = Boolean(member.parameters[0].questionToken)

                declarations.push(
                    {
                        sourceFileName,
                        namespace,
                        fileName: `EventEmitter.ext.kt`,
                        body: `
${comment}
fun <T : EventEmitter> T.${name}(eventName: EventType<T, *>${isDefinedExternally ? ` = undefined.unsafeCast<Nothing>()` : ""}) =
    ${name}Internal(eventName)
                        `,
                    }
                )
            }

            if (
                ts.isMethodSignature(member)
                && ts.isIdentifier(member.name)
                && member.name.text === "emit"
            ) {
                declarations.push(
                    {
                        sourceFileName,
                        namespace,
                        fileName: `EventEmitter.ext.kt`,
                        body: `
${comment}
fun <T : EventEmitter, P : JsTuple> T.emit(eventName: EventType<T, P>, payload: P) =
    emitInternal(eventName, *payload.unsafeCast<Array<*>>())

${comment}
fun <T : EventEmitter> T.emit(eventName: EventType<T, JsTuple>) =
    emitInternal(eventName)
                        `,
                    }
                )
            }
        }

        return karakum.generateDerivedDeclarations(declarations, context)
    }
}
