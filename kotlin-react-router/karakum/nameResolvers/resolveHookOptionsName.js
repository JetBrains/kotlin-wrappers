const ts = require("typescript")

module.exports = (node) => {
    if (
        ts.isParameter(node.parent)
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "useHref"
    ) {
        return "UseHrefOptions"
    }

    if (
        ts.isParameter(node.parent)
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "useResolvedPath"
    ) {
        return "UseResolvedPathOptions"
    }

    return null
}
