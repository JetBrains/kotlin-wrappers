import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isPropertySignature(node)
        && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
        && ts.isTypeAliasDeclaration(node.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.name)
        && (
            node.parent.parent.parent.name.text === "AgnosticDataNonIndexRouteObject"
            || node.parent.parent.parent.name.text === "AgnosticDataIndexRouteObject"
        )
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
            || node.name.text === "id" // id property is nullable and var in parent type

        return `override ${modifier}${name}: ${type}${nullable ? "?" : ""}`
    }
    return null
}
