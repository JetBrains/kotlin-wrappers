import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isIdentifier(node.typeName.left)
        && node.typeName.left.text === "ResultType"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `ResultType /* ${typeScriptService?.printNode(node)} */`
    }
    return null
}
