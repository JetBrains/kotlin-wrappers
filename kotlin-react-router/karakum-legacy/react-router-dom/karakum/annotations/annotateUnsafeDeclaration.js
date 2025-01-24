import ts from "typescript"

const unsafeDeclarations = [
    "useScrollRestoration",
]

export default (node) => {
    if (
        ts.isFunctionDeclaration(node)
        && node.name
        && unsafeDeclarations.some(name => node.name.text === name)
    ) {
        return `@JsName("UNSAFE_${node.name.text}")`
    }

    return null
}
