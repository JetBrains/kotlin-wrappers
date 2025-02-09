import ts from "typescript";
import * as karakum from "../karakum.mjs";

function isModuleInterfaceNode(node) {
    return (
        ts.isInterfaceDeclaration(node)
        && node.name.text === "Module"

        && node.parent
        && ts.isModuleBlock(node.parent)

        && node.parent.parent
        && ts.isModuleDeclaration(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "NodeJS"
    )
}

export default {
    setup(context) {
        this.moduleInterfaceNode = null
    },

    traverse(node) {
        if (isModuleInterfaceNode(node)) {
            this.moduleInterfaceNode = node
        }
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("module.d.ts")
            && ts.isHeritageClause(node)

            && node.parent
            && ts.isInterfaceDeclaration(node.parent)
            && node.parent.name.text === "Module"
        ) {
            return ""
        }

        return null
    },

    inject(node, context, render) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            sourceFileName.endsWith("module.d.ts")
            && ts.isClassDeclaration(node)
            && node?.name.text === "Module"
            && context.type === "MEMBER"
        ) {
            return this.moduleInterfaceNode.members
                .map(member => render(member))
        }

        return []
    },

    generate(context, render) {
        return []
    }
}
