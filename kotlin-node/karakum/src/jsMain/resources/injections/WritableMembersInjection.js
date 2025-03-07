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
        this.writableBaseNode = null
        this.writableStreamMemberNodes = []
    },

    traverse(node) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node.name?.text === "WritableBase"
        ) {
            this.writableBaseNode = node
        }

        if (
            sourceFileName.endsWith("globals.d.ts")
            && ts.isMethodSignature(node)
            && ts.isIdentifier(node.name)
            && (
                node.name.text === "write"
                || (
                    node.name.text === "end"
                    && node.parameters.length > 1
                )
            )

            && ts.isInterfaceDeclaration(node.parent)
            && node.parent.name.text === "WritableStream"
        ) {
            this.writableStreamMemberNodes.push(node)
        }

        if (
            sourceFileName.endsWith("globals.d.ts")
            && ts.isPropertySignature(node)
            && ts.isIdentifier(node.name)
            && node.name.text === "writable"

            && ts.isInterfaceDeclaration(node.parent)
            && node.parent.name.text === "WritableStream"
        ) {
            this.writableStreamMemberNodes.push(node)
        }
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node.name?.text === "WritableBase"
        ) {
            return ""
        }

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isHeritageClause(node)

            && node.parent
            && ts.isClassDeclaration(node.parent)
            && node.parent.name?.text === "Writable"
        ) {
            return this.writableBaseNode.heritageClauses
                ?.map(heritageClause => next(heritageClause))
                ?.join(", ")
        }

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isIdentifier(node)
            && node.text === "WritableBase"

            && node.parent
            && ts.isExpressionWithTypeArguments(node.parent)
        ) {
            return "Writable"
        }

        return null
    },

    inject(node, context, render) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node?.name.text === "Writable"
            && context.type === "MEMBER"
        ) {
            const writableStreamMembers = this.writableStreamMemberNodes
                .map(member => {
                    if (ts.isPropertySignature(member)) {
                        return `override ${render(member)}`
                    }

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

            const writableBaseMembers = this.writableBaseNode.members
                .filter(member => !ts.isConstructorDeclaration(member))
                .filter(member => extractModifiers(member).every(it => it.kind !== ts.SyntaxKind.StaticKeyword))
                .map(member => render(member))

            return [
                ...writableBaseMembers,
                ...writableStreamMembers,
            ]
        }

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node?.name.text === "Writable"
            && context.type === "STATIC_MEMBER"
        ) {
            return this.writableBaseNode.members
                .filter(member => extractModifiers(member).some(it => it.kind === ts.SyntaxKind.StaticKeyword))
                .map(member => render(member))
        }

        return []
    },

    generate(context) {
        return []
    }
}
