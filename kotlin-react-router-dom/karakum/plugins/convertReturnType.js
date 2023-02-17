const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "ReturnType"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        const resolvedType = typeScriptService?.resolveType(node)

        if (!resolvedType) return `Any /* ${typeScriptService?.printNode(node)} */`;

        return render(resolvedType)
    }
    return null
}
