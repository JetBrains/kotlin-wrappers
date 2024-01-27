import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("https.d.ts")
        && ts.isClassDeclaration(node)
        && node.name?.text === "Server"
    ) {
        return `@Suppress("MANY_CLASSES_IN_SUPERTYPE_LIST")`
    }

    if (
        sourceFileName.endsWith("https.d.ts")
        && ts.isExpressionWithTypeArguments(node)
        && ts.isPropertyAccessExpression(node.expression)
        && ts.isIdentifier(node.expression.expression)
        && node.expression.expression.text === "http"
        && ts.isIdentifier(node.expression.name)
        && node.expression.name.text === "Server"

        && node.parent
        && ts.isHeritageClause(node.parent)

        && node.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent)
        && node.parent.parent.name?.text === "Server"
    ) {
        return `@seskar.js.JsMixin`
    }

    return null
}
