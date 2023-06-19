const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isInterfaceDeclaration(node)
        && (
            node.name.text === "NodeRequire"
            || node.name.text === "NodeRequireFunction"
        )
    ) {
        return ""
    }
    return null
}
