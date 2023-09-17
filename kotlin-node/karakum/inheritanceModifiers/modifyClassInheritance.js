import ts from "typescript"

export default (node) => {
    if (
        ts.isClassDeclaration(node)
        && node.name
        && (
            node.name.text === "Cipher"
            || node.name.text === "Decipher"
        )
    ) {
        return "open"
    }

    return null
}
