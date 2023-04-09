const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        node.kind === ts.SyntaxKind.UnknownKeyword

        && node.parent
        && ts.isFunctionDeclaration(node.parent)
        && node.parent.name
        && node.parent.name.text === "useAsyncError"

        && node.parent.type === node
    ) {
        return "Throwable? /* JsError */"
    }

    return null
}
