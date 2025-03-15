import ts from "typescript";
import * as karakum from "../karakum.mjs";

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
        this.bufferConstructorNodes = []
    },

    traverse(node) {
        if (
            ts.isInterfaceDeclaration(node)
            && node.name.text === "BufferConstructor"
        ) {
            this.bufferConstructorNodes.push(node)
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
            const declarationMergingService = context.lookupService(karakum.declarationMergingServiceKey.get())
            if (declarationMergingService?.isCovered(node)) return ""
            declarationMergingService?.cover(node)

            const namespaceInfoService = context.lookupService(karakum.namespaceInfoServiceKey.get())

            const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey.get())

            const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

            const typeParameters = (declarationMergingService?.getTypeParameters(node) ?? node.typeParameters)
                ?.map(typeParameter => next(typeParameter))
                ?.filter(Boolean)
                ?.join(", ")

            const heritageClauses = (declarationMergingService?.getHeritageClauses(node) ?? node.heritageClauses)
                ?.map(heritageClause => next(heritageClause))
                ?.filter(Boolean)
                ?.join(", ")

            const constructors = this.bufferConstructorNodes
                .flatMap(node => node.members)
                .filter(member => ts.isConstructSignatureDeclaration(member))
                .map(member => convertConstructSignatureDeclaration(member, context, next))
                .join("\n")

            const resolveNamespaceStrategy = namespaceInfoService?.resolveNamespaceStrategy?.bind(namespaceInfoService)

            const members = (declarationMergingService?.getMembers(node, resolveNamespaceStrategy) ?? node.members)
                .filter(member => !(
                    ts.isMethodSignature(member)
                    && ts.isIdentifier(member.name)
                    && (
                        // overridden members from Uint8Array
                        member.name.text === "reverse"
                    )
                ))
                .map(member => next(member))
                .join("\n")

            const staticMembers = this.bufferConstructorNodes
                .flatMap(node => node.members)
                .filter(member => !ts.isConstructSignatureDeclaration(member))
                .map(member => next(member))
                .join("\n")

            const companionObject = `
companion object {
${staticMembers}
}
            `

            return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external class Buffer${karakum.ifPresent(typeParameters, it => `<${it}>`)}${karakum.ifPresent(heritageClauses, it => ` : ${it}`)} {
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
