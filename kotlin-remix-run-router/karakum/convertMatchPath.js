const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        ts.isFunctionDeclaration(node)
        && node.name.text === "matchPath"
    ) {
        const name = render(node.name)

        const returnType = render(node.type)

        return `
external fun ${name}(pattern: String, pathname: String): ${returnType}

external fun ${name}(pattern: PathPattern, pathname: String): ${returnType}
        `
    }
    return null
}
