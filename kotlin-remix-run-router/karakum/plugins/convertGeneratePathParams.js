const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isMappedTypeNode(node)
        && ts.isParameter(node.parent)
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "generatePath"
    ) {
        return "js.core.ReadonlyRecord<String, String>"
    }
    return null
}
