import ts from "typescript";
import * as karakum from "karakum";

export default {
    setup(context) {
        this.readableMemberNodes = []
    },

    traverse(node) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isMethodDeclaration(node)
            && ts.isIdentifier(node.name)
            && (
                node.name.text === "_construct"
                || node.name.text === "destroy"
            )

            && ts.isClassDeclaration(node.parent)
            && node.parent.name?.text === "ReadableBase"
        ) {
            this.readableMemberNodes.push(node)
        }

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isPropertyDeclaration(node)
            && ts.isIdentifier(node.name)
            && node.name.text === "destroyed"

            && ts.isClassDeclaration(node.parent)
            && node.parent.name?.text === "ReadableBase"
        ) {
            this.readableMemberNodes.push(node)
        }
    },

    render(node, context, next) {
        return null
    },

    inject(node, context, render) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("stream.d.ts")
            && ts.isClassDeclaration(node)
            && node?.name.text === "Duplex"
            && context.type === karakum.InjectionType.MEMBER
        ) {
            return this.readableMemberNodes
                .map(member => {
                    if (ts.isPropertyDeclaration(member)) {
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
                .concat("override fun destroy(): Unit /* this */")
        }

        return []
    },

    generate(context) {
        return []
    }
}
