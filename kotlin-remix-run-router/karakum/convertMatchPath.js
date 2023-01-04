const ts = require("typescript");
const karakum = require("karakum");

module.exports = function (node, context, render) {
    if (
        ts.isFunctionDeclaration(node)
        && node.name.text === "matchPath"
    ) {
        const name = render(node.name)

        const returnType = render(node.type)

        const signatures = karakum.prepareParameters(node, context)

        return signatures
            .map(signature => {
                const parameters = signature
                    .map(({parameter, type, nullable}) => {
                        return karakum.convertParameterDeclarationWithFixedType(parameter, type, nullable, context, render);
                    })
                    .join(", ")

                return `external fun ${name}(${parameters}): ${returnType}`
            })
            .join("\n\n")
    }
    return null
}
