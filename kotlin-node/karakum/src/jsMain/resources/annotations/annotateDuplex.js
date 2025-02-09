import ts from "typescript"

export default (node) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("stream.d.ts")
        && ts.isClassDeclaration(node)
        && node.name?.text === "Duplex"
    ) {
        return `@Suppress("MANY_CLASSES_IN_SUPERTYPE_LIST")`
    }

    if (
        sourceFileName.endsWith("stream.d.ts")
        && ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "WritableBase"

        && node.parent
        && ts.isHeritageClause(node.parent)

        && node.parent.parent
        && ts.isClassDeclaration(node.parent.parent)
        && node.parent.parent.name?.text === "Duplex"
    ) {
        return `@seskar.js.JsMixin`
    }

    return null
}
