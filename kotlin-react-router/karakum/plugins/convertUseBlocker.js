import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isFunctionDeclaration(node)
        && node.name
        && node.name.text === "useBlocker"
    ) {
        const name = render(node.name)

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.join(", ")

        const returnType = node.type && render(node.type)

        return karakum.convertParameterDeclarations(node, context, render, {
            strategy: "function",
            template: parameters => {
                return `
@JsName("unstable_${name}")
external fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}
                `
            }
        })
    }

    return null
}
