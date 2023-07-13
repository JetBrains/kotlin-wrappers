import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isModuleDeclaration(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "NodeJS"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `/* ${typeScriptService?.printNode(node)} */`;
    }
    return null
}
