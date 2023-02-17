const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context, render) {
    if (
        ts.isInterfaceDeclaration(node)
        && (
            node.name.text === "Listener"
            || node.name.text === "ActionFunction"
            || node.name.text === "LoaderFunction"
            || node.name.text === "ShouldRevalidateFunction"
            || node.name.text === "GetScrollPositionFunction"
            || node.name.text === "GetScrollRestorationKeyFunction"
            || node.name.text === "RouterSubscriber"
        )
    ) {
        const signature = node.members[0]

        const returnType = render(signature.type)

        return karakum.convertParameterDeclarations(signature, context, render, {
            strategy: "lambda",
            template: parameters => {
                return `typealias ${render(node.name)} = (${parameters}) -> ${returnType}`
            }
        })
    }
    return null
}
