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

function isNodeEventTargetInterfaceNode(node) {
    return (
        ts.isInterfaceDeclaration(node)
        && node.name.text === "_NodeEventTarget"
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
        if (
            node.kind === ts.SyntaxKind.StringKeyword

            && node.parent
            && ts.isUnionTypeNode(node.parent)

            && node.parent.parent
            && ts.isParameter(node.parent.parent)

            && node.parent.parent.parent
            && ts.isMethodDeclaration(node.parent.parent.parent)

            && node.parent.parent.parent.parent
            && isEventEmitterClassNode(node.parent.parent.parent.parent)
        ) {
            return "EventType"
        }

        if (
            node.kind === ts.SyntaxKind.StringKeyword

            && node.parent
            && ts.isUnionTypeNode(node.parent)

            && node.parent.parent
            && ts.isParameter(node.parent.parent)

            && node.parent.parent.parent
            && ts.isMethodSignature(node.parent.parent.parent)

            && node.parent.parent.parent.parent
            && (
                isEventEmitterInterfaceNode(node.parent.parent.parent.parent)
                || isNodeEventTargetInterfaceNode(node.parent.parent.parent.parent)
            )
        ) {
            return "EventType"
        }

        if (
            ts.isMethodDeclaration(node)

            && node.parent
            && isEventEmitterClassNode(node.parent)
        ) {
            const name = next(node.name)

            const typeParameters = node.typeParameters
                ?.map(typeParameter => next(typeParameter))
                ?.join(", ")

            const returnType = node.type && next(node.type)

            return karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: (parameters, signature) => {
                    if (signature.some(it => it.type.kind === ts.SyntaxKind.SymbolKeyword)) {
                        return ""
                    }

                    return `fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
                }
            })
        }

        if (
            ts.isMethodSignature(node)

            && node.parent
            && (
                isEventEmitterInterfaceNode(node.parent)
                || isNodeEventTargetInterfaceNode(node.parent)
            )
        ) {
            const inheritanceModifier = isEventEmitterInterfaceNode(node.parent)
                ? "open"
                : ""

            const name = next(node.name)

            const typeParameters = node.typeParameters
                ?.map(typeParameter => next(typeParameter))
                ?.join(", ")

            const returnType = node.type && next(node.type)

            return karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: (parameters, signature) => {
                    if (signature.some(it => it.type.kind === ts.SyntaxKind.SymbolKeyword)) {
                        return ""
                    }

                    return `${inheritanceModifier} fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
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

    generate(context) {
        return []
    }
}
