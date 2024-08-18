import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "JsonFunction"
            || node.typeName.text === "LoaderFunction"
            || node.typeName.text === "ActionFunction"
            || node.typeName.text === "Fetcher"
            || node.typeName.text === "Location"
            || node.typeName.text === "DataStrategyFunctionArgs"
            || node.typeName.text === "AgnosticPatchRoutesOnNavigationFunction"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*>`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "UIMatch"
        )
        && !node.typeArguments
    ) {
        return `${render(node.typeName)}<*, *>`
    }

    return null
}
