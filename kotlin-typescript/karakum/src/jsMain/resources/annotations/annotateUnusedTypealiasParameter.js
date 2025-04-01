import ts from "typescript"

export default (node) => {
    if (
        ts.isTypeParameterDeclaration(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && (
            node.parent.name.text === "InvalidatedProject"
            || node.parent.name.text === "VisitResult"
        )
    ) {
        return `@Suppress("UNUSED_TYPEALIAS_PARAMETER")`
    }

    if (
        ts.isTypeParameterDeclaration(node)
        && node.name.text === "TOut"
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "Visitor"
    ) {
        return `@Suppress("UNUSED_TYPEALIAS_PARAMETER")`
    }

    return null
}
