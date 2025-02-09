import ts from "typescript";
import * as karakum from "../karakum.mjs";

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

export default {
    setup(context) {
        this.eventEmitterInterfaceNode = null
    },

    traverse(node) {
        if (isEventEmitterInterfaceNode(node)) {
            this.eventEmitterInterfaceNode = node
        }
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
        if (!sourceFileName.endsWith("events.d.ts")) return null

        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        if (
            ts.isTypeReferenceNode(node)
            && ts.isIdentifier(node.typeName)
            && node.typeName.text === "Key"
        ) {
            return "EventType"
        }

        if (
            ts.isIntersectionTypeNode(node)
            && node.types[1]
            && ts.isTypeReferenceNode(node.types[1])
            && ts.isIdentifier(node.types[1].typeName)
            && node.types[1].typeName.text === "Key2"
        ) {
            return "EventType"
        }

        if (
            ts.isTypeReferenceNode(node)
            && ts.isIdentifier(node.typeName)
            && (
                node.typeName.text === "Listener1"
                || node.typeName.text === "Listener2"
            )
        ) {
            return "EventListener"
        }

        if (
            ts.isIdentifier(node)
            && node.text === "eventName"

            && node.parent
            && ts.isParameter(node.parent)
            && node.parent.name === node

            && node.parent.parent
            && (
                ts.isMethodDeclaration(node.parent.parent)
                || ts.isMethodSignature(node.parent.parent)
            )
        ) {
            return "type"
        }

        if (
            ts.isMethodDeclaration(node)

            && node.parent
            && isEventEmitterClassNode(node.parent)
        ) {
            if (ts.isComputedPropertyName(node.name)) {
                return `/* ${typeScriptService?.printNode(node)} */`
            }

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
                        && ts.isQualifiedName(signature[0].type.typeName)
                        && signature[0].type.typeName.right.text === "EventEmitter"
                    ) {
                        const enhancedReturnType = name === "once"
                            ? "Promise<P>"
                            : "AsyncIterator<P>"

                        return `fun <P : JsTuple> ${name}(emitter: EventEmitter, type: EventType, options: StaticEventEmitterOptions = definedExternally)${karakum.ifPresent(enhancedReturnType, it => `: ${it}`)}`
                    }

                    if (
                        signature.length === 3
                        && ts.isTypeReferenceNode(signature[0].type)
                        && ts.isIdentifier(signature[0].type.typeName)
                        && signature[0].type.typeName.text === "EventTarget"
                    ) {
                        const enhancedReturnType = name === "once"
                            ? "Promise<JsTuple1<E>>"
                            : "AsyncIterator<JsTuple1<E>>"

                        return `fun <E : Event> ${name}(emitter: EventTarget, type: web.events.EventType<E>, options: StaticEventEmitterOptions = definedExternally)${karakum.ifPresent(enhancedReturnType, it => `: ${it}`)}`
                    }

                    if (
                        signature.length === 2
                        && ts.isTypeReferenceNode(signature[0].type)
                        && ts.isQualifiedName(signature[0].type.typeName)
                        && signature[0].type.typeName.right.text === "EventEmitter"
                    ) {
                        return `fun ${name}(emitter: EventEmitter, type: EventType)${karakum.ifPresent(returnType, it => `: ${it}`)}`
                    }

                    if (
                        signature.length === 2
                        && ts.isTypeReferenceNode(signature[0].type)
                        && signature[0].type.typeName.text === "EventTarget"
                    ) {
                        return `fun ${name}(emitter: EventTarget, type: web.events.EventType<*>)${karakum.ifPresent(returnType, it => `: ${it}`)}`
                    }

                    // remove generics
                    return `fun ${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
                }
            })
        }

        if (
            ts.isMethodSignature(node)

            && node.parent
            && isEventEmitterInterfaceNode(node.parent)
        ) {
            if (ts.isComputedPropertyName(node.name)) {
                return `/* ${typeScriptService?.printNode(node)} */`
            }

            const name = next(node.name)

            const returnType = node.type && next(node.type)

            return karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: parameters => {
                    // remove generics
                    return `fun ${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
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
        return []
    }
}
