import ts from "typescript"

export default (node) => {
    if (
        node.parent
        && ts.isParameter(node.parent)
        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "useHref"
    ) {
        return "UseHrefOptions"
    }

    if (
        node.parent
        && ts.isParameter(node.parent)
        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "useResolvedPath"
    ) {
        return "UseResolvedPathOptions"
    }

    return null
}
