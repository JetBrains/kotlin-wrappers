const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isIdentifier(node)
        && ts.isExpressionWithTypeArguments(node.parent)
        && ts.isHeritageClause(node.parent.parent)
        && node.text === "Error"
    ) {

        return "Throwable /* JsError */"
    }
    return null
}
