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
        this.internalStreamNode = null
    },

    traverse(node) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node.name?.text === "internal"
        ) {
            this.internalStreamNode = node
        }
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node.name?.text === "internal"
        ) {
            return ""
        }

        if (
            ts.isClassDeclaration(node)
            && node.name?.text === "Stream"
        ) {
            const heritageClauses = this.internalStreamNode.heritageClauses
                ?.map(heritageClause => next(heritageClause))
                ?.join(", ")

            const members = [
                ...node.members
                    .filter(member => extractModifiers(member).every(it => it.kind !== ts.SyntaxKind.StaticKeyword)),

                ...this.internalStreamNode.members,
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
open external class Stream${karakum.ifPresent(heritageClauses, it => ` : ${it}`)} {
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
