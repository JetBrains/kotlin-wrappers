import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context) {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

    if (
        ts.isTypeReferenceNode(node)
        && typeScriptService.printNode(node) === "inc.IdentifierBase"
    ) {
        return "IdentifierBase"
    }

    return null
}
