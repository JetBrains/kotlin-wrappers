import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "GlobalEvent"
    ) {
        return "external interface GlobalEvent"
    }
    return null
}
