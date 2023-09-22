import ts from "typescript";
import * as karakum from "karakum";

function convertConstructSignatureDeclaration(node, context, render) {
    return karakum.convertParameterDeclarations(node, context, render, {
        strategy: "function",
        template: parameters => {
            return `constructor (${parameters})`
        }
    })
}

export default {
    setup(context) {
        this.bufferConstructorNode = []
    },

    traverse(node) {
        if (
            ts.isInterfaceDeclaration(node)
            && node.name.text === "BufferConstructor"
        ) {
            this.bufferConstructorNode = node
        }
    },

    render(node, context, next) {
        if (
            ts.isVariableDeclaration(node)
            && ts.isIdentifier(node.name)
            && node.name.text === "Buffer"
        ) {
            return ""
        }

        if (
            ts.isInterfaceDeclaration(node)
            && node.name.text === "BufferConstructor"
        ) {
            return ""
        }

        if (
            ts.isInterfaceDeclaration(node)
            && node.name.text === "Buffer"
        ) {
            const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

            const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

            const heritageClauses = node.heritageClauses
                ?.map(heritageClause => next(heritageClause))
                ?.join(", ")

            const constructors = this.bufferConstructorNode.members
                .filter(member => ts.isConstructSignatureDeclaration(member))
                .map(member => convertConstructSignatureDeclaration(member, context, next))
                .join("\n")

            const members = node.members
                .filter(member => !(
                    ts.isMethodSignature(member)
                    && ts.isIdentifier(member.name)
                    && (
                        // overridden members from Uint8Array
                        member.name.text === "reverse"
                        || member.name.text === "keys"
                        || member.name.text === "values"
                        || member.name.text === "entries"
                    )
                ))
                .map(member => next(member))
                .join("\n")

            const staticMembers = this.bufferConstructorNode.members
                .filter(member => !ts.isConstructSignatureDeclaration(member))
                .map(member => next(member))
                .join("\n")

            const companionObject = `
companion object {
${staticMembers}
}
            `

            return `
@JsModule("node:buffer")
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external class Buffer${karakum.ifPresent(heritageClauses, it => ` : ${it}`)} {
${constructors}\n${members}\n${companionObject}
}
            `
        }

        return null
    },

    generate(context) {
        return []
    }
}
