const ts = require("typescript")

module.exports = (node) => {
    if (
        ts.isIdentifier(node)
        && node.text === "object"
        && ts.isParameter(node.parent)
    ) {
        return "value"
    }

    return null
}
