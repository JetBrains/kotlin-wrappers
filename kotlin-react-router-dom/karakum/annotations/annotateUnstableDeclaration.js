import ts from "typescript"

const unstableDeclarations = [
    "HistoryRouter",
    "usePrompt",
]

export default (node) => {
    if (
        ts.isFunctionDeclaration(node)
        && node.name
        && unstableDeclarations.some(name => node.name.text === name)
    ) {
        return `@JsName("unstable_${node.name.text}")`
    }

    return null
}
