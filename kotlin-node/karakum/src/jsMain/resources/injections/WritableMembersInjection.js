import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default {
    setup(context) {
        this.writableStreamMemberNodes = []
    },

    traverse(node) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

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
            return this.writableStreamMemberNodes
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
        }

        return []
    },

    generate(context) {
        return []
    }
}
