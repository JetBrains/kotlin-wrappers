import ts from "typescript"

export default (node, context) => {
    if (
        context.isAnonymousDeclaration

        && ts.isIntersectionTypeNode(node)

        && node.parent
        && ts.isParameter(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "init"

        && (
            (
                node.parent.parent
                && ts.isMethodSignature(node.parent.parent)
                && node.parent.parent.name.text === "fetch"

                && node.parent.parent.parent
                && ts.isInterfaceDeclaration(node.parent.parent.parent)
                && node.parent.parent.parent.name.text === "Net"
            )
            || (
                node.parent.parent
                && ts.isMethodDeclaration(node.parent.parent)
                && node.parent.parent.name.text === "fetch"

                && node.parent.parent.parent
                && ts.isClassDeclaration(node.parent.parent.parent)
                && node.parent.parent.parent.name
                && node.parent.parent.parent.name.text === "Session"
            )
        )
    ) {
        return `@kotlinx.js.JsPlainObject`
    }

    return null
}
