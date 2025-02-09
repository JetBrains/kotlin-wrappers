import ts from "typescript";
import * as karakum from "../karakum.mjs"

export default function (node, context) {
    if (
        ts.isMethodDeclaration(node)
        && ts.isComputedPropertyName(node.name)

        && node.parent
        && ts.isClassDeclaration(node.parent)
        && node.parent.name?.text === "ReadableBase"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

        return `/* ${typeScriptService?.printNode(node)} */`
    }

    return null
}
