const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Error"
    ) {

        return "Throwable /* JsError */"
    }
    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "Error"
    ) {

        return "Throwable /* JsError */"
    }
    return null
}
