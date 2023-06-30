const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isHeritageClause(node)
        && node.parent?.name?.text === "WebviewTag"
    ) {
        return ""
    }
    return null
}
