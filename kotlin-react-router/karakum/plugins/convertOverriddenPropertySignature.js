const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        ts.isPropertySignature(node)
        && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
        && ts.isTypeAliasDeclaration(node.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.name)
        && node.parent.parent.parent.name.text === "DataRouteObject"
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "id"
            || node.name.text === "children"
        )
    ) {
        const readonly = node.modifiers?.find(modifier => modifier.kind === ts.SyntaxKind.ReadonlyKeyword)

        const modifier = readonly
            ? "val "
            : "var "

        const name = render(node.name)

        let type = render(node.type)

        const nullable = node.questionToken

        return `
@Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
override ${modifier}${name}: ${type}${nullable ? "?" : ""}
        `
    }
    return null
}
