import ts from "typescript";
import * as karakum from "karakum";

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

            const typeParameterNames = node.typeParameters
                ?.map(typeParameter => typeParameter.name.text)
                ?.join(", ")

            const returnType = next(node.type)

            const contractReturns = "returns(true)"
            const parameterName = karakum.escapeIdentifier(next(node.type.parameterName))
            let contractType = next(node.type.type)

            if (name === "isMap") {
                contractType = "js.collections.ReadonlyMap<*, *>"
            }

            if (name === "isSet") {
                contractType = "js.collections.ReadonlySet<*>"
            }

            if (name === "isWeakMap") {
                contractType = "js.collections.WeakMap<*, *>"
            }

            if (name === "isWeakSet") {
                contractType = "js.collections.WeakSet<*>"
            }

            const body = karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                defaultValue: "undefined.unsafeCast<Nothing>()",
                template: (parameters, signature) => {
                    const parameterNames = signature
                        .map((it, index) => (
                            ts.isIdentifier(it.parameter.name)
                                ? karakum.escapeIdentifier(it.parameter.name.text)
                                : `param${index}`
                        ))
                        .join(", ")

                    return `
@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)} {
    kotlin.contracts.contract {
        ${contractReturns} implies (${parameterName} is ${contractType})
    }

    return ${name}Raw${karakum.ifPresent(typeParameterNames, it => `<${it}>`)}(${parameterNames})
}
                    `
                }
            })

            const nodeInfo = {
                sourceFileName,
                namespace,
                fileName: `${name}Contract.kt`,
                body,
            }

            this.contractApiDeclarations.push(nodeInfo)

            return karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: parameters => {
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
