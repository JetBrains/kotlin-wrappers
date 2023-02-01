const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isIdentifier(node)
        && node.parent
        && ts.isExpressionWithTypeArguments(node.parent)
        && node.parent.parent
        && ts.isHeritageClause(node.parent.parent)
        && node.text === "Error"
    ) {

        return "Throwable /* JsError */"
    }
    return null
}
