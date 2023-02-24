const ts = require("typescript")

const unstableDeclarations = [
    "HistoryRouter",
    "usePrompt",
]

module.exports = (node) => {
    if (
        ts.isFunctionDeclaration(node)
        && node.name
        && unstableDeclarations.some(name => node.name.text === name)
    ) {
        return `unstable_${node.name.text}`
    }

    return null
}
