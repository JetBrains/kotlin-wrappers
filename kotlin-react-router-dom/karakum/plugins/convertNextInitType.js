const ts = require("typescript")

module.exports = (node, context, render) => {
    if (
        ts.isUnionTypeNode(node)

        && ts.isParameter(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "nextInit"

        && ts.isTypeAliasDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "SetURLSearchParams"
    ) {
        return render(node.types[1])
    }

    return null
}
