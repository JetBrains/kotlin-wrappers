import ts from "typescript";
import * as karakum from "karakum";

function isConflictingOverload(node) {
    return (
        node.name.text === "isIterationStatement"
        && node.parameters[1]
        && node.parameters[1].type
        && ts.isLiteralTypeNode(node.parameters[1].type)
    )
}

export default {
    setup(context) {
        this.contractApiDeclarations = []
    },

    traverse() {
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            ts.isFunctionDeclaration(node)

            && node.type
            && ts.isTypePredicateNode(node.type)
            && !node.type.assertsModifier // TODO: support asserts (returns() implies value)

            && node.name
        ) {
            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

            const namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)

            const name = node.name.text

            const typeParameters = node.typeParameters
                ?.map(typeParameter => next(typeParameter))
                ?.join(", ")

            const returnType = next(node.type)

            const contractReturns = "returns(true)"
            const parameterName = karakum.escapeIdentifier(next(node.type.parameterName))
            const contractType = next(node.type.type)

            const body = karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                defaultValue: "undefined.unsafeCast<Nothing>()",
                template: (parameters, signature) => {
                    if (isConflictingOverload(node, signature)) {
                        return ""
                    }

                    const parameterNames = signature
                        .map((it, index) => (
                            ts.isIdentifier(it.parameter.name)
                                ? karakum.escapeIdentifier(next(it.parameter.name))
                                : `param${index}`
                        ))
                        .join(", ")

                    return `
@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE", "CANNOT_CHECK_FOR_ERASED", "ERROR_IN_CONTRACT_DESCRIPTION")
inline fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)} {
    contract {
        ${contractReturns} implies (${parameterName} is ${contractType})
    }

    return ${name}Raw(${parameterNames})
}
                    `
                }
            })

            const nodeInfo = {
                sourceFileName,
                namespace,
                fileName: `${name}.contract.kt`,
                body,
            }

            this.contractApiDeclarations.push(nodeInfo)

            return karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: (parameters, signature) => {
                    if (isConflictingOverload(node, signature)) {
                        return ""
                    }

                    return `
@JsName("${node.name.text}")
external fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}Raw(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)}
                    `
                }
            })
        }

        return null
    },

    generate(context) {
        return karakum.generateDerivedDeclarations(this.contractApiDeclarations, context);
    },
}
