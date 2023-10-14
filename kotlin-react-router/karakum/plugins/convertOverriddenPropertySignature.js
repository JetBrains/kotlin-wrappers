import ts from "typescript";

export default function (node, context, render) {
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
    if (
        ts.isPropertySignature(node)
        && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / FunctionDeclaration
        && ts.isFunctionDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name
        && ts.isIdentifier(node.parent.parent.parent.name)
        && node.parent.parent.parent.name.text === "mapRouteProperties"
        && ts.isIdentifier(node.name)
        && node.name.text === "hasErrorBoundary"
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
