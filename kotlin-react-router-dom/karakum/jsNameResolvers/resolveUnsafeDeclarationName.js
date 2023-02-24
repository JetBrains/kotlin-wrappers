const ts = require("typescript")

const unsafeDeclarations = [
    "useScrollRestoration",
]

module.exports = (node) => {
    if (
        ts.isFunctionDeclaration(node)
        && node.name
        && unsafeDeclarations.some(name => node.name.text === name)
    ) {
        return `UNSAFE_${node.name.text}`
    }

    return null
}
