// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SyntaxKind {
    companion object {
        @JsIntValue(0)
        val Unknown: Unknown

        @JsIntValue(1)
        val EndOfFileToken: EndOfFileToken

        @JsIntValue(2)
        val SingleLineCommentTrivia: SingleLineCommentTrivia

        @JsIntValue(3)
        val MultiLineCommentTrivia: MultiLineCommentTrivia

        @JsIntValue(4)
        val NewLineTrivia: NewLineTrivia

        @JsIntValue(5)
        val WhitespaceTrivia: WhitespaceTrivia

        @JsIntValue(6)
        val ShebangTrivia: ShebangTrivia

        @JsIntValue(7)
        val ConflictMarkerTrivia: ConflictMarkerTrivia

        @JsIntValue(8)
        val NumericLiteral: NumericLiteral

        @JsIntValue(9)
        val BigIntLiteral: BigIntLiteral

        @JsIntValue(10)
        val StringLiteral: StringLiteral

        @JsIntValue(11)
        val JsxText: JsxText

        @JsIntValue(12)
        val JsxTextAllWhiteSpaces: JsxTextAllWhiteSpaces

        @JsIntValue(13)
        val RegularExpressionLiteral: RegularExpressionLiteral

        @JsIntValue(14)
        val NoSubstitutionTemplateLiteral: NoSubstitutionTemplateLiteral

        @JsIntValue(15)
        val TemplateHead: TemplateHead

        @JsIntValue(16)
        val TemplateMiddle: TemplateMiddle

        @JsIntValue(17)
        val TemplateTail: TemplateTail

        @JsIntValue(18)
        val OpenBraceToken: OpenBraceToken

        @JsIntValue(19)
        val CloseBraceToken: CloseBraceToken

        @JsIntValue(20)
        val OpenParenToken: OpenParenToken

        @JsIntValue(21)
        val CloseParenToken: CloseParenToken

        @JsIntValue(22)
        val OpenBracketToken: OpenBracketToken

        @JsIntValue(23)
        val CloseBracketToken: CloseBracketToken

        @JsIntValue(24)
        val DotToken: DotToken

        @JsIntValue(25)
        val DotDotDotToken: DotDotDotToken

        @JsIntValue(26)
        val SemicolonToken: SemicolonToken

        @JsIntValue(27)
        val CommaToken: CommaToken

        @JsIntValue(28)
        val QuestionDotToken: QuestionDotToken

        @JsIntValue(29)
        val LessThanToken: LessThanToken

        @JsIntValue(30)
        val LessThanSlashToken: LessThanSlashToken

        @JsIntValue(31)
        val GreaterThanToken: GreaterThanToken

        @JsIntValue(32)
        val LessThanEqualsToken: LessThanEqualsToken

        @JsIntValue(33)
        val GreaterThanEqualsToken: GreaterThanEqualsToken

        @JsIntValue(34)
        val EqualsEqualsToken: EqualsEqualsToken

        @JsIntValue(35)
        val ExclamationEqualsToken: ExclamationEqualsToken

        @JsIntValue(36)
        val EqualsEqualsEqualsToken: EqualsEqualsEqualsToken

        @JsIntValue(37)
        val ExclamationEqualsEqualsToken: ExclamationEqualsEqualsToken

        @JsIntValue(38)
        val EqualsGreaterThanToken: EqualsGreaterThanToken

        @JsIntValue(39)
        val PlusToken: PlusToken

        @JsIntValue(40)
        val MinusToken: MinusToken

        @JsIntValue(41)
        val AsteriskToken: AsteriskToken

        @JsIntValue(42)
        val AsteriskAsteriskToken: AsteriskAsteriskToken

        @JsIntValue(43)
        val SlashToken: SlashToken

        @JsIntValue(44)
        val PercentToken: PercentToken

        @JsIntValue(45)
        val PlusPlusToken: PlusPlusToken

        @JsIntValue(46)
        val MinusMinusToken: MinusMinusToken

        @JsIntValue(47)
        val LessThanLessThanToken: LessThanLessThanToken

        @JsIntValue(48)
        val GreaterThanGreaterThanToken: GreaterThanGreaterThanToken

        @JsIntValue(49)
        val GreaterThanGreaterThanGreaterThanToken: GreaterThanGreaterThanGreaterThanToken

        @JsIntValue(50)
        val AmpersandToken: AmpersandToken

        @JsIntValue(51)
        val BarToken: BarToken

        @JsIntValue(52)
        val CaretToken: CaretToken

        @JsIntValue(53)
        val ExclamationToken: ExclamationToken

        @JsIntValue(54)
        val TildeToken: TildeToken

        @JsIntValue(55)
        val AmpersandAmpersandToken: AmpersandAmpersandToken

        @JsIntValue(56)
        val BarBarToken: BarBarToken

        @JsIntValue(57)
        val QuestionToken: QuestionToken

        @JsIntValue(58)
        val ColonToken: ColonToken

        @JsIntValue(59)
        val AtToken: AtToken

        @JsIntValue(60)
        val QuestionQuestionToken: QuestionQuestionToken

        /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
        @JsIntValue(61)
        val BacktickToken: BacktickToken

        /** Only the JSDoc scanner produces HashToken. The normal scanner produces PrivateIdentifier. */
        @JsIntValue(62)
        val HashToken: HashToken

        @JsIntValue(63)
        val EqualsToken: EqualsToken

        @JsIntValue(64)
        val PlusEqualsToken: PlusEqualsToken

        @JsIntValue(65)
        val MinusEqualsToken: MinusEqualsToken

        @JsIntValue(66)
        val AsteriskEqualsToken: AsteriskEqualsToken

        @JsIntValue(67)
        val AsteriskAsteriskEqualsToken: AsteriskAsteriskEqualsToken

        @JsIntValue(68)
        val SlashEqualsToken: SlashEqualsToken

        @JsIntValue(69)
        val PercentEqualsToken: PercentEqualsToken

        @JsIntValue(70)
        val LessThanLessThanEqualsToken: LessThanLessThanEqualsToken

        @JsIntValue(71)
        val GreaterThanGreaterThanEqualsToken: GreaterThanGreaterThanEqualsToken

        @JsIntValue(72)
        val GreaterThanGreaterThanGreaterThanEqualsToken: GreaterThanGreaterThanGreaterThanEqualsToken

        @JsIntValue(73)
        val AmpersandEqualsToken: AmpersandEqualsToken

        @JsIntValue(74)
        val BarEqualsToken: BarEqualsToken

        @JsIntValue(75)
        val BarBarEqualsToken: BarBarEqualsToken

        @JsIntValue(76)
        val AmpersandAmpersandEqualsToken: AmpersandAmpersandEqualsToken

        @JsIntValue(77)
        val QuestionQuestionEqualsToken: QuestionQuestionEqualsToken

        @JsIntValue(78)
        val CaretEqualsToken: CaretEqualsToken

        @JsIntValue(79)
        val Identifier: Identifier

        @JsIntValue(80)
        val PrivateIdentifier: PrivateIdentifier

        @JsIntValue(81)
        val BreakKeyword: BreakKeyword

        @JsIntValue(82)
        val CaseKeyword: CaseKeyword

        @JsIntValue(83)
        val CatchKeyword: CatchKeyword

        @JsIntValue(84)
        val ClassKeyword: ClassKeyword

        @JsIntValue(85)
        val ConstKeyword: ConstKeyword

        @JsIntValue(86)
        val ContinueKeyword: ContinueKeyword

        @JsIntValue(87)
        val DebuggerKeyword: DebuggerKeyword

        @JsIntValue(88)
        val DefaultKeyword: DefaultKeyword

        @JsIntValue(89)
        val DeleteKeyword: DeleteKeyword

        @JsIntValue(90)
        val DoKeyword: DoKeyword

        @JsIntValue(91)
        val ElseKeyword: ElseKeyword

        @JsIntValue(92)
        val EnumKeyword: EnumKeyword

        @JsIntValue(93)
        val ExportKeyword: ExportKeyword

        @JsIntValue(94)
        val ExtendsKeyword: ExtendsKeyword

        @JsIntValue(95)
        val FalseKeyword: FalseKeyword

        @JsIntValue(96)
        val FinallyKeyword: FinallyKeyword

        @JsIntValue(97)
        val ForKeyword: ForKeyword

        @JsIntValue(98)
        val FunctionKeyword: FunctionKeyword

        @JsIntValue(99)
        val IfKeyword: IfKeyword

        @JsIntValue(100)
        val ImportKeyword: ImportKeyword

        @JsIntValue(101)
        val InKeyword: InKeyword

        @JsIntValue(102)
        val InstanceOfKeyword: InstanceOfKeyword

        @JsIntValue(103)
        val NewKeyword: NewKeyword

        @JsIntValue(104)
        val NullKeyword: NullKeyword

        @JsIntValue(105)
        val ReturnKeyword: ReturnKeyword

        @JsIntValue(106)
        val SuperKeyword: SuperKeyword

        @JsIntValue(107)
        val SwitchKeyword: SwitchKeyword

        @JsIntValue(108)
        val ThisKeyword: ThisKeyword

        @JsIntValue(109)
        val ThrowKeyword: ThrowKeyword

        @JsIntValue(110)
        val TrueKeyword: TrueKeyword

        @JsIntValue(111)
        val TryKeyword: TryKeyword

        @JsIntValue(112)
        val TypeOfKeyword: TypeOfKeyword

        @JsIntValue(113)
        val VarKeyword: VarKeyword

        @JsIntValue(114)
        val VoidKeyword: VoidKeyword

        @JsIntValue(115)
        val WhileKeyword: WhileKeyword

        @JsIntValue(116)
        val WithKeyword: WithKeyword

        @JsIntValue(117)
        val ImplementsKeyword: ImplementsKeyword

        @JsIntValue(118)
        val InterfaceKeyword: InterfaceKeyword

        @JsIntValue(119)
        val LetKeyword: LetKeyword

        @JsIntValue(120)
        val PackageKeyword: PackageKeyword

        @JsIntValue(121)
        val PrivateKeyword: PrivateKeyword

        @JsIntValue(122)
        val ProtectedKeyword: ProtectedKeyword

        @JsIntValue(123)
        val PublicKeyword: PublicKeyword

        @JsIntValue(124)
        val StaticKeyword: StaticKeyword

        @JsIntValue(125)
        val YieldKeyword: YieldKeyword

        @JsIntValue(126)
        val AbstractKeyword: AbstractKeyword

        @JsIntValue(127)
        val AccessorKeyword: AccessorKeyword

        @JsIntValue(128)
        val AsKeyword: AsKeyword

        @JsIntValue(129)
        val AssertsKeyword: AssertsKeyword

        @JsIntValue(130)
        val AssertKeyword: AssertKeyword

        @JsIntValue(131)
        val AnyKeyword: AnyKeyword

        @JsIntValue(132)
        val AsyncKeyword: AsyncKeyword

        @JsIntValue(133)
        val AwaitKeyword: AwaitKeyword

        @JsIntValue(134)
        val BooleanKeyword: BooleanKeyword

        @JsIntValue(135)
        val ConstructorKeyword: ConstructorKeyword

        @JsIntValue(136)
        val DeclareKeyword: DeclareKeyword

        @JsIntValue(137)
        val GetKeyword: GetKeyword

        @JsIntValue(138)
        val InferKeyword: InferKeyword

        @JsIntValue(139)
        val IntrinsicKeyword: IntrinsicKeyword

        @JsIntValue(140)
        val IsKeyword: IsKeyword

        @JsIntValue(141)
        val KeyOfKeyword: KeyOfKeyword

        @JsIntValue(142)
        val ModuleKeyword: ModuleKeyword

        @JsIntValue(143)
        val NamespaceKeyword: NamespaceKeyword

        @JsIntValue(144)
        val NeverKeyword: NeverKeyword

        @JsIntValue(145)
        val OutKeyword: OutKeyword

        @JsIntValue(146)
        val ReadonlyKeyword: ReadonlyKeyword

        @JsIntValue(147)
        val RequireKeyword: RequireKeyword

        @JsIntValue(148)
        val NumberKeyword: NumberKeyword

        @JsIntValue(149)
        val ObjectKeyword: ObjectKeyword

        @JsIntValue(150)
        val SatisfiesKeyword: SatisfiesKeyword

        @JsIntValue(151)
        val SetKeyword: SetKeyword

        @JsIntValue(152)
        val StringKeyword: StringKeyword

        @JsIntValue(153)
        val SymbolKeyword: SymbolKeyword

        @JsIntValue(154)
        val TypeKeyword: TypeKeyword

        @JsIntValue(155)
        val UndefinedKeyword: UndefinedKeyword

        @JsIntValue(156)
        val UniqueKeyword: UniqueKeyword

        @JsIntValue(157)
        val UnknownKeyword: UnknownKeyword

        @JsIntValue(158)
        val FromKeyword: FromKeyword

        @JsIntValue(159)
        val GlobalKeyword: GlobalKeyword

        @JsIntValue(160)
        val BigIntKeyword: BigIntKeyword

        @JsIntValue(161)
        val OverrideKeyword: OverrideKeyword

        @JsIntValue(162)
        val OfKeyword: OfKeyword

        @JsIntValue(163)
        val QualifiedName: QualifiedName

        @JsIntValue(164)
        val ComputedPropertyName: ComputedPropertyName

        @JsIntValue(165)
        val TypeParameter: TypeParameter

        @JsIntValue(166)
        val Parameter: Parameter

        @JsIntValue(167)
        val Decorator: Decorator

        @JsIntValue(168)
        val PropertySignature: PropertySignature

        @JsIntValue(169)
        val PropertyDeclaration: PropertyDeclaration

        @JsIntValue(170)
        val MethodSignature: MethodSignature

        @JsIntValue(171)
        val MethodDeclaration: MethodDeclaration

        @JsIntValue(172)
        val ClassStaticBlockDeclaration: ClassStaticBlockDeclaration

        @JsIntValue(173)
        val Constructor: Constructor

        @JsIntValue(174)
        val GetAccessor: GetAccessor

        @JsIntValue(175)
        val SetAccessor: SetAccessor

        @JsIntValue(176)
        val CallSignature: CallSignature

        @JsIntValue(177)
        val ConstructSignature: ConstructSignature

        @JsIntValue(178)
        val IndexSignature: IndexSignature

        @JsIntValue(179)
        val TypePredicate: TypePredicate

        @JsIntValue(180)
        val TypeReference: TypeReference

        @JsIntValue(181)
        val FunctionType: FunctionType

        @JsIntValue(182)
        val ConstructorType: ConstructorType

        @JsIntValue(183)
        val TypeQuery: TypeQuery

        @JsIntValue(184)
        val TypeLiteral: TypeLiteral

        @JsIntValue(185)
        val ArrayType: ArrayType

        @JsIntValue(186)
        val TupleType: TupleType

        @JsIntValue(187)
        val OptionalType: OptionalType

        @JsIntValue(188)
        val RestType: RestType

        @JsIntValue(189)
        val UnionType: UnionType

        @JsIntValue(190)
        val IntersectionType: IntersectionType

        @JsIntValue(191)
        val ConditionalType: ConditionalType

        @JsIntValue(192)
        val InferType: InferType

        @JsIntValue(193)
        val ParenthesizedType: ParenthesizedType

        @JsIntValue(194)
        val ThisType: ThisType

        @JsIntValue(195)
        val TypeOperator: TypeOperator

        @JsIntValue(196)
        val IndexedAccessType: IndexedAccessType

        @JsIntValue(197)
        val MappedType: MappedType

        @JsIntValue(198)
        val LiteralType: LiteralType

        @JsIntValue(199)
        val NamedTupleMember: NamedTupleMember

        @JsIntValue(200)
        val TemplateLiteralType: TemplateLiteralType

        @JsIntValue(201)
        val TemplateLiteralTypeSpan: TemplateLiteralTypeSpan

        @JsIntValue(202)
        val ImportType: ImportType

        @JsIntValue(203)
        val ObjectBindingPattern: ObjectBindingPattern

        @JsIntValue(204)
        val ArrayBindingPattern: ArrayBindingPattern

        @JsIntValue(205)
        val BindingElement: BindingElement

        @JsIntValue(206)
        val ArrayLiteralExpression: ArrayLiteralExpression

        @JsIntValue(207)
        val ObjectLiteralExpression: ObjectLiteralExpression

        @JsIntValue(208)
        val PropertyAccessExpression: PropertyAccessExpression

        @JsIntValue(209)
        val ElementAccessExpression: ElementAccessExpression

        @JsIntValue(210)
        val CallExpression: CallExpression

        @JsIntValue(211)
        val NewExpression: NewExpression

        @JsIntValue(212)
        val TaggedTemplateExpression: TaggedTemplateExpression

        @JsIntValue(213)
        val TypeAssertionExpression: TypeAssertionExpression

        @JsIntValue(214)
        val ParenthesizedExpression: ParenthesizedExpression

        @JsIntValue(215)
        val FunctionExpression: FunctionExpression

        @JsIntValue(216)
        val ArrowFunction: ArrowFunction

        @JsIntValue(217)
        val DeleteExpression: DeleteExpression

        @JsIntValue(218)
        val TypeOfExpression: TypeOfExpression

        @JsIntValue(219)
        val VoidExpression: VoidExpression

        @JsIntValue(220)
        val AwaitExpression: AwaitExpression

        @JsIntValue(221)
        val PrefixUnaryExpression: PrefixUnaryExpression

        @JsIntValue(222)
        val PostfixUnaryExpression: PostfixUnaryExpression

        @JsIntValue(223)
        val BinaryExpression: BinaryExpression

        @JsIntValue(224)
        val ConditionalExpression: ConditionalExpression

        @JsIntValue(225)
        val TemplateExpression: TemplateExpression

        @JsIntValue(226)
        val YieldExpression: YieldExpression

        @JsIntValue(227)
        val SpreadElement: SpreadElement

        @JsIntValue(228)
        val ClassExpression: ClassExpression

        @JsIntValue(229)
        val OmittedExpression: OmittedExpression

        @JsIntValue(230)
        val ExpressionWithTypeArguments: ExpressionWithTypeArguments

        @JsIntValue(231)
        val AsExpression: AsExpression

        @JsIntValue(232)
        val NonNullExpression: NonNullExpression

        @JsIntValue(233)
        val MetaProperty: MetaProperty

        @JsIntValue(234)
        val SyntheticExpression: SyntheticExpression

        @JsIntValue(235)
        val SatisfiesExpression: SatisfiesExpression

        @JsIntValue(236)
        val TemplateSpan: TemplateSpan

        @JsIntValue(237)
        val SemicolonClassElement: SemicolonClassElement

        @JsIntValue(238)
        val Block: Block

        @JsIntValue(239)
        val EmptyStatement: EmptyStatement

        @JsIntValue(240)
        val VariableStatement: VariableStatement

        @JsIntValue(241)
        val ExpressionStatement: ExpressionStatement

        @JsIntValue(242)
        val IfStatement: IfStatement

        @JsIntValue(243)
        val DoStatement: DoStatement

        @JsIntValue(244)
        val WhileStatement: WhileStatement

        @JsIntValue(245)
        val ForStatement: ForStatement

        @JsIntValue(246)
        val ForInStatement: ForInStatement

        @JsIntValue(247)
        val ForOfStatement: ForOfStatement

        @JsIntValue(248)
        val ContinueStatement: ContinueStatement

        @JsIntValue(249)
        val BreakStatement: BreakStatement

        @JsIntValue(250)
        val ReturnStatement: ReturnStatement

        @JsIntValue(251)
        val WithStatement: WithStatement

        @JsIntValue(252)
        val SwitchStatement: SwitchStatement

        @JsIntValue(253)
        val LabeledStatement: LabeledStatement

        @JsIntValue(254)
        val ThrowStatement: ThrowStatement

        @JsIntValue(255)
        val TryStatement: TryStatement

        @JsIntValue(256)
        val DebuggerStatement: DebuggerStatement

        @JsIntValue(257)
        val VariableDeclaration: VariableDeclaration

        @JsIntValue(258)
        val VariableDeclarationList: VariableDeclarationList

        @JsIntValue(259)
        val FunctionDeclaration: FunctionDeclaration

        @JsIntValue(260)
        val ClassDeclaration: ClassDeclaration

        @JsIntValue(261)
        val InterfaceDeclaration: InterfaceDeclaration

        @JsIntValue(262)
        val TypeAliasDeclaration: TypeAliasDeclaration

        @JsIntValue(263)
        val EnumDeclaration: EnumDeclaration

        @JsIntValue(264)
        val ModuleDeclaration: ModuleDeclaration

        @JsIntValue(265)
        val ModuleBlock: ModuleBlock

        @JsIntValue(266)
        val CaseBlock: CaseBlock

        @JsIntValue(267)
        val NamespaceExportDeclaration: NamespaceExportDeclaration

        @JsIntValue(268)
        val ImportEqualsDeclaration: ImportEqualsDeclaration

        @JsIntValue(269)
        val ImportDeclaration: ImportDeclaration

        @JsIntValue(270)
        val ImportClause: ImportClause

        @JsIntValue(271)
        val NamespaceImport: NamespaceImport

        @JsIntValue(272)
        val NamedImports: NamedImports

        @JsIntValue(273)
        val ImportSpecifier: ImportSpecifier

        @JsIntValue(274)
        val ExportAssignment: ExportAssignment

        @JsIntValue(275)
        val ExportDeclaration: ExportDeclaration

        @JsIntValue(276)
        val NamedExports: NamedExports

        @JsIntValue(277)
        val NamespaceExport: NamespaceExport

        @JsIntValue(278)
        val ExportSpecifier: ExportSpecifier

        @JsIntValue(279)
        val MissingDeclaration: MissingDeclaration

        @JsIntValue(280)
        val ExternalModuleReference: ExternalModuleReference

        @JsIntValue(281)
        val JsxElement: JsxElement

        @JsIntValue(282)
        val JsxSelfClosingElement: JsxSelfClosingElement

        @JsIntValue(283)
        val JsxOpeningElement: JsxOpeningElement

        @JsIntValue(284)
        val JsxClosingElement: JsxClosingElement

        @JsIntValue(285)
        val JsxFragment: JsxFragment

        @JsIntValue(286)
        val JsxOpeningFragment: JsxOpeningFragment

        @JsIntValue(287)
        val JsxClosingFragment: JsxClosingFragment

        @JsIntValue(288)
        val JsxAttribute: JsxAttribute

        @JsIntValue(289)
        val JsxAttributes: JsxAttributes

        @JsIntValue(290)
        val JsxSpreadAttribute: JsxSpreadAttribute

        @JsIntValue(291)
        val JsxExpression: JsxExpression

        @JsIntValue(292)
        val CaseClause: CaseClause

        @JsIntValue(293)
        val DefaultClause: DefaultClause

        @JsIntValue(294)
        val HeritageClause: HeritageClause

        @JsIntValue(295)
        val CatchClause: CatchClause

        @JsIntValue(296)
        val AssertClause: AssertClause

        @JsIntValue(297)
        val AssertEntry: AssertEntry

        @JsIntValue(298)
        val ImportTypeAssertionContainer: ImportTypeAssertionContainer

        @JsIntValue(299)
        val PropertyAssignment: PropertyAssignment

        @JsIntValue(300)
        val ShorthandPropertyAssignment: ShorthandPropertyAssignment

        @JsIntValue(301)
        val SpreadAssignment: SpreadAssignment

        @JsIntValue(302)
        val EnumMember: EnumMember

        @JsIntValue(303)
        val UnparsedPrologue: UnparsedPrologue

        @JsIntValue(304)
        val UnparsedPrepend: UnparsedPrepend

        @JsIntValue(305)
        val UnparsedText: UnparsedText

        @JsIntValue(306)
        val UnparsedInternalText: UnparsedInternalText

        @JsIntValue(307)
        val UnparsedSyntheticReference: UnparsedSyntheticReference

        @JsIntValue(308)
        val SourceFile: SourceFile

        @JsIntValue(309)
        val Bundle: Bundle

        @JsIntValue(310)
        val UnparsedSource: UnparsedSource

        @JsIntValue(311)
        val InputFiles: InputFiles

        @JsIntValue(312)
        val JSDocTypeExpression: JSDocTypeExpression

        @JsIntValue(313)
        val JSDocNameReference: JSDocNameReference

        @JsIntValue(314)
        val JSDocMemberName: JSDocMemberName

        @JsIntValue(315)
        val JSDocAllType: JSDocAllType

        @JsIntValue(316)
        val JSDocUnknownType: JSDocUnknownType

        @JsIntValue(317)
        val JSDocNullableType: JSDocNullableType

        @JsIntValue(318)
        val JSDocNonNullableType: JSDocNonNullableType

        @JsIntValue(319)
        val JSDocOptionalType: JSDocOptionalType

        @JsIntValue(320)
        val JSDocFunctionType: JSDocFunctionType

        @JsIntValue(321)
        val JSDocVariadicType: JSDocVariadicType

        @JsIntValue(322)
        val JSDocNamepathType: JSDocNamepathType

        @JsIntValue(323)
        val JSDoc: JSDoc

        /** @deprecated Use SyntaxKind.JSDoc */
        @JsIntValue(323)
        val JSDocComment: JSDocComment

        @JsIntValue(324)
        val JSDocText: JSDocText

        @JsIntValue(325)
        val JSDocTypeLiteral: JSDocTypeLiteral

        @JsIntValue(326)
        val JSDocSignature: JSDocSignature

        @JsIntValue(327)
        val JSDocLink: JSDocLink

        @JsIntValue(328)
        val JSDocLinkCode: JSDocLinkCode

        @JsIntValue(329)
        val JSDocLinkPlain: JSDocLinkPlain

        @JsIntValue(330)
        val JSDocTag: JSDocTag

        @JsIntValue(331)
        val JSDocAugmentsTag: JSDocAugmentsTag

        @JsIntValue(332)
        val JSDocImplementsTag: JSDocImplementsTag

        @JsIntValue(333)
        val JSDocAuthorTag: JSDocAuthorTag

        @JsIntValue(334)
        val JSDocDeprecatedTag: JSDocDeprecatedTag

        @JsIntValue(335)
        val JSDocClassTag: JSDocClassTag

        @JsIntValue(336)
        val JSDocPublicTag: JSDocPublicTag

        @JsIntValue(337)
        val JSDocPrivateTag: JSDocPrivateTag

        @JsIntValue(338)
        val JSDocProtectedTag: JSDocProtectedTag

        @JsIntValue(339)
        val JSDocReadonlyTag: JSDocReadonlyTag

        @JsIntValue(340)
        val JSDocOverrideTag: JSDocOverrideTag

        @JsIntValue(341)
        val JSDocCallbackTag: JSDocCallbackTag

        @JsIntValue(342)
        val JSDocEnumTag: JSDocEnumTag

        @JsIntValue(343)
        val JSDocParameterTag: JSDocParameterTag

        @JsIntValue(344)
        val JSDocReturnTag: JSDocReturnTag

        @JsIntValue(345)
        val JSDocThisTag: JSDocThisTag

        @JsIntValue(346)
        val JSDocTypeTag: JSDocTypeTag

        @JsIntValue(347)
        val JSDocTemplateTag: JSDocTemplateTag

        @JsIntValue(348)
        val JSDocTypedefTag: JSDocTypedefTag

        @JsIntValue(349)
        val JSDocSeeTag: JSDocSeeTag

        @JsIntValue(350)
        val JSDocPropertyTag: JSDocPropertyTag

        @JsIntValue(351)
        val SyntaxList: SyntaxList

        @JsIntValue(352)
        val NotEmittedStatement: NotEmittedStatement

        @JsIntValue(353)
        val PartiallyEmittedExpression: PartiallyEmittedExpression

        @JsIntValue(354)
        val CommaListExpression: CommaListExpression

        @JsIntValue(355)
        val MergeDeclarationMarker: MergeDeclarationMarker

        @JsIntValue(356)
        val EndOfDeclarationMarker: EndOfDeclarationMarker

        @JsIntValue(357)
        val SyntheticReferenceExpression: SyntheticReferenceExpression

        @JsIntValue(358)
        val Count: Count

        @JsIntValue(63)
        val FirstAssignment: FirstAssignment

        @JsIntValue(78)
        val LastAssignment: LastAssignment

        @JsIntValue(64)
        val FirstCompoundAssignment: FirstCompoundAssignment

        @JsIntValue(78)
        val LastCompoundAssignment: LastCompoundAssignment

        @JsIntValue(81)
        val FirstReservedWord: FirstReservedWord

        @JsIntValue(116)
        val LastReservedWord: LastReservedWord

        @JsIntValue(81)
        val FirstKeyword: FirstKeyword

        @JsIntValue(162)
        val LastKeyword: LastKeyword

        @JsIntValue(117)
        val FirstFutureReservedWord: FirstFutureReservedWord

        @JsIntValue(125)
        val LastFutureReservedWord: LastFutureReservedWord

        @JsIntValue(179)
        val FirstTypeNode: FirstTypeNode

        @JsIntValue(202)
        val LastTypeNode: LastTypeNode

        @JsIntValue(18)
        val FirstPunctuation: FirstPunctuation

        @JsIntValue(78)
        val LastPunctuation: LastPunctuation

        @JsIntValue(0)
        val FirstToken: FirstToken

        @JsIntValue(162)
        val LastToken: LastToken

        @JsIntValue(2)
        val FirstTriviaToken: FirstTriviaToken

        @JsIntValue(7)
        val LastTriviaToken: LastTriviaToken

        @JsIntValue(8)
        val FirstLiteralToken: FirstLiteralToken

        @JsIntValue(14)
        val LastLiteralToken: LastLiteralToken

        @JsIntValue(14)
        val FirstTemplateToken: FirstTemplateToken

        @JsIntValue(17)
        val LastTemplateToken: LastTemplateToken

        @JsIntValue(29)
        val FirstBinaryOperator: FirstBinaryOperator

        @JsIntValue(78)
        val LastBinaryOperator: LastBinaryOperator

        @JsIntValue(240)
        val FirstStatement: FirstStatement

        @JsIntValue(256)
        val LastStatement: LastStatement

        @JsIntValue(163)
        val FirstNode: FirstNode

        @JsIntValue(312)
        val FirstJSDocNode: FirstJSDocNode

        @JsIntValue(350)
        val LastJSDocNode: LastJSDocNode

        @JsIntValue(330)
        val FirstJSDocTagNode: FirstJSDocTagNode

        @JsIntValue(350)
        val LastJSDocTagNode: LastJSDocTagNode
    }

    sealed interface Unknown : SyntaxKind, Union.SyntaxKind_Unknown
    sealed interface EndOfFileToken : SyntaxKind, Union.SyntaxKind_EndOfFileToken
    sealed interface SingleLineCommentTrivia : SyntaxKind, Union.SyntaxKind_SingleLineCommentTrivia
    sealed interface MultiLineCommentTrivia : SyntaxKind, Union.SyntaxKind_MultiLineCommentTrivia
    sealed interface NewLineTrivia : SyntaxKind, Union.SyntaxKind_NewLineTrivia
    sealed interface WhitespaceTrivia : SyntaxKind, Union.SyntaxKind_WhitespaceTrivia
    sealed interface ShebangTrivia : SyntaxKind, Union.SyntaxKind_ShebangTrivia
    sealed interface ConflictMarkerTrivia : SyntaxKind, Union.SyntaxKind_ConflictMarkerTrivia
    sealed interface NumericLiteral : SyntaxKind, Union.SyntaxKind_NumericLiteral
    sealed interface BigIntLiteral : SyntaxKind, Union.SyntaxKind_BigIntLiteral
    sealed interface StringLiteral : SyntaxKind, Union.SyntaxKind_StringLiteral
    sealed interface JsxText : SyntaxKind, Union.SyntaxKind_JsxText
    sealed interface JsxTextAllWhiteSpaces : SyntaxKind, Union.SyntaxKind_JsxTextAllWhiteSpaces
    sealed interface RegularExpressionLiteral : SyntaxKind, Union.SyntaxKind_RegularExpressionLiteral
    sealed interface NoSubstitutionTemplateLiteral : SyntaxKind, Union.SyntaxKind_NoSubstitutionTemplateLiteral
    sealed interface TemplateHead : SyntaxKind, Union.SyntaxKind_TemplateHead
    sealed interface TemplateMiddle : SyntaxKind, Union.SyntaxKind_TemplateMiddle
    sealed interface TemplateTail : SyntaxKind, Union.SyntaxKind_TemplateTail
    sealed interface OpenBraceToken : SyntaxKind, Union.SyntaxKind_OpenBraceToken
    sealed interface CloseBraceToken : SyntaxKind, Union.SyntaxKind_CloseBraceToken
    sealed interface OpenParenToken : SyntaxKind, Union.SyntaxKind_OpenParenToken
    sealed interface CloseParenToken : SyntaxKind, Union.SyntaxKind_CloseParenToken
    sealed interface OpenBracketToken : SyntaxKind, Union.SyntaxKind_OpenBracketToken
    sealed interface CloseBracketToken : SyntaxKind, Union.SyntaxKind_CloseBracketToken
    sealed interface DotToken : SyntaxKind, Union.SyntaxKind_DotToken
    sealed interface DotDotDotToken : SyntaxKind, Union.SyntaxKind_DotDotDotToken
    sealed interface SemicolonToken : SyntaxKind, Union.SyntaxKind_SemicolonToken
    sealed interface CommaToken : SyntaxKind, Union.SyntaxKind_CommaToken
    sealed interface QuestionDotToken : SyntaxKind, Union.SyntaxKind_QuestionDotToken
    sealed interface LessThanToken : SyntaxKind, Union.SyntaxKind_LessThanToken
    sealed interface LessThanSlashToken : SyntaxKind, Union.SyntaxKind_LessThanSlashToken
    sealed interface GreaterThanToken : SyntaxKind, Union.SyntaxKind_GreaterThanToken
    sealed interface LessThanEqualsToken : SyntaxKind, Union.SyntaxKind_LessThanEqualsToken
    sealed interface GreaterThanEqualsToken : SyntaxKind, Union.SyntaxKind_GreaterThanEqualsToken
    sealed interface EqualsEqualsToken : SyntaxKind, Union.SyntaxKind_EqualsEqualsToken
    sealed interface ExclamationEqualsToken : SyntaxKind, Union.SyntaxKind_ExclamationEqualsToken
    sealed interface EqualsEqualsEqualsToken : SyntaxKind, Union.SyntaxKind_EqualsEqualsEqualsToken
    sealed interface ExclamationEqualsEqualsToken : SyntaxKind, Union.SyntaxKind_ExclamationEqualsEqualsToken
    sealed interface EqualsGreaterThanToken : SyntaxKind, Union.SyntaxKind_EqualsGreaterThanToken
    sealed interface PlusToken : SyntaxKind, Union.SyntaxKind_PlusToken
    sealed interface MinusToken : SyntaxKind, Union.SyntaxKind_MinusToken
    sealed interface AsteriskToken : SyntaxKind, Union.SyntaxKind_AsteriskToken
    sealed interface AsteriskAsteriskToken : SyntaxKind, Union.SyntaxKind_AsteriskAsteriskToken
    sealed interface SlashToken : SyntaxKind, Union.SyntaxKind_SlashToken
    sealed interface PercentToken : SyntaxKind, Union.SyntaxKind_PercentToken
    sealed interface PlusPlusToken : SyntaxKind, Union.SyntaxKind_PlusPlusToken
    sealed interface MinusMinusToken : SyntaxKind, Union.SyntaxKind_MinusMinusToken
    sealed interface LessThanLessThanToken : SyntaxKind, Union.SyntaxKind_LessThanLessThanToken
    sealed interface GreaterThanGreaterThanToken : SyntaxKind, Union.SyntaxKind_GreaterThanGreaterThanToken
    sealed interface GreaterThanGreaterThanGreaterThanToken : SyntaxKind,
        Union.SyntaxKind_GreaterThanGreaterThanGreaterThanToken

    sealed interface AmpersandToken : SyntaxKind, Union.SyntaxKind_AmpersandToken
    sealed interface BarToken : SyntaxKind, Union.SyntaxKind_BarToken
    sealed interface CaretToken : SyntaxKind, Union.SyntaxKind_CaretToken
    sealed interface ExclamationToken : SyntaxKind, Union.SyntaxKind_ExclamationToken
    sealed interface TildeToken : SyntaxKind, Union.SyntaxKind_TildeToken
    sealed interface AmpersandAmpersandToken : SyntaxKind, Union.SyntaxKind_AmpersandAmpersandToken
    sealed interface BarBarToken : SyntaxKind, Union.SyntaxKind_BarBarToken
    sealed interface QuestionToken : SyntaxKind, Union.SyntaxKind_QuestionToken
    sealed interface ColonToken : SyntaxKind, Union.SyntaxKind_ColonToken
    sealed interface AtToken : SyntaxKind, Union.SyntaxKind_AtToken
    sealed interface QuestionQuestionToken : SyntaxKind, Union.SyntaxKind_QuestionQuestionToken
    sealed interface BacktickToken : SyntaxKind, Union.SyntaxKind_BacktickToken
    sealed interface HashToken : SyntaxKind, Union.SyntaxKind_HashToken
    sealed interface EqualsToken : SyntaxKind, Union.SyntaxKind_EqualsToken
    sealed interface PlusEqualsToken : SyntaxKind, Union.SyntaxKind_PlusEqualsToken
    sealed interface MinusEqualsToken : SyntaxKind, Union.SyntaxKind_MinusEqualsToken
    sealed interface AsteriskEqualsToken : SyntaxKind, Union.SyntaxKind_AsteriskEqualsToken
    sealed interface AsteriskAsteriskEqualsToken : SyntaxKind, Union.SyntaxKind_AsteriskAsteriskEqualsToken
    sealed interface SlashEqualsToken : SyntaxKind, Union.SyntaxKind_SlashEqualsToken
    sealed interface PercentEqualsToken : SyntaxKind, Union.SyntaxKind_PercentEqualsToken
    sealed interface LessThanLessThanEqualsToken : SyntaxKind, Union.SyntaxKind_LessThanLessThanEqualsToken
    sealed interface GreaterThanGreaterThanEqualsToken : SyntaxKind, Union.SyntaxKind_GreaterThanGreaterThanEqualsToken
    sealed interface GreaterThanGreaterThanGreaterThanEqualsToken : SyntaxKind,
        Union.SyntaxKind_GreaterThanGreaterThanGreaterThanEqualsToken

    sealed interface AmpersandEqualsToken : SyntaxKind, Union.SyntaxKind_AmpersandEqualsToken
    sealed interface BarEqualsToken : SyntaxKind, Union.SyntaxKind_BarEqualsToken
    sealed interface BarBarEqualsToken : SyntaxKind, Union.SyntaxKind_BarBarEqualsToken
    sealed interface AmpersandAmpersandEqualsToken : SyntaxKind, Union.SyntaxKind_AmpersandAmpersandEqualsToken
    sealed interface QuestionQuestionEqualsToken : SyntaxKind, Union.SyntaxKind_QuestionQuestionEqualsToken
    sealed interface CaretEqualsToken : SyntaxKind, Union.SyntaxKind_CaretEqualsToken
    sealed interface Identifier : SyntaxKind, Union.SyntaxKind_Identifier
    sealed interface PrivateIdentifier : SyntaxKind
    sealed interface BreakKeyword : SyntaxKind, Union.SyntaxKind_BreakKeyword
    sealed interface CaseKeyword : SyntaxKind, Union.SyntaxKind_CaseKeyword
    sealed interface CatchKeyword : SyntaxKind, Union.SyntaxKind_CatchKeyword
    sealed interface ClassKeyword : SyntaxKind, Union.SyntaxKind_ClassKeyword
    sealed interface ConstKeyword : SyntaxKind, Union.SyntaxKind_ConstKeyword
    sealed interface ContinueKeyword : SyntaxKind, Union.SyntaxKind_ContinueKeyword
    sealed interface DebuggerKeyword : SyntaxKind, Union.SyntaxKind_DebuggerKeyword
    sealed interface DefaultKeyword : SyntaxKind, Union.SyntaxKind_DefaultKeyword
    sealed interface DeleteKeyword : SyntaxKind, Union.SyntaxKind_DeleteKeyword
    sealed interface DoKeyword : SyntaxKind, Union.SyntaxKind_DoKeyword
    sealed interface ElseKeyword : SyntaxKind, Union.SyntaxKind_ElseKeyword
    sealed interface EnumKeyword : SyntaxKind, Union.SyntaxKind_EnumKeyword
    sealed interface ExportKeyword : SyntaxKind, Union.SyntaxKind_ExportKeyword
    sealed interface ExtendsKeyword : SyntaxKind, Union.SyntaxKind_ExtendsKeyword
    sealed interface FalseKeyword : SyntaxKind, Union.SyntaxKind_FalseKeyword
    sealed interface FinallyKeyword : SyntaxKind, Union.SyntaxKind_FinallyKeyword
    sealed interface ForKeyword : SyntaxKind, Union.SyntaxKind_ForKeyword
    sealed interface FunctionKeyword : SyntaxKind, Union.SyntaxKind_FunctionKeyword
    sealed interface IfKeyword : SyntaxKind, Union.SyntaxKind_IfKeyword
    sealed interface ImportKeyword : SyntaxKind, Union.SyntaxKind_ImportKeyword
    sealed interface InKeyword : SyntaxKind, Union.SyntaxKind_InKeyword
    sealed interface InstanceOfKeyword : SyntaxKind, Union.SyntaxKind_InstanceOfKeyword
    sealed interface NewKeyword : SyntaxKind, Union.SyntaxKind_NewKeyword
    sealed interface NullKeyword : SyntaxKind, Union.SyntaxKind_NullKeyword
    sealed interface ReturnKeyword : SyntaxKind, Union.SyntaxKind_ReturnKeyword
    sealed interface SuperKeyword : SyntaxKind, Union.SyntaxKind_SuperKeyword
    sealed interface SwitchKeyword : SyntaxKind, Union.SyntaxKind_SwitchKeyword
    sealed interface ThisKeyword : SyntaxKind, Union.SyntaxKind_ThisKeyword
    sealed interface ThrowKeyword : SyntaxKind, Union.SyntaxKind_ThrowKeyword
    sealed interface TrueKeyword : SyntaxKind, Union.SyntaxKind_TrueKeyword
    sealed interface TryKeyword : SyntaxKind, Union.SyntaxKind_TryKeyword
    sealed interface TypeOfKeyword : SyntaxKind, Union.SyntaxKind_TypeOfKeyword
    sealed interface VarKeyword : SyntaxKind, Union.SyntaxKind_VarKeyword
    sealed interface VoidKeyword : SyntaxKind, Union.SyntaxKind_VoidKeyword
    sealed interface WhileKeyword : SyntaxKind, Union.SyntaxKind_WhileKeyword
    sealed interface WithKeyword : SyntaxKind, Union.SyntaxKind_WithKeyword
    sealed interface ImplementsKeyword : SyntaxKind, Union.SyntaxKind_ImplementsKeyword
    sealed interface InterfaceKeyword : SyntaxKind, Union.SyntaxKind_InterfaceKeyword
    sealed interface LetKeyword : SyntaxKind, Union.SyntaxKind_LetKeyword
    sealed interface PackageKeyword : SyntaxKind, Union.SyntaxKind_PackageKeyword
    sealed interface PrivateKeyword : SyntaxKind, Union.SyntaxKind_PrivateKeyword
    sealed interface ProtectedKeyword : SyntaxKind, Union.SyntaxKind_ProtectedKeyword
    sealed interface PublicKeyword : SyntaxKind, Union.SyntaxKind_PublicKeyword
    sealed interface StaticKeyword : SyntaxKind, Union.SyntaxKind_StaticKeyword
    sealed interface YieldKeyword : SyntaxKind, Union.SyntaxKind_YieldKeyword
    sealed interface AbstractKeyword : SyntaxKind, Union.SyntaxKind_AbstractKeyword
    sealed interface AccessorKeyword : SyntaxKind, Union.SyntaxKind_AccessorKeyword
    sealed interface AsKeyword : SyntaxKind, Union.SyntaxKind_AsKeyword
    sealed interface AssertsKeyword : SyntaxKind, Union.SyntaxKind_AssertsKeyword
    sealed interface AssertKeyword : SyntaxKind, Union.SyntaxKind_AssertKeyword
    sealed interface AnyKeyword : SyntaxKind, Union.SyntaxKind_AnyKeyword
    sealed interface AsyncKeyword : SyntaxKind, Union.SyntaxKind_AsyncKeyword
    sealed interface AwaitKeyword : SyntaxKind, Union.SyntaxKind_AwaitKeyword
    sealed interface BooleanKeyword : SyntaxKind, Union.SyntaxKind_BooleanKeyword
    sealed interface ConstructorKeyword : SyntaxKind, Union.SyntaxKind_ConstructorKeyword
    sealed interface DeclareKeyword : SyntaxKind, Union.SyntaxKind_DeclareKeyword
    sealed interface GetKeyword : SyntaxKind, Union.SyntaxKind_GetKeyword
    sealed interface InferKeyword : SyntaxKind, Union.SyntaxKind_InferKeyword
    sealed interface IntrinsicKeyword : SyntaxKind, Union.SyntaxKind_IntrinsicKeyword
    sealed interface IsKeyword : SyntaxKind, Union.SyntaxKind_IsKeyword
    sealed interface KeyOfKeyword : SyntaxKind, Union.SyntaxKind_KeyOfKeyword
    sealed interface ModuleKeyword : SyntaxKind, Union.SyntaxKind_ModuleKeyword
    sealed interface NamespaceKeyword : SyntaxKind, Union.SyntaxKind_NamespaceKeyword
    sealed interface NeverKeyword : SyntaxKind, Union.SyntaxKind_NeverKeyword
    sealed interface OutKeyword : SyntaxKind, Union.SyntaxKind_OutKeyword
    sealed interface ReadonlyKeyword : SyntaxKind, Union.SyntaxKind_ReadonlyKeyword
    sealed interface RequireKeyword : SyntaxKind, Union.SyntaxKind_RequireKeyword
    sealed interface NumberKeyword : SyntaxKind, Union.SyntaxKind_NumberKeyword
    sealed interface ObjectKeyword : SyntaxKind, Union.SyntaxKind_ObjectKeyword
    sealed interface SatisfiesKeyword : SyntaxKind, Union.SyntaxKind_SatisfiesKeyword
    sealed interface SetKeyword : SyntaxKind, Union.SyntaxKind_SetKeyword
    sealed interface StringKeyword : SyntaxKind, Union.SyntaxKind_StringKeyword
    sealed interface SymbolKeyword : SyntaxKind, Union.SyntaxKind_SymbolKeyword
    sealed interface TypeKeyword : SyntaxKind, Union.SyntaxKind_TypeKeyword
    sealed interface UndefinedKeyword : SyntaxKind, Union.SyntaxKind_UndefinedKeyword
    sealed interface UniqueKeyword : SyntaxKind, Union.SyntaxKind_UniqueKeyword
    sealed interface UnknownKeyword : SyntaxKind, Union.SyntaxKind_UnknownKeyword
    sealed interface FromKeyword : SyntaxKind, Union.SyntaxKind_FromKeyword
    sealed interface GlobalKeyword : SyntaxKind, Union.SyntaxKind_GlobalKeyword
    sealed interface BigIntKeyword : SyntaxKind, Union.SyntaxKind_BigIntKeyword
    sealed interface OverrideKeyword : SyntaxKind, Union.SyntaxKind_OverrideKeyword
    sealed interface OfKeyword : SyntaxKind, Union.SyntaxKind_OfKeyword
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
    sealed interface FunctionType : SyntaxKind, Union.SyntaxKind_FunctionType
    sealed interface ConstructorType : SyntaxKind, Union.SyntaxKind_ConstructorType
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
    sealed interface ClassExpression : SyntaxKind, Union.SyntaxKind_ClassExpression
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
    sealed interface ClassDeclaration : SyntaxKind, Union.SyntaxKind_ClassDeclaration
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
    sealed interface CaseClause : SyntaxKind
    sealed interface DefaultClause : SyntaxKind
    sealed interface HeritageClause : SyntaxKind
    sealed interface CatchClause : SyntaxKind
    sealed interface AssertClause : SyntaxKind
    sealed interface AssertEntry : SyntaxKind
    sealed interface ImportTypeAssertionContainer : SyntaxKind
    sealed interface PropertyAssignment : SyntaxKind
    sealed interface ShorthandPropertyAssignment : SyntaxKind
    sealed interface SpreadAssignment : SyntaxKind
    sealed interface EnumMember : SyntaxKind
    sealed interface UnparsedPrologue : SyntaxKind
    sealed interface UnparsedPrepend : SyntaxKind
    sealed interface UnparsedText : SyntaxKind, Union.SyntaxKind_UnparsedText
    sealed interface UnparsedInternalText : SyntaxKind, Union.SyntaxKind_UnparsedInternalText
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
    sealed interface JSDocEnumTag : SyntaxKind
    sealed interface JSDocParameterTag : SyntaxKind
    sealed interface JSDocReturnTag : SyntaxKind
    sealed interface JSDocThisTag : SyntaxKind
    sealed interface JSDocTypeTag : SyntaxKind
    sealed interface JSDocTemplateTag : SyntaxKind
    sealed interface JSDocTypedefTag : SyntaxKind
    sealed interface JSDocSeeTag : SyntaxKind
    sealed interface JSDocPropertyTag : SyntaxKind
    sealed interface SyntaxList : SyntaxKind
    sealed interface NotEmittedStatement : SyntaxKind
    sealed interface PartiallyEmittedExpression : SyntaxKind
    sealed interface CommaListExpression : SyntaxKind
    sealed interface MergeDeclarationMarker : SyntaxKind
    sealed interface EndOfDeclarationMarker : SyntaxKind
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
}
