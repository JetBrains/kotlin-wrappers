// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript


sealed external interface SyntaxKind {
    sealed interface Unknown : SyntaxKind, TokenSyntaxKind, JSDocSyntaxKind
    sealed interface EndOfFileToken : SyntaxKind, TokenSyntaxKind, JsxTokenSyntaxKind, JSDocSyntaxKind
    sealed interface SingleLineCommentTrivia : SyntaxKind, TriviaSyntaxKind, CommentKind
    sealed interface MultiLineCommentTrivia : SyntaxKind, TriviaSyntaxKind, CommentKind
    sealed interface NewLineTrivia : SyntaxKind, TriviaSyntaxKind, JSDocSyntaxKind
    sealed interface WhitespaceTrivia : SyntaxKind, TriviaSyntaxKind, JSDocSyntaxKind
    sealed interface ShebangTrivia : SyntaxKind, TriviaSyntaxKind
    sealed interface ConflictMarkerTrivia : SyntaxKind, TriviaSyntaxKind, JsxTokenSyntaxKind
    sealed interface NonTextFileMarkerTrivia : SyntaxKind
    sealed interface NumericLiteral : SyntaxKind, LiteralSyntaxKind
    sealed interface BigIntLiteral : SyntaxKind, LiteralSyntaxKind
    sealed interface StringLiteral : SyntaxKind, LiteralSyntaxKind
    sealed interface JsxText : SyntaxKind, LiteralSyntaxKind, JsxTokenSyntaxKind
    sealed interface JsxTextAllWhiteSpaces : SyntaxKind, LiteralSyntaxKind, JsxTokenSyntaxKind
    sealed interface RegularExpressionLiteral : SyntaxKind, LiteralSyntaxKind
    sealed interface NoSubstitutionTemplateLiteral : SyntaxKind, LiteralSyntaxKind
    sealed interface TemplateHead : SyntaxKind, PseudoLiteralSyntaxKind
    sealed interface TemplateMiddle : SyntaxKind, PseudoLiteralSyntaxKind
    sealed interface TemplateTail : SyntaxKind, PseudoLiteralSyntaxKind
    sealed interface OpenBraceToken : SyntaxKind, PunctuationSyntaxKind, JsxTokenSyntaxKind, JSDocSyntaxKind
    sealed interface CloseBraceToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind
    sealed interface OpenParenToken : SyntaxKind, PunctuationSyntaxKind
    sealed interface CloseParenToken : SyntaxKind, PunctuationSyntaxKind
    sealed interface OpenBracketToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind
    sealed interface CloseBracketToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind
    sealed interface DotToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind
    sealed interface DotDotDotToken : SyntaxKind, PunctuationSyntaxKind
    sealed interface SemicolonToken : SyntaxKind, PunctuationSyntaxKind
    sealed interface CommaToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind, BinaryOperator
    sealed interface QuestionDotToken : SyntaxKind, PunctuationSyntaxKind
    sealed interface LessThanToken : SyntaxKind, PunctuationSyntaxKind, JsxTokenSyntaxKind, JSDocSyntaxKind,
        RelationalOperator

    sealed interface LessThanSlashToken : SyntaxKind, PunctuationSyntaxKind, JsxTokenSyntaxKind
    sealed interface GreaterThanToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind, RelationalOperator
    sealed interface LessThanEqualsToken : SyntaxKind, PunctuationSyntaxKind, RelationalOperator
    sealed interface GreaterThanEqualsToken : SyntaxKind, PunctuationSyntaxKind, RelationalOperator
    sealed interface EqualsEqualsToken : SyntaxKind, PunctuationSyntaxKind, EqualityOperator
    sealed interface ExclamationEqualsToken : SyntaxKind, PunctuationSyntaxKind, EqualityOperator
    sealed interface EqualsEqualsEqualsToken : SyntaxKind, PunctuationSyntaxKind, EqualityOperator
    sealed interface ExclamationEqualsEqualsToken : SyntaxKind, PunctuationSyntaxKind, EqualityOperator
    sealed interface EqualsGreaterThanToken : SyntaxKind, PunctuationSyntaxKind
    sealed interface PlusToken : SyntaxKind, PunctuationSyntaxKind, PrefixUnaryOperator, AdditiveOperator
    sealed interface MinusToken : SyntaxKind, PunctuationSyntaxKind, PrefixUnaryOperator, AdditiveOperator
    sealed interface AsteriskToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind, MultiplicativeOperator
    sealed interface AsteriskAsteriskToken : SyntaxKind, PunctuationSyntaxKind
    sealed interface SlashToken : SyntaxKind, PunctuationSyntaxKind, MultiplicativeOperator
    sealed interface PercentToken : SyntaxKind, PunctuationSyntaxKind, MultiplicativeOperator
    sealed interface PlusPlusToken : SyntaxKind, PunctuationSyntaxKind, PrefixUnaryOperator, PostfixUnaryOperator
    sealed interface MinusMinusToken : SyntaxKind, PunctuationSyntaxKind, PrefixUnaryOperator, PostfixUnaryOperator
    sealed interface LessThanLessThanToken : SyntaxKind, PunctuationSyntaxKind, ShiftOperator
    sealed interface GreaterThanGreaterThanToken : SyntaxKind, PunctuationSyntaxKind, ShiftOperator
    sealed interface GreaterThanGreaterThanGreaterThanToken : SyntaxKind, PunctuationSyntaxKind, ShiftOperator
    sealed interface AmpersandToken : SyntaxKind, PunctuationSyntaxKind, BitwiseOperator
    sealed interface BarToken : SyntaxKind, PunctuationSyntaxKind, BitwiseOperator
    sealed interface CaretToken : SyntaxKind, PunctuationSyntaxKind, BitwiseOperator
    sealed interface ExclamationToken : SyntaxKind, PunctuationSyntaxKind, PrefixUnaryOperator
    sealed interface TildeToken : SyntaxKind, PunctuationSyntaxKind, PrefixUnaryOperator
    sealed interface AmpersandAmpersandToken : SyntaxKind, PunctuationSyntaxKind, LogicalOperator
    sealed interface BarBarToken : SyntaxKind, PunctuationSyntaxKind, LogicalOperator
    sealed interface QuestionToken : SyntaxKind, PunctuationSyntaxKind
    sealed interface ColonToken : SyntaxKind, PunctuationSyntaxKind
    sealed interface AtToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind
    sealed interface QuestionQuestionToken : SyntaxKind, PunctuationSyntaxKind, AssignmentOperatorOrHigher
    sealed interface BacktickToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind
    sealed interface HashToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind
    sealed interface EqualsToken : SyntaxKind, PunctuationSyntaxKind, JSDocSyntaxKind, AssignmentOperator
    sealed interface PlusEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface MinusEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface AsteriskEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface AsteriskAsteriskEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface SlashEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface PercentEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface LessThanLessThanEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface GreaterThanGreaterThanEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface GreaterThanGreaterThanGreaterThanEqualsToken : SyntaxKind, PunctuationSyntaxKind,
        CompoundAssignmentOperator

    sealed interface AmpersandEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface BarEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface BarBarEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator,
        LogicalOrCoalescingAssignmentOperator

    sealed interface AmpersandAmpersandEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator,
        LogicalOrCoalescingAssignmentOperator

    sealed interface QuestionQuestionEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator,
        LogicalOrCoalescingAssignmentOperator

    sealed interface CaretEqualsToken : SyntaxKind, PunctuationSyntaxKind, CompoundAssignmentOperator
    sealed interface Identifier : SyntaxKind, TokenSyntaxKind, JSDocSyntaxKind
    sealed interface PrivateIdentifier : SyntaxKind
    sealed interface BreakKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface CaseKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface CatchKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface ClassKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface ConstKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface ContinueKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface DebuggerKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface DefaultKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface DeleteKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface DoKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface ElseKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface EnumKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface ExportKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface ExtendsKeyword : SyntaxKind, KeywordSyntaxKind, HeritageClauseToken
    sealed interface FalseKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface FinallyKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface ForKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface FunctionKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface IfKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface ImportKeyword : SyntaxKind, KeywordSyntaxKind, MetaPropertyKeywordToken
    sealed interface InKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind, RelationalOperator
    sealed interface InstanceOfKeyword : SyntaxKind, KeywordSyntaxKind, RelationalOperator
    sealed interface NewKeyword : SyntaxKind, KeywordSyntaxKind, MetaPropertyKeywordToken
    sealed interface NullKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface ReturnKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface SuperKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface SwitchKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface ThisKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface ThrowKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface TrueKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface TryKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface TypeOfKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface VarKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface VoidKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface WhileKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface WithKeyword : SyntaxKind, KeywordSyntaxKind, ImportAttributesToken
    sealed interface ImplementsKeyword : SyntaxKind, KeywordSyntaxKind, HeritageClauseToken
    sealed interface InterfaceKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface LetKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface PackageKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface PrivateKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface ProtectedKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface PublicKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface StaticKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface YieldKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface AbstractKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface AccessorKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface AsKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface AssertsKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface AssertKeyword : SyntaxKind, KeywordSyntaxKind, ImportAttributesToken
    sealed interface AnyKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface AsyncKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface AwaitKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface BooleanKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface ConstructorKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface DeclareKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface GetKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface InferKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface IntrinsicKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface IsKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface KeyOfKeyword : SyntaxKind, KeywordSyntaxKind, TypeOperatorNodeOperator
    sealed interface ModuleKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface NamespaceKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface NeverKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface OutKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface ReadonlyKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind, TypeOperatorNodeOperator
    sealed interface RequireKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface NumberKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface ObjectKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface SatisfiesKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface SetKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface StringKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface SymbolKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface TypeKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface UndefinedKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface UniqueKeyword : SyntaxKind, KeywordSyntaxKind, TypeOperatorNodeOperator
    sealed interface UnknownKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface UsingKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface FromKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface GlobalKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface BigIntKeyword : SyntaxKind, KeywordSyntaxKind, KeywordTypeSyntaxKind
    sealed interface OverrideKeyword : SyntaxKind, KeywordSyntaxKind, ModifierSyntaxKind
    sealed interface OfKeyword : SyntaxKind, KeywordSyntaxKind
    sealed interface QualifiedName : SyntaxKind
    sealed interface ComputedPropertyName : SyntaxKind
    sealed interface TypeParameter : SyntaxKind
    sealed interface Parameter : SyntaxKind
    sealed interface Decorator : SyntaxKind
    sealed interface PropertySignature : SyntaxKind
    sealed interface PropertyDeclaration : SyntaxKind
    sealed interface MethodSignature : SyntaxKind
    sealed interface MethodDeclaration : SyntaxKind
    sealed interface ClassStaticBlockDeclaration : SyntaxKind
    sealed interface Constructor : SyntaxKind
    sealed interface GetAccessor : SyntaxKind
    sealed interface SetAccessor : SyntaxKind
    sealed interface CallSignature : SyntaxKind
    sealed interface ConstructSignature : SyntaxKind
    sealed interface IndexSignature : SyntaxKind
    sealed interface TypePredicate : SyntaxKind
    sealed interface TypeReference : SyntaxKind
    sealed interface FunctionType : SyntaxKind, FunctionOrConstructorTypeNodeBaseKind
    sealed interface ConstructorType : SyntaxKind, FunctionOrConstructorTypeNodeBaseKind
    sealed interface TypeQuery : SyntaxKind
    sealed interface TypeLiteral : SyntaxKind
    sealed interface ArrayType : SyntaxKind
    sealed interface TupleType : SyntaxKind
    sealed interface OptionalType : SyntaxKind
    sealed interface RestType : SyntaxKind
    sealed interface UnionType : SyntaxKind
    sealed interface IntersectionType : SyntaxKind
    sealed interface ConditionalType : SyntaxKind
    sealed interface InferType : SyntaxKind
    sealed interface ParenthesizedType : SyntaxKind
    sealed interface ThisType : SyntaxKind
    sealed interface TypeOperator : SyntaxKind
    sealed interface IndexedAccessType : SyntaxKind
    sealed interface MappedType : SyntaxKind
    sealed interface LiteralType : SyntaxKind
    sealed interface NamedTupleMember : SyntaxKind
    sealed interface TemplateLiteralType : SyntaxKind
    sealed interface TemplateLiteralTypeSpan : SyntaxKind
    sealed interface ImportType : SyntaxKind
    sealed interface ObjectBindingPattern : SyntaxKind
    sealed interface ArrayBindingPattern : SyntaxKind
    sealed interface BindingElement : SyntaxKind
    sealed interface ArrayLiteralExpression : SyntaxKind
    sealed interface ObjectLiteralExpression : SyntaxKind
    sealed interface PropertyAccessExpression : SyntaxKind
    sealed interface ElementAccessExpression : SyntaxKind
    sealed interface CallExpression : SyntaxKind
    sealed interface NewExpression : SyntaxKind
    sealed interface TaggedTemplateExpression : SyntaxKind
    sealed interface TypeAssertionExpression : SyntaxKind
    sealed interface ParenthesizedExpression : SyntaxKind
    sealed interface FunctionExpression : SyntaxKind
    sealed interface ArrowFunction : SyntaxKind
    sealed interface DeleteExpression : SyntaxKind
    sealed interface TypeOfExpression : SyntaxKind
    sealed interface VoidExpression : SyntaxKind
    sealed interface AwaitExpression : SyntaxKind
    sealed interface PrefixUnaryExpression : SyntaxKind
    sealed interface PostfixUnaryExpression : SyntaxKind
    sealed interface BinaryExpression : SyntaxKind
    sealed interface ConditionalExpression : SyntaxKind
    sealed interface TemplateExpression : SyntaxKind
    sealed interface YieldExpression : SyntaxKind
    sealed interface SpreadElement : SyntaxKind
    sealed interface ClassExpression : SyntaxKind, ClassLikeDeclarationBaseKind
    sealed interface OmittedExpression : SyntaxKind
    sealed interface ExpressionWithTypeArguments : SyntaxKind
    sealed interface AsExpression : SyntaxKind
    sealed interface NonNullExpression : SyntaxKind
    sealed interface MetaProperty : SyntaxKind
    sealed interface SyntheticExpression : SyntaxKind
    sealed interface SatisfiesExpression : SyntaxKind
    sealed interface TemplateSpan : SyntaxKind
    sealed interface SemicolonClassElement : SyntaxKind
    sealed interface Block : SyntaxKind
    sealed interface EmptyStatement : SyntaxKind
    sealed interface VariableStatement : SyntaxKind
    sealed interface ExpressionStatement : SyntaxKind
    sealed interface IfStatement : SyntaxKind
    sealed interface DoStatement : SyntaxKind
    sealed interface WhileStatement : SyntaxKind
    sealed interface ForStatement : SyntaxKind
    sealed interface ForInStatement : SyntaxKind
    sealed interface ForOfStatement : SyntaxKind
    sealed interface ContinueStatement : SyntaxKind
    sealed interface BreakStatement : SyntaxKind
    sealed interface ReturnStatement : SyntaxKind
    sealed interface WithStatement : SyntaxKind
    sealed interface SwitchStatement : SyntaxKind
    sealed interface LabeledStatement : SyntaxKind
    sealed interface ThrowStatement : SyntaxKind
    sealed interface TryStatement : SyntaxKind
    sealed interface DebuggerStatement : SyntaxKind
    sealed interface VariableDeclaration : SyntaxKind
    sealed interface VariableDeclarationList : SyntaxKind
    sealed interface FunctionDeclaration : SyntaxKind
    sealed interface ClassDeclaration : SyntaxKind, ClassLikeDeclarationBaseKind
    sealed interface InterfaceDeclaration : SyntaxKind
    sealed interface TypeAliasDeclaration : SyntaxKind
    sealed interface EnumDeclaration : SyntaxKind
    sealed interface ModuleDeclaration : SyntaxKind
    sealed interface ModuleBlock : SyntaxKind
    sealed interface CaseBlock : SyntaxKind
    sealed interface NamespaceExportDeclaration : SyntaxKind
    sealed interface ImportEqualsDeclaration : SyntaxKind
    sealed interface ImportDeclaration : SyntaxKind
    sealed interface ImportClause : SyntaxKind
    sealed interface NamespaceImport : SyntaxKind
    sealed interface NamedImports : SyntaxKind
    sealed interface ImportSpecifier : SyntaxKind
    sealed interface ExportAssignment : SyntaxKind
    sealed interface ExportDeclaration : SyntaxKind
    sealed interface NamedExports : SyntaxKind
    sealed interface NamespaceExport : SyntaxKind
    sealed interface ExportSpecifier : SyntaxKind
    sealed interface MissingDeclaration : SyntaxKind
    sealed interface ExternalModuleReference : SyntaxKind
    sealed interface JsxElement : SyntaxKind
    sealed interface JsxSelfClosingElement : SyntaxKind
    sealed interface JsxOpeningElement : SyntaxKind
    sealed interface JsxClosingElement : SyntaxKind
    sealed interface JsxFragment : SyntaxKind
    sealed interface JsxOpeningFragment : SyntaxKind
    sealed interface JsxClosingFragment : SyntaxKind
    sealed interface JsxAttribute : SyntaxKind
    sealed interface JsxAttributes : SyntaxKind
    sealed interface JsxSpreadAttribute : SyntaxKind
    sealed interface JsxExpression : SyntaxKind
    sealed interface JsxNamespacedName : SyntaxKind
    sealed interface CaseClause : SyntaxKind
    sealed interface DefaultClause : SyntaxKind
    sealed interface HeritageClause : SyntaxKind
    sealed interface CatchClause : SyntaxKind
    sealed interface ImportAttributes : SyntaxKind
    sealed interface ImportAttribute : SyntaxKind
    sealed interface AssertClause : SyntaxKind
    sealed interface AssertEntry : SyntaxKind
    sealed interface ImportTypeAssertionContainer : SyntaxKind
    sealed interface PropertyAssignment : SyntaxKind
    sealed interface ShorthandPropertyAssignment : SyntaxKind
    sealed interface SpreadAssignment : SyntaxKind
    sealed interface EnumMember : SyntaxKind
    sealed interface UnparsedPrologue : SyntaxKind
    sealed interface UnparsedPrepend : SyntaxKind
    sealed interface UnparsedText : SyntaxKind, UnparsedTextLikeKind
    sealed interface UnparsedInternalText : SyntaxKind, UnparsedTextLikeKind
    sealed interface UnparsedSyntheticReference : SyntaxKind
    sealed interface SourceFile : SyntaxKind
    sealed interface Bundle : SyntaxKind
    sealed interface UnparsedSource : SyntaxKind
    sealed interface InputFiles : SyntaxKind
    sealed interface JSDocTypeExpression : SyntaxKind
    sealed interface JSDocNameReference : SyntaxKind
    sealed interface JSDocMemberName : SyntaxKind
    sealed interface JSDocAllType : SyntaxKind
    sealed interface JSDocUnknownType : SyntaxKind
    sealed interface JSDocNullableType : SyntaxKind
    sealed interface JSDocNonNullableType : SyntaxKind
    sealed interface JSDocOptionalType : SyntaxKind
    sealed interface JSDocFunctionType : SyntaxKind
    sealed interface JSDocVariadicType : SyntaxKind
    sealed interface JSDocNamepathType : SyntaxKind
    sealed interface JSDoc : SyntaxKind
    sealed interface JSDocComment : SyntaxKind
    sealed interface JSDocText : SyntaxKind
    sealed interface JSDocTypeLiteral : SyntaxKind
    sealed interface JSDocSignature : SyntaxKind
    sealed interface JSDocLink : SyntaxKind
    sealed interface JSDocLinkCode : SyntaxKind
    sealed interface JSDocLinkPlain : SyntaxKind
    sealed interface JSDocTag : SyntaxKind
    sealed interface JSDocAugmentsTag : SyntaxKind
    sealed interface JSDocImplementsTag : SyntaxKind
    sealed interface JSDocAuthorTag : SyntaxKind
    sealed interface JSDocDeprecatedTag : SyntaxKind
    sealed interface JSDocClassTag : SyntaxKind
    sealed interface JSDocPublicTag : SyntaxKind
    sealed interface JSDocPrivateTag : SyntaxKind
    sealed interface JSDocProtectedTag : SyntaxKind
    sealed interface JSDocReadonlyTag : SyntaxKind
    sealed interface JSDocOverrideTag : SyntaxKind
    sealed interface JSDocCallbackTag : SyntaxKind
    sealed interface JSDocOverloadTag : SyntaxKind
    sealed interface JSDocEnumTag : SyntaxKind
    sealed interface JSDocParameterTag : SyntaxKind
    sealed interface JSDocReturnTag : SyntaxKind
    sealed interface JSDocThisTag : SyntaxKind
    sealed interface JSDocTypeTag : SyntaxKind
    sealed interface JSDocTemplateTag : SyntaxKind
    sealed interface JSDocTypedefTag : SyntaxKind
    sealed interface JSDocSeeTag : SyntaxKind
    sealed interface JSDocPropertyTag : SyntaxKind
    sealed interface JSDocThrowsTag : SyntaxKind
    sealed interface JSDocSatisfiesTag : SyntaxKind
    sealed interface SyntaxList : SyntaxKind
    sealed interface NotEmittedStatement : SyntaxKind
    sealed interface PartiallyEmittedExpression : SyntaxKind
    sealed interface CommaListExpression : SyntaxKind
    sealed interface SyntheticReferenceExpression : SyntaxKind
    sealed interface Count : SyntaxKind
    sealed interface FirstAssignment : SyntaxKind
    sealed interface LastAssignment : SyntaxKind
    sealed interface FirstCompoundAssignment : SyntaxKind
    sealed interface LastCompoundAssignment : SyntaxKind
    sealed interface FirstReservedWord : SyntaxKind
    sealed interface LastReservedWord : SyntaxKind
    sealed interface FirstKeyword : SyntaxKind
    sealed interface LastKeyword : SyntaxKind
    sealed interface FirstFutureReservedWord : SyntaxKind
    sealed interface LastFutureReservedWord : SyntaxKind
    sealed interface FirstTypeNode : SyntaxKind
    sealed interface LastTypeNode : SyntaxKind
    sealed interface FirstPunctuation : SyntaxKind
    sealed interface LastPunctuation : SyntaxKind
    sealed interface FirstToken : SyntaxKind
    sealed interface LastToken : SyntaxKind
    sealed interface FirstTriviaToken : SyntaxKind
    sealed interface LastTriviaToken : SyntaxKind
    sealed interface FirstLiteralToken : SyntaxKind
    sealed interface LastLiteralToken : SyntaxKind
    sealed interface FirstTemplateToken : SyntaxKind
    sealed interface LastTemplateToken : SyntaxKind
    sealed interface FirstBinaryOperator : SyntaxKind
    sealed interface LastBinaryOperator : SyntaxKind
    sealed interface FirstStatement : SyntaxKind
    sealed interface LastStatement : SyntaxKind
    sealed interface FirstNode : SyntaxKind
    sealed interface FirstJSDocNode : SyntaxKind
    sealed interface LastJSDocNode : SyntaxKind
    sealed interface FirstJSDocTagNode : SyntaxKind
    sealed interface LastJSDocTagNode : SyntaxKind

    companion object {
        val Unknown: Unknown
        val EndOfFileToken: EndOfFileToken
        val SingleLineCommentTrivia: SingleLineCommentTrivia
        val MultiLineCommentTrivia: MultiLineCommentTrivia
        val NewLineTrivia: NewLineTrivia
        val WhitespaceTrivia: WhitespaceTrivia
        val ShebangTrivia: ShebangTrivia
        val ConflictMarkerTrivia: ConflictMarkerTrivia
        val NonTextFileMarkerTrivia: NonTextFileMarkerTrivia
        val NumericLiteral: NumericLiteral
        val BigIntLiteral: BigIntLiteral
        val StringLiteral: StringLiteral
        val JsxText: JsxText
        val JsxTextAllWhiteSpaces: JsxTextAllWhiteSpaces
        val RegularExpressionLiteral: RegularExpressionLiteral
        val NoSubstitutionTemplateLiteral: NoSubstitutionTemplateLiteral
        val TemplateHead: TemplateHead
        val TemplateMiddle: TemplateMiddle
        val TemplateTail: TemplateTail
        val OpenBraceToken: OpenBraceToken
        val CloseBraceToken: CloseBraceToken
        val OpenParenToken: OpenParenToken
        val CloseParenToken: CloseParenToken
        val OpenBracketToken: OpenBracketToken
        val CloseBracketToken: CloseBracketToken
        val DotToken: DotToken
        val DotDotDotToken: DotDotDotToken
        val SemicolonToken: SemicolonToken
        val CommaToken: CommaToken
        val QuestionDotToken: QuestionDotToken
        val LessThanToken: LessThanToken
        val LessThanSlashToken: LessThanSlashToken
        val GreaterThanToken: GreaterThanToken
        val LessThanEqualsToken: LessThanEqualsToken
        val GreaterThanEqualsToken: GreaterThanEqualsToken
        val EqualsEqualsToken: EqualsEqualsToken
        val ExclamationEqualsToken: ExclamationEqualsToken
        val EqualsEqualsEqualsToken: EqualsEqualsEqualsToken
        val ExclamationEqualsEqualsToken: ExclamationEqualsEqualsToken
        val EqualsGreaterThanToken: EqualsGreaterThanToken
        val PlusToken: PlusToken
        val MinusToken: MinusToken
        val AsteriskToken: AsteriskToken
        val AsteriskAsteriskToken: AsteriskAsteriskToken
        val SlashToken: SlashToken
        val PercentToken: PercentToken
        val PlusPlusToken: PlusPlusToken
        val MinusMinusToken: MinusMinusToken
        val LessThanLessThanToken: LessThanLessThanToken
        val GreaterThanGreaterThanToken: GreaterThanGreaterThanToken
        val GreaterThanGreaterThanGreaterThanToken: GreaterThanGreaterThanGreaterThanToken
        val AmpersandToken: AmpersandToken
        val BarToken: BarToken
        val CaretToken: CaretToken
        val ExclamationToken: ExclamationToken
        val TildeToken: TildeToken
        val AmpersandAmpersandToken: AmpersandAmpersandToken
        val BarBarToken: BarBarToken
        val QuestionToken: QuestionToken
        val ColonToken: ColonToken
        val AtToken: AtToken
        val QuestionQuestionToken: QuestionQuestionToken

        /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
        val BacktickToken: BacktickToken

        /** Only the JSDoc scanner produces HashToken. The normal scanner produces PrivateIdentifier. */
        val HashToken: HashToken
        val EqualsToken: EqualsToken
        val PlusEqualsToken: PlusEqualsToken
        val MinusEqualsToken: MinusEqualsToken
        val AsteriskEqualsToken: AsteriskEqualsToken
        val AsteriskAsteriskEqualsToken: AsteriskAsteriskEqualsToken
        val SlashEqualsToken: SlashEqualsToken
        val PercentEqualsToken: PercentEqualsToken
        val LessThanLessThanEqualsToken: LessThanLessThanEqualsToken
        val GreaterThanGreaterThanEqualsToken: GreaterThanGreaterThanEqualsToken
        val GreaterThanGreaterThanGreaterThanEqualsToken: GreaterThanGreaterThanGreaterThanEqualsToken
        val AmpersandEqualsToken: AmpersandEqualsToken
        val BarEqualsToken: BarEqualsToken
        val BarBarEqualsToken: BarBarEqualsToken
        val AmpersandAmpersandEqualsToken: AmpersandAmpersandEqualsToken
        val QuestionQuestionEqualsToken: QuestionQuestionEqualsToken
        val CaretEqualsToken: CaretEqualsToken
        val Identifier: Identifier
        val PrivateIdentifier: PrivateIdentifier
        val BreakKeyword: BreakKeyword
        val CaseKeyword: CaseKeyword
        val CatchKeyword: CatchKeyword
        val ClassKeyword: ClassKeyword
        val ConstKeyword: ConstKeyword
        val ContinueKeyword: ContinueKeyword
        val DebuggerKeyword: DebuggerKeyword
        val DefaultKeyword: DefaultKeyword
        val DeleteKeyword: DeleteKeyword
        val DoKeyword: DoKeyword
        val ElseKeyword: ElseKeyword
        val EnumKeyword: EnumKeyword
        val ExportKeyword: ExportKeyword
        val ExtendsKeyword: ExtendsKeyword
        val FalseKeyword: FalseKeyword
        val FinallyKeyword: FinallyKeyword
        val ForKeyword: ForKeyword
        val FunctionKeyword: FunctionKeyword
        val IfKeyword: IfKeyword
        val ImportKeyword: ImportKeyword
        val InKeyword: InKeyword
        val InstanceOfKeyword: InstanceOfKeyword
        val NewKeyword: NewKeyword
        val NullKeyword: NullKeyword
        val ReturnKeyword: ReturnKeyword
        val SuperKeyword: SuperKeyword
        val SwitchKeyword: SwitchKeyword
        val ThisKeyword: ThisKeyword
        val ThrowKeyword: ThrowKeyword
        val TrueKeyword: TrueKeyword
        val TryKeyword: TryKeyword
        val TypeOfKeyword: TypeOfKeyword
        val VarKeyword: VarKeyword
        val VoidKeyword: VoidKeyword
        val WhileKeyword: WhileKeyword
        val WithKeyword: WithKeyword
        val ImplementsKeyword: ImplementsKeyword
        val InterfaceKeyword: InterfaceKeyword
        val LetKeyword: LetKeyword
        val PackageKeyword: PackageKeyword
        val PrivateKeyword: PrivateKeyword
        val ProtectedKeyword: ProtectedKeyword
        val PublicKeyword: PublicKeyword
        val StaticKeyword: StaticKeyword
        val YieldKeyword: YieldKeyword
        val AbstractKeyword: AbstractKeyword
        val AccessorKeyword: AccessorKeyword
        val AsKeyword: AsKeyword
        val AssertsKeyword: AssertsKeyword
        val AssertKeyword: AssertKeyword
        val AnyKeyword: AnyKeyword
        val AsyncKeyword: AsyncKeyword
        val AwaitKeyword: AwaitKeyword
        val BooleanKeyword: BooleanKeyword
        val ConstructorKeyword: ConstructorKeyword
        val DeclareKeyword: DeclareKeyword
        val GetKeyword: GetKeyword
        val InferKeyword: InferKeyword
        val IntrinsicKeyword: IntrinsicKeyword
        val IsKeyword: IsKeyword
        val KeyOfKeyword: KeyOfKeyword
        val ModuleKeyword: ModuleKeyword
        val NamespaceKeyword: NamespaceKeyword
        val NeverKeyword: NeverKeyword
        val OutKeyword: OutKeyword
        val ReadonlyKeyword: ReadonlyKeyword
        val RequireKeyword: RequireKeyword
        val NumberKeyword: NumberKeyword
        val ObjectKeyword: ObjectKeyword
        val SatisfiesKeyword: SatisfiesKeyword
        val SetKeyword: SetKeyword
        val StringKeyword: StringKeyword
        val SymbolKeyword: SymbolKeyword
        val TypeKeyword: TypeKeyword
        val UndefinedKeyword: UndefinedKeyword
        val UniqueKeyword: UniqueKeyword
        val UnknownKeyword: UnknownKeyword
        val UsingKeyword: UsingKeyword
        val FromKeyword: FromKeyword
        val GlobalKeyword: GlobalKeyword
        val BigIntKeyword: BigIntKeyword
        val OverrideKeyword: OverrideKeyword
        val OfKeyword: OfKeyword
        val QualifiedName: QualifiedName
        val ComputedPropertyName: ComputedPropertyName
        val TypeParameter: TypeParameter
        val Parameter: Parameter
        val Decorator: Decorator
        val PropertySignature: PropertySignature
        val PropertyDeclaration: PropertyDeclaration
        val MethodSignature: MethodSignature
        val MethodDeclaration: MethodDeclaration
        val ClassStaticBlockDeclaration: ClassStaticBlockDeclaration
        val Constructor: Constructor
        val GetAccessor: GetAccessor
        val SetAccessor: SetAccessor
        val CallSignature: CallSignature
        val ConstructSignature: ConstructSignature
        val IndexSignature: IndexSignature
        val TypePredicate: TypePredicate
        val TypeReference: TypeReference
        val FunctionType: FunctionType
        val ConstructorType: ConstructorType
        val TypeQuery: TypeQuery
        val TypeLiteral: TypeLiteral
        val ArrayType: ArrayType
        val TupleType: TupleType
        val OptionalType: OptionalType
        val RestType: RestType
        val UnionType: UnionType
        val IntersectionType: IntersectionType
        val ConditionalType: ConditionalType
        val InferType: InferType
        val ParenthesizedType: ParenthesizedType
        val ThisType: ThisType
        val TypeOperator: TypeOperator
        val IndexedAccessType: IndexedAccessType
        val MappedType: MappedType
        val LiteralType: LiteralType
        val NamedTupleMember: NamedTupleMember
        val TemplateLiteralType: TemplateLiteralType
        val TemplateLiteralTypeSpan: TemplateLiteralTypeSpan
        val ImportType: ImportType
        val ObjectBindingPattern: ObjectBindingPattern
        val ArrayBindingPattern: ArrayBindingPattern
        val BindingElement: BindingElement
        val ArrayLiteralExpression: ArrayLiteralExpression
        val ObjectLiteralExpression: ObjectLiteralExpression
        val PropertyAccessExpression: PropertyAccessExpression
        val ElementAccessExpression: ElementAccessExpression
        val CallExpression: CallExpression
        val NewExpression: NewExpression
        val TaggedTemplateExpression: TaggedTemplateExpression
        val TypeAssertionExpression: TypeAssertionExpression
        val ParenthesizedExpression: ParenthesizedExpression
        val FunctionExpression: FunctionExpression
        val ArrowFunction: ArrowFunction
        val DeleteExpression: DeleteExpression
        val TypeOfExpression: TypeOfExpression
        val VoidExpression: VoidExpression
        val AwaitExpression: AwaitExpression
        val PrefixUnaryExpression: PrefixUnaryExpression
        val PostfixUnaryExpression: PostfixUnaryExpression
        val BinaryExpression: BinaryExpression
        val ConditionalExpression: ConditionalExpression
        val TemplateExpression: TemplateExpression
        val YieldExpression: YieldExpression
        val SpreadElement: SpreadElement
        val ClassExpression: ClassExpression
        val OmittedExpression: OmittedExpression
        val ExpressionWithTypeArguments: ExpressionWithTypeArguments
        val AsExpression: AsExpression
        val NonNullExpression: NonNullExpression
        val MetaProperty: MetaProperty
        val SyntheticExpression: SyntheticExpression
        val SatisfiesExpression: SatisfiesExpression
        val TemplateSpan: TemplateSpan
        val SemicolonClassElement: SemicolonClassElement
        val Block: Block
        val EmptyStatement: EmptyStatement
        val VariableStatement: VariableStatement
        val ExpressionStatement: ExpressionStatement
        val IfStatement: IfStatement
        val DoStatement: DoStatement
        val WhileStatement: WhileStatement
        val ForStatement: ForStatement
        val ForInStatement: ForInStatement
        val ForOfStatement: ForOfStatement
        val ContinueStatement: ContinueStatement
        val BreakStatement: BreakStatement
        val ReturnStatement: ReturnStatement
        val WithStatement: WithStatement
        val SwitchStatement: SwitchStatement
        val LabeledStatement: LabeledStatement
        val ThrowStatement: ThrowStatement
        val TryStatement: TryStatement
        val DebuggerStatement: DebuggerStatement
        val VariableDeclaration: VariableDeclaration
        val VariableDeclarationList: VariableDeclarationList
        val FunctionDeclaration: FunctionDeclaration
        val ClassDeclaration: ClassDeclaration
        val InterfaceDeclaration: InterfaceDeclaration
        val TypeAliasDeclaration: TypeAliasDeclaration
        val EnumDeclaration: EnumDeclaration
        val ModuleDeclaration: ModuleDeclaration
        val ModuleBlock: ModuleBlock
        val CaseBlock: CaseBlock
        val NamespaceExportDeclaration: NamespaceExportDeclaration
        val ImportEqualsDeclaration: ImportEqualsDeclaration
        val ImportDeclaration: ImportDeclaration
        val ImportClause: ImportClause
        val NamespaceImport: NamespaceImport
        val NamedImports: NamedImports
        val ImportSpecifier: ImportSpecifier
        val ExportAssignment: ExportAssignment
        val ExportDeclaration: ExportDeclaration
        val NamedExports: NamedExports
        val NamespaceExport: NamespaceExport
        val ExportSpecifier: ExportSpecifier
        val MissingDeclaration: MissingDeclaration
        val ExternalModuleReference: ExternalModuleReference
        val JsxElement: JsxElement
        val JsxSelfClosingElement: JsxSelfClosingElement
        val JsxOpeningElement: JsxOpeningElement
        val JsxClosingElement: JsxClosingElement
        val JsxFragment: JsxFragment
        val JsxOpeningFragment: JsxOpeningFragment
        val JsxClosingFragment: JsxClosingFragment
        val JsxAttribute: JsxAttribute
        val JsxAttributes: JsxAttributes
        val JsxSpreadAttribute: JsxSpreadAttribute
        val JsxExpression: JsxExpression
        val JsxNamespacedName: JsxNamespacedName
        val CaseClause: CaseClause
        val DefaultClause: DefaultClause
        val HeritageClause: HeritageClause
        val CatchClause: CatchClause
        val ImportAttributes: ImportAttributes
        val ImportAttribute: ImportAttribute

        /** @deprecated */
        val AssertClause: AssertClause

        /** @deprecated */
        val AssertEntry: AssertEntry

        /** @deprecated */
        val ImportTypeAssertionContainer: ImportTypeAssertionContainer
        val PropertyAssignment: PropertyAssignment
        val ShorthandPropertyAssignment: ShorthandPropertyAssignment
        val SpreadAssignment: SpreadAssignment
        val EnumMember: EnumMember

        /** @deprecated */
        val UnparsedPrologue: UnparsedPrologue

        /** @deprecated */
        val UnparsedPrepend: UnparsedPrepend

        /** @deprecated */
        val UnparsedText: UnparsedText

        /** @deprecated */
        val UnparsedInternalText: UnparsedInternalText

        /** @deprecated */
        val UnparsedSyntheticReference: UnparsedSyntheticReference
        val SourceFile: SourceFile
        val Bundle: Bundle

        /** @deprecated */
        val UnparsedSource: UnparsedSource

        /** @deprecated */
        val InputFiles: InputFiles
        val JSDocTypeExpression: JSDocTypeExpression
        val JSDocNameReference: JSDocNameReference
        val JSDocMemberName: JSDocMemberName
        val JSDocAllType: JSDocAllType
        val JSDocUnknownType: JSDocUnknownType
        val JSDocNullableType: JSDocNullableType
        val JSDocNonNullableType: JSDocNonNullableType
        val JSDocOptionalType: JSDocOptionalType
        val JSDocFunctionType: JSDocFunctionType
        val JSDocVariadicType: JSDocVariadicType
        val JSDocNamepathType: JSDocNamepathType
        val JSDoc: JSDoc

        /** @deprecated Use SyntaxKind.JSDoc */
        val JSDocComment: JSDocComment
        val JSDocText: JSDocText
        val JSDocTypeLiteral: JSDocTypeLiteral
        val JSDocSignature: JSDocSignature
        val JSDocLink: JSDocLink
        val JSDocLinkCode: JSDocLinkCode
        val JSDocLinkPlain: JSDocLinkPlain
        val JSDocTag: JSDocTag
        val JSDocAugmentsTag: JSDocAugmentsTag
        val JSDocImplementsTag: JSDocImplementsTag
        val JSDocAuthorTag: JSDocAuthorTag
        val JSDocDeprecatedTag: JSDocDeprecatedTag
        val JSDocClassTag: JSDocClassTag
        val JSDocPublicTag: JSDocPublicTag
        val JSDocPrivateTag: JSDocPrivateTag
        val JSDocProtectedTag: JSDocProtectedTag
        val JSDocReadonlyTag: JSDocReadonlyTag
        val JSDocOverrideTag: JSDocOverrideTag
        val JSDocCallbackTag: JSDocCallbackTag
        val JSDocOverloadTag: JSDocOverloadTag
        val JSDocEnumTag: JSDocEnumTag
        val JSDocParameterTag: JSDocParameterTag
        val JSDocReturnTag: JSDocReturnTag
        val JSDocThisTag: JSDocThisTag
        val JSDocTypeTag: JSDocTypeTag
        val JSDocTemplateTag: JSDocTemplateTag
        val JSDocTypedefTag: JSDocTypedefTag
        val JSDocSeeTag: JSDocSeeTag
        val JSDocPropertyTag: JSDocPropertyTag
        val JSDocThrowsTag: JSDocThrowsTag
        val JSDocSatisfiesTag: JSDocSatisfiesTag
        val SyntaxList: SyntaxList
        val NotEmittedStatement: NotEmittedStatement
        val PartiallyEmittedExpression: PartiallyEmittedExpression
        val CommaListExpression: CommaListExpression
        val SyntheticReferenceExpression: SyntheticReferenceExpression
        val Count: Count
        val FirstAssignment: FirstAssignment
        val LastAssignment: LastAssignment
        val FirstCompoundAssignment: FirstCompoundAssignment
        val LastCompoundAssignment: LastCompoundAssignment
        val FirstReservedWord: FirstReservedWord
        val LastReservedWord: LastReservedWord
        val FirstKeyword: FirstKeyword
        val LastKeyword: LastKeyword
        val FirstFutureReservedWord: FirstFutureReservedWord
        val LastFutureReservedWord: LastFutureReservedWord
        val FirstTypeNode: FirstTypeNode
        val LastTypeNode: LastTypeNode
        val FirstPunctuation: FirstPunctuation
        val LastPunctuation: LastPunctuation
        val FirstToken: FirstToken
        val LastToken: LastToken
        val FirstTriviaToken: FirstTriviaToken
        val LastTriviaToken: LastTriviaToken
        val FirstLiteralToken: FirstLiteralToken
        val LastLiteralToken: LastLiteralToken
        val FirstTemplateToken: FirstTemplateToken
        val LastTemplateToken: LastTemplateToken
        val FirstBinaryOperator: FirstBinaryOperator
        val LastBinaryOperator: LastBinaryOperator
        val FirstStatement: FirstStatement
        val LastStatement: LastStatement
        val FirstNode: FirstNode
        val FirstJSDocNode: FirstJSDocNode
        val LastJSDocNode: LastJSDocNode
        val FirstJSDocTagNode: FirstJSDocTagNode
        val LastJSDocTagNode: LastJSDocTagNode
    }
}
