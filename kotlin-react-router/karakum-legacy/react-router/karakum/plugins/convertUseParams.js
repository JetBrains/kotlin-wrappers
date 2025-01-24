import ts from "typescript"

export default function (node) {
    if (
        ts.isFunctionDeclaration(node)
        && node.name.text === "useParams"
    ) {
        return "external fun useParams(): Params"
    }
    return null
}
