import ts from "typescript"

export default (node) => {
    if (
        ts.isMethodDeclaration(node)
        && ts.isIdentifier(node.name)
        && (node.name.text === "_write"
            || node.name.text === "_writev"
        )
        && node.parent
        && node.parent.name?.text === "NullWritable"
    ) {
        return "override"
    }

    return null
}
