const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context, render) {
    if (
        ts.isModuleDeclaration(node)
        && ts.isIdentifier(node.name)
        && node.name.text === "NodeJS"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        return `/* ${typeScriptService?.printNode(node)} */`;
    }
    return null
}
