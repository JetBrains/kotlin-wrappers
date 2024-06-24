// Automatically generated - do not modify!

package typescript

/** @deprecated */
sealed external interface InputFiles : Node, BundlePrependsItem, NodeFactoryCreateBundlePrependsItem,
    NodeFactoryUpdateBundlePrependsItem {
    override val kind: SyntaxKind.InputFiles
    var javascriptPath: String?
    var javascriptText: String
    var javascriptMapPath: String?
    var javascriptMapText: String?
    var declarationPath: String?
    var declarationText: String
    var declarationMapPath: String?
    var declarationMapText: String?
}
