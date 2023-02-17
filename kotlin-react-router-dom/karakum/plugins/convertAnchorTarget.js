const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        ts.isQualifiedName(node)
        && node.right.text === "HTMLAttributeAnchorTarget"
    ) {
        return "web.window.WindowTarget"
    }
    return null
}
