import ts from "typescript"

export default (node) => {
    if (
        node.parent
        && ts.isParenthesizedTypeNode(node.parent)

        && node.parent.parent
        && ts.isArrayTypeNode(node.parent.parent)
        && node.parent.parent.elementType === node.parent

        && node.parent.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "useFetchers"
    ) {
        return "UseFetchersResultItem"
    }

    return null
}
