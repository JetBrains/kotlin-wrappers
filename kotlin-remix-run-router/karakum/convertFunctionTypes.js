const ts = require("typescript");

module.exports = function (node, context, render) {
    if (
        ts.isInterfaceDeclaration(node)
        && (
            node.name.text === "Listener"
            || node.name.text === "ActionFunction"
            || node.name.text === "LoaderFunction"
            || node.name.text === "ShouldRevalidateFunction"
        )
    ) {
        const signature = node.members[0]

        const parameters = signature.parameters
            ?.map(parameter => render(parameter))
            ?.join(", ")

        const returnType = render(signature.type)

        return `typealias ${render(node.name)} = (${parameters}) -> ${returnType}`
    }
    return null
}
