import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default function (node, context, render) {
    if (
        ts.isModuleDeclaration(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "NodeJS"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

        return `/* ${typeScriptService?.printNode(node)} */`;
    }
    return null
}
