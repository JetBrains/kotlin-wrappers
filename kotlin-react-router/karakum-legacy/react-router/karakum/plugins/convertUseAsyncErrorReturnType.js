import ts from "typescript";

export default function (node, context, render) {
    if (
        node.kind === ts.SyntaxKind.UnknownKeyword

        && node.parent
        && ts.isFunctionDeclaration(node.parent)
        && node.parent.name
        && node.parent.name.text === "useAsyncError"

        && node.parent.type === node
    ) {
        return "js.errors.JsError?"
    }

    return null
}
