import ts from "typescript"

export default (node) => {
    if (
        ts.isPropertyDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            (
                (
                    node.name.text === "status"
                    || node.name.text === "statusText"
                    || node.name.text === "data"
                )
                && node.parent
                && node.parent.name?.text === "ErrorResponseImpl"
            )
        )
    ) {
        return "override"
    }

    return null
}
