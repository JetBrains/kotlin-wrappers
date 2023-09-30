import ts from "typescript";
import * as karakum from "karakum";

function isPromiseType(node) {
    return (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Promise"
    )
}

function isPromiseFunction(node) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    return (
        sourceFileName.endsWith("promises.d.ts")
        && ts.isFunctionDeclaration(node)

        && node.type
        && isPromiseType(node.type)
    )
}

export default {
    setup(context) {
        this.promiseApiDeclarations = []
    },

    traverse() {
    },

    render(node, context, next) {
        const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

        if (
            isPromiseFunction(node)
            && node.name
        ) {
            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

            const namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)

            const name = node.name.text

            const typeParameters = node.typeParameters
                ?.map(typeParameter => next(typeParameter))
                ?.join(", ")

            const promiseReturnType = next(node.type)
            const returnType = next(node.type.typeArguments[0])

            const body = karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                defaultValue: "undefined.unsafeCast<Nothing>()",
                template: (parameters, signature) => {
                    return `
suspend fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}(${parameters})${karakum.ifPresent(returnType, it => `: ${it}`)} =
    ${name}Async(
        ${signature.map((it, index) => ts.isIdentifier(it.parameter.name) ? it.parameter.name.text : `param${index}`).join(", ")}
    ).await()
                    `
                }
            })

            const nodeInfo = {
                sourceFileName,
                namespace,
                fileName: `${name}Suspend.kt`,
                body,
            }

            this.promiseApiDeclarations.push(nodeInfo)

            return karakum.convertParameterDeclarations(node, context, next, {
                strategy: "function",
                template: parameters => {
                    return `
@JsName("${node.name.text}")
external fun ${karakum.ifPresent(typeParameters, it => `<${it}> `)}${name}Async(${parameters})${karakum.ifPresent(promiseReturnType, it => `: ${it}`)}
                    `
                }
            })
        }

        return null
    },

    generate(context) {
        const configurationService = context.lookupService(karakum.configurationServiceKey)
        const configuration = configurationService?.configuration
        if (configuration === undefined) throw new Error("PromiseApiPlugin can't work without ConfigurationService")

        const namespaceInfoService = context.lookupService(karakum.namespaceInfoServiceKey)
        const resolveNamespaceStrategy = namespaceInfoService?.resolveNamespaceStrategy?.bind(namespaceInfoService)
        if (resolveNamespaceStrategy === undefined) throw new Error("PromiseApiPlugin can't work without NamespaceInfoService")

        return karakum.generateDerivedDeclarations(this.promiseApiDeclarations, configuration, resolveNamespaceStrategy);
    },
}
