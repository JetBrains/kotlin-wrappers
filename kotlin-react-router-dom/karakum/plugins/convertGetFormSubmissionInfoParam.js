const ts = require("typescript")

module.exports = (node) => {
    if (
        ts.isTypeLiteralNode(node)
        && ts.isUnionTypeNode(node.parent)
        && ts.isParameter(node.parent.parent)
        && ts.isFunctionDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "getFormSubmissionInfo"
    ) {
        return "js.core.ReadonlyRecord<String, String>"
    }

    return null
}
