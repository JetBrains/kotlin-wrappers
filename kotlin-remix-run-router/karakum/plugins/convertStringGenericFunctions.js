const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context, render) {
    if (
        ts.isFunctionDeclaration(node)
        && (
            node.name.text === "generatePath"
            || node.name.text === "matchPath"
        )
    ) {
        const name = render(node.name)

        const returnType = render(node.type)

        return karakum.convertParameterDeclarations(node, context, render, {
            strategy: "function",
            template: parameters => {
                // remove generics
                return `external fun ${name}(${parameters}): ${returnType}`
            }
        })
    }
    return null
}
