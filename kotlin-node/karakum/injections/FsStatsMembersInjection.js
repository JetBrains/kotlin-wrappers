import ts from "typescript";
import * as karakum from "karakum";

export default {
    setup(context) {
        this.statsBaseNodes = new Map()
    },

    traverse(node) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("fs.d.ts")
            && ts.isMethodSignature(node)
            && ts.isIdentifier(node.name)

            && node.parent
            && ts.isInterfaceDeclaration(node.parent)
            && node.parent.name.text === "StatsBase"
        ) {
            this.statsBaseNodes.set(node.name.text + node.parameters.length, node)
        }

        if (
            sourceFileName.endsWith("fs.d.ts")
            && ts.isPropertySignature(node)
            && ts.isIdentifier(node.name)

            && node.parent
            && ts.isInterfaceDeclaration(node.parent)
            && node.parent.name.text === "StatsBase"
        ) {
            this.statsBaseNodes.set(node.name.text, node)
        }
    },

    render(node, context, next) {
        return null
    },

    inject(node, context, render) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("fs.d.ts")
            && ts.isClassDeclaration(node)
            && node?.name.text === "Stats"
            && !context.static
        ) {
            return Array.from(this.statsBaseNodes.values())
                .map(member => {
                    if (ts.isPropertySignature(member)) {
                        const readonly = member.modifiers?.find(modifier => modifier.kind === ts.SyntaxKind.ReadonlyKeyword)

                        const modifier = readonly
                            ? "val "
                            : "var "

                        const name = karakum.escapeIdentifier(render(member.name))

                        const isOptional = Boolean(member.questionToken)

                        let type = karakum.renderNullable(member.type, isOptional, context, render)

                        if (type === "T") {
                            type = "Double"
                        }

                        return `override ${modifier}${name}: ${type}`
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
                .join("\n")
        }

        return null
    },

    generate(context) {
        return []
    }
}
