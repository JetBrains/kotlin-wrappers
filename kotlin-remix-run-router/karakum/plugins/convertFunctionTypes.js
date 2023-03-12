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
            || node.name.text === "DetectErrorBoundaryFunction"
            || node.name.text === "LazyRouteFunction"
        )
    ) {
        const signature = node.members[0]

        const name = render(node.name)

        const typeParameters = node.typeParameters
            ?.map(typeParameter => {
                const name = render(typeParameter.name)

                const constraintType = typeParameter.constraint && render(typeParameter.constraint)

                return `${name}${karakum.ifPresent(constraintType, it => ` /* : ${it} */`)}`
            })
            ?.join(", ")

        const returnType = render(signature.type)

        return karakum.convertParameterDeclarations(signature, context, render, {
            strategy: "lambda",
            template: parameters => {
                return `typealias ${name}${karakum.ifPresent(typeParameters, it => `<${it}>`)} = (${parameters}) -> ${returnType}`
            }
        })
    }
    return null
}
