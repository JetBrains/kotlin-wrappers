import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default function (node, context) {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

    if (
        ts.isTypeReferenceNode(node)
        && typeScriptService.printNode(node) === "inc.IdentifierBase"
    ) {
        return "IdentifierBase"
    }

    return null
}
