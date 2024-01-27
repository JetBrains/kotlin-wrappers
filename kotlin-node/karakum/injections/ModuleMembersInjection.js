import ts from "typescript";
import * as karakum from "karakum";

export default {
    setup(context) {
        this.moduleNodes = new Map()
    },

    traverse(node) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("globals.d.ts")
            && ts.isPropertySignature(node)
            && ts.isIdentifier(node.name)
            && node.name.text !== "parent"
            && node.name.text !== "children"

            && node.parent
            && ts.isInterfaceDeclaration(node.parent)
            && node.parent.name.text === "Module"
        ) {
            this.moduleNodes.set(node.name.text, node)
        }
    },

    render(node, context, next) {
        return null
    },

    inject(node, context, render) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("module.d.ts")
            && ts.isClassDeclaration(node)
            && node?.name.text === "Module"
            && !context.static
        ) {
            return Array.from(this.moduleNodes.values())
                .map(member => {
                    return `override ${render(member)}`
                })
                .concat("override var parent: node.Module?")
                .concat("override var children: js.array.ReadonlyArray<node.Module>")
                .join("\n")
        }

        return null
    },

    generate(context) {
        return []
    }
}
