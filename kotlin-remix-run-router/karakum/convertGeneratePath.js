const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        ts.isFunctionDeclaration(node)
        && node.name.text === "generatePath"
    ) {
        const name = render(node.name)

        const returnType = render(node.type)

        return `
external fun ${name}(path: String, params: Record<String, String> = definedExternally): ${returnType}
        `
    }
    return null
}
