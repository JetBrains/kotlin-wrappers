const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isMethodSignature(node)
        && (
            node.name.text === "addEventListener"
            || node.name.text === "removeEventListener"
        )

        && ts.isIdentifier(node.parameters[0].name)
        && node.parameters[0].name.text === "type"

        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "WebviewTag"
    ) {
        return ""
    }
    return null
}
