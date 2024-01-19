import ts from "typescript";
import * as karakum from "karakum";

export default {
    setup(context) {
        this.readableStreamMemberNodes = new Map()
    },

    traverse(node) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

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
            this.readableStreamMemberNodes.set(node.name.text, node)
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
            && node?.name.text === "ReadableBase"
            && !context.static
        ) {
            return Array.from(this.readableStreamMemberNodes.values())
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
                .join("\n")
        }

        return null
    },

    generate(context) {
        return []
    }
}
