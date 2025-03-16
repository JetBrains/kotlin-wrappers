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

export default {
    setup(context) {
        this.readableBaseNode = null
        this.readableStreamMemberNodes = []
    },

    traverse(node) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node.name?.text === "ReadableBase"
        ) {
            this.readableBaseNode = node
        }

        if (
            sourceFileName.endsWith("globals.d.ts")
            && ts.isMethodSignature(node)
            && ts.isIdentifier(node.name)
            && (
                node.name.text === "read"
                || node.name.text === "pipe"
                || node.name.text === "unshift"
            )

            && ts.isInterfaceDeclaration(node.parent)
            && node.parent.name.text === "ReadableStream"
        ) {
            this.readableStreamMemberNodes.push(node)
        }
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node.name?.text === "ReadableBase"
        ) {
            return ""
        }

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isHeritageClause(node)

            && node.parent
            && ts.isClassDeclaration(node.parent)
            && node.parent.name?.text === "Readable"
        ) {
            return this.readableBaseNode.heritageClauses
                ?.map(heritageClause => next(heritageClause))
                ?.join(", ")
        }

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isIdentifier(node)
            && node.text === "ReadableBase"

            && node.parent
            && ts.isExpressionWithTypeArguments(node.parent)
        ) {
            return "Readable"
        }

        return null
    },

    inject(node, context, render) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node?.name.text === "Readable"
            && context.type === "MEMBER"
        ) {
            const readableStreamMembers = this.readableStreamMemberNodes
                .map(member => {
                    const name = karakum.escapeIdentifier(render(member.name))

                    const typeParameters = member.typeParameters
                        ?.map(typeParameter => render(typeParameter))
                        ?.join(", ")

                    const returnType = member.type && render(member.type)

                    return karakum.convertParameterDeclarations(member, context, render, {
                        strategy: "function",
                        defaultValue: "",
                        template: parameters => {
                            return `override fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}`
                        }
                    })
                })

            const readableBaseMembers = this.readableBaseNode.members
                .filter(member => !ts.isConstructorDeclaration(member))
                .filter(member => extractModifiers(member).every(it => it.kind !== ts.SyntaxKind.StaticKeyword))
                .map(member => render(member))

            return [
                ...readableBaseMembers,
                ...readableStreamMembers,
            ]
        }

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node?.name.text === "Readable"
            && context.type === "STATIC_MEMBER"
        ) {
            return this.readableBaseNode.members
                .filter(member => extractModifiers(member).some(it => it.kind === ts.SyntaxKind.StaticKeyword))
                .map(member => render(member))
        }

        return []
    },

    generate(context) {
        return []
    }
}
