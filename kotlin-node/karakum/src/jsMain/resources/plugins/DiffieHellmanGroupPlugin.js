import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default {
    setup(context) {
        this.sourceDiffieHellmanGroupNode = null
    },

    traverse(node) {
        if (
            ts.isClassDeclaration(node)
            && node.name
            && node.name.text === "DiffieHellman"
        ) {
            this.sourceDiffieHellmanGroupNode = node
        }
    },

    render(node, context, next) {
        if (
            ts.isVariableDeclaration(node)
            && ts.isIdentifier(node.name)
            && node.name.text === "DiffieHellmanGroup"
        ) {
            return ""
        }

        if (
            ts.isTypeAliasDeclaration(node)
            && node.name.text === "DiffieHellmanGroup"
        ) {
            return ""
        }

        if (
            ts.isInterfaceDeclaration(node)
            && node.name.text === "DiffieHellmanGroupConstructor"
        ) {
            const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey.get())

            const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

            const ownMembers = node.members
                .filter(member => !(
                    ts.isPropertySignature(member)
                    && ts.isIdentifier(member.name)
                    && member.name.text === "prototype"
                ))
                .map(member => next(member))
                .join("\n")

            const members = this.sourceDiffieHellmanGroupNode.members
                .filter(member => !(
                    ts.isMethodDeclaration(member)
                    && ts.isIdentifier(member.name)
                    && (
                        member.name.text === "setPublicKey"
                        || member.name.text === "setPrivateKey"
                    )
                ))
                .map(member => next(member))
                .join("\n")

            return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external class DiffieHellmanGroup {
${ownMembers}\n${members}
}
            `
        }

        return null
    },

    generate(context) {
        return []
    }
}
