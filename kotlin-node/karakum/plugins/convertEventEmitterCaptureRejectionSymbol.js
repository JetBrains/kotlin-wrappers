import ts from "typescript";
import * as karakum from "karakum"

export default function (node, context) {
    if (
        (
            ts.isMethodSignature(node)
            && ts.isComputedPropertyName(node.name)

            && node.parent
            && ts.isInterfaceDeclaration(node.parent)
            && node.parent.name.text === "EventEmitter"
        )
        || (
            ts.isMethodDeclaration(node)
            && ts.isComputedPropertyName(node.name)

            && node.parent
            && ts.isClassDeclaration(node.parent)
            && node.parent.name?.text === "EventEmitter"
        )
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `/* ${typeScriptService?.printNode(node)} */`
    }

    return null
}
