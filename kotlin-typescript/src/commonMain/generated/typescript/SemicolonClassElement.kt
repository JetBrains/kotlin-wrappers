// Automatically generated - do not modify!

package typescript

/** For when we encounter a semicolon in a class declaration. ES6 allows these as class elements. */
sealed external interface SemicolonClassElement : ClassElement, JSDocContainer, HasJSDoc {
    override val kind: SyntaxKind.SemicolonClassElement
    override val parent: ClassLikeDeclaration
}
