const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text.endsWith("Props")
        && ts.isTypeReferenceNode(node.type)
        && ts.isQualifiedName(node.type.typeName)
        && node.type.typeName.right.text === "PropsWithChildren"
        && node.type.typeArguments !== undefined
        && ts.isTypeLiteralNode(node.type.typeArguments[0])
    ) {
        const name = render(node.name)

        const members = node.type.typeArguments[0].members
            .map(member => render(member))
            .join("\n")

        return `
external interface ${name} : react.PropsWithChildren {
${members}
}
        `
    }
    return null
}
