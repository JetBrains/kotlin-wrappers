import ts from "typescript"
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Awaited"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `Any? /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
