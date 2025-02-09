import ts from "typescript"

export default (node) => {
    if (
        ts.isTypeParameterDeclaration(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && (
            node.parent.name.text === "WithImplicitCoercion"

            || node.parent.name.text === "PipelineCallback"
            || node.parent.name.text === "PipelineDestination"
            || node.parent.name.text === "PipelinePromise"
            || node.parent.name.text === "PipelineSource"
            || node.parent.name.text === "PipelineSourceFunction"
            || node.parent.name.text === "PipelineTransform"
            || node.parent.name.text === "PipelineTransformSource"

            || node.parent.name.text === "CustomPromisify"
        )
    ) {
        return `@Suppress("UNUSED_TYPEALIAS_PARAMETER")`
    }

    return null
}
