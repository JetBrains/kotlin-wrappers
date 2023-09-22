import ts from "typescript"

export default (node) => {
    if (
        ts.isTypeParameterDeclaration(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "WithImplicitCoercion"
    ) {
        return `@Suppress("UNUSED_TYPEALIAS_PARAMETER")`
    }

    return null
}
