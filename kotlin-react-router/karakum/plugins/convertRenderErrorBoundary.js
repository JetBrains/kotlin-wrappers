const ts = require("typescript");

module.exports = function (node) {
    if (
        ts.isClassDeclaration(node)
        && node.name?.text === "RenderErrorBoundary"
    ) {
        return `external val RenderErrorBoundary: react.ComponentType<RenderErrorBoundaryProps>`
    }
    return null
}
