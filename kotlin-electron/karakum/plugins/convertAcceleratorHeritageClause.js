const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isHeritageClause(node)
        && node.parent?.name?.text === "Accelerator"
    ) {
        return ""
    }
    return null
}
