@file:Suppress("NOTHING_TO_INLINE")

package styled

import kotlinx.html.*
import kotlinx.html.attributes.*
import react.*

/* HTML elements according to https://developer.mozilla.org/en-US/docs/Web/HTML/Element */

inline fun <T : Tag> RBuilder.styledTag(
    block: StyledDOMBuilder<T>.() -> Unit,
    noinline factory: (TagConsumer<Unit>) -> T
) = child(StyledDOMBuilder(factory).apply(block).create())

/* Main root */

inline fun RBuilder.styledHtml(block: StyledDOMBuilder<HTML>.() -> Unit) = styledTag(block) { HTML(emptyMap, it) }

/* Document metadata */

inline fun RBuilder.styledBase(block: StyledDOMBuilder<BASE>.() -> Unit) = styledTag(block) { BASE(emptyMap, it) }

inline fun RBuilder.styledHead(block: StyledDOMBuilder<HEAD>.() -> Unit) = styledTag(block) { HEAD(emptyMap, it) }

inline fun RBuilder.styledLink(
    href: String? = null,
    rel: String? = null,
    type: String? = null,
    block: StyledDOMBuilder<LINK>.() -> Unit
) = styledTag(block) { LINK(attributesMapOf("href", href, "rel", rel, "type", type), it) }

inline fun RBuilder.styledMeta(
    name: String? = null,
    content: String? = null,
    block: StyledDOMBuilder<META>.() -> Unit
) = styledTag(block) { META(attributesMapOf("name", name, "content", content), it) }

inline fun RBuilder.styledStyle(type: String? = null, content: String = "") =
    styledTag({ +content }) { STYLE(attributesMapOf("type", type), it) }

inline fun RBuilder.styledStyle(type: String? = null, block: StyledDOMBuilder<STYLE>.() -> Unit) =
    styledTag(block) { STYLE(attributesMapOf("type", type), it) }

inline fun RBuilder.styledTitle(content: String = "") = styledTag({ +content }) { TITLE(emptyMap, it) }
inline fun RBuilder.styledTitle(block: StyledDOMBuilder<TITLE>.() -> Unit) = styledTag(block) { TITLE(emptyMap, it) }

/* Sectioning root */

inline fun RBuilder.styledBody(block: StyledDOMBuilder<BODY>.() -> Unit) = styledTag(block) { BODY(emptyMap, it) }

/* Content sectioning */

inline fun RBuilder.styledAddress(block: StyledDOMBuilder<ADDRESS>.() -> Unit) =
    styledTag(block) { ADDRESS(emptyMap, it) }

inline fun RBuilder.styledArticle(block: StyledDOMBuilder<ARTICLE>.() -> Unit) =
    styledTag(block) { ARTICLE(emptyMap, it) }

inline fun RBuilder.styledAside(block: StyledDOMBuilder<ASIDE>.() -> Unit) = styledTag(block) { ASIDE(emptyMap, it) }

inline fun RBuilder.styledFooter(block: StyledDOMBuilder<FOOTER>.() -> Unit) = styledTag(block) { FOOTER(emptyMap, it) }

inline fun RBuilder.styledHeader(block: StyledDOMBuilder<HEADER>.() -> Unit) = styledTag(block) { HEADER(emptyMap, it) }

inline fun RBuilder.styledH1(block: StyledDOMBuilder<H1>.() -> Unit) = styledTag(block) { H1(emptyMap, it) }

inline fun RBuilder.styledH2(block: StyledDOMBuilder<H2>.() -> Unit) = styledTag(block) { H2(emptyMap, it) }

inline fun RBuilder.styledH3(block: StyledDOMBuilder<H3>.() -> Unit) = styledTag(block) { H3(emptyMap, it) }

inline fun RBuilder.styledH4(block: StyledDOMBuilder<H4>.() -> Unit) = styledTag(block) { H4(emptyMap, it) }

inline fun RBuilder.styledH5(block: StyledDOMBuilder<H5>.() -> Unit) = styledTag(block) { H5(emptyMap, it) }

inline fun RBuilder.styledH6(block: StyledDOMBuilder<H6>.() -> Unit) = styledTag(block) { H6(emptyMap, it) }

inline fun RBuilder.styledMain(block: StyledDOMBuilder<MAIN>.() -> Unit) = styledTag(block) { MAIN(emptyMap, it) }

inline fun RBuilder.styledNav(block: StyledDOMBuilder<NAV>.() -> Unit) = styledTag(block) { NAV(emptyMap, it) }

inline fun RBuilder.styledSection(block: StyledDOMBuilder<SECTION>.() -> Unit) =
    styledTag(block) { SECTION(emptyMap, it) }

/* Text content */

inline fun RBuilder.styledBlockquote(block: StyledDOMBuilder<BLOCKQUOTE>.() -> Unit) =
    styledTag(block) { BLOCKQUOTE(emptyMap, it) }

inline fun RBuilder.styledDd(block: StyledDOMBuilder<DD>.() -> Unit) = styledTag(block) { DD(emptyMap, it) }

inline fun RBuilder.styledDiv(block: StyledDOMBuilder<DIV>.() -> Unit) = styledTag(block) { DIV(emptyMap, it) }

inline fun RBuilder.styledDl(block: StyledDOMBuilder<DL>.() -> Unit) = styledTag(block) { DL(emptyMap, it) }

inline fun RBuilder.styledDt(block: StyledDOMBuilder<DT>.() -> Unit) = styledTag(block) { DT(emptyMap, it) }

inline fun RBuilder.styledFigcaption(block: StyledDOMBuilder<FIGCAPTION>.() -> Unit) =
    styledTag(block) { FIGCAPTION(emptyMap, it) }

inline fun RBuilder.styledFigure(block: StyledDOMBuilder<FIGURE>.() -> Unit) = styledTag(block) { FIGURE(emptyMap, it) }

inline fun RBuilder.styledHr(block: StyledDOMBuilder<HR>.() -> Unit) = styledTag(block) { HR(emptyMap, it) }

inline fun RBuilder.styledLi(block: StyledDOMBuilder<LI>.() -> Unit) = styledTag(block) { LI(emptyMap, it) }

inline fun RBuilder.styledOl(block: StyledDOMBuilder<OL>.() -> Unit) = styledTag(block) { OL(emptyMap, it) }

inline fun RBuilder.styledP(block: StyledDOMBuilder<P>.() -> Unit) = styledTag(block) { P(emptyMap, it) }

inline fun RBuilder.styledPre(block: StyledDOMBuilder<PRE>.() -> Unit) = styledTag(block) { PRE(emptyMap, it) }

inline fun RBuilder.styledUl(block: StyledDOMBuilder<UL>.() -> Unit) = styledTag(block) { UL(emptyMap, it) }

/* Inline text semantics */

inline fun RBuilder.styledA(href: String? = null, target: String? = null, block: StyledDOMBuilder<A>.() -> Unit) =
    styledTag(block) { A(attributesMapOf("href", href, "target", target), it) }

inline fun RBuilder.styledAbbr(block: StyledDOMBuilder<ABBR>.() -> Unit) = styledTag(block) { ABBR(emptyMap, it) }

inline fun RBuilder.styledB(block: StyledDOMBuilder<B>.() -> Unit) = styledTag(block) { B(emptyMap, it) }

inline fun RBuilder.styledBdi(block: StyledDOMBuilder<BDI>.() -> Unit) = styledTag(block) { BDI(emptyMap, it) }

inline fun RBuilder.styledBdo(block: StyledDOMBuilder<BDO>.() -> Unit) = styledTag(block) { BDO(emptyMap, it) }

inline fun RBuilder.styledBr(block: StyledDOMBuilder<BR>.() -> Unit) = styledTag(block) { BR(emptyMap, it) }

inline fun RBuilder.styledCite(block: StyledDOMBuilder<CITE>.() -> Unit) = styledTag(block) { CITE(emptyMap, it) }

inline fun RBuilder.styledCode(block: StyledDOMBuilder<CODE>.() -> Unit) = styledTag(block) { CODE(emptyMap, it) }

// TODO DATA isn't defined in kotlinx.html

inline fun RBuilder.styledDfn(block: StyledDOMBuilder<DFN>.() -> Unit) = styledTag(block) { DFN(emptyMap, it) }

inline fun RBuilder.styledEm(block: StyledDOMBuilder<EM>.() -> Unit) = styledTag(block) { EM(emptyMap, it) }

inline fun RBuilder.styledI(block: StyledDOMBuilder<I>.() -> Unit) = styledTag(block) { I(emptyMap, it) }

inline fun RBuilder.styledKbd(block: StyledDOMBuilder<KBD>.() -> Unit) = styledTag(block) { KBD(emptyMap, it) }

inline fun RBuilder.styledMark(block: StyledDOMBuilder<MARK>.() -> Unit) = styledTag(block) { MARK(emptyMap, it) }

inline fun RBuilder.styledQ(block: StyledDOMBuilder<Q>.() -> Unit) = styledTag(block) { Q(emptyMap, it) }

// TODO RB isn't defined in kotlinx.html

inline fun RBuilder.styledRp(block: StyledDOMBuilder<RP>.() -> Unit) = styledTag(block) { RP(emptyMap, it) }

inline fun RBuilder.styledRt(block: StyledDOMBuilder<RT>.() -> Unit) = styledTag(block) { RT(emptyMap, it) }

// TODO RTC isn't defined in kotlinx.html

inline fun RBuilder.styledRuby(block: StyledDOMBuilder<RUBY>.() -> Unit) = styledTag(block) { RUBY(emptyMap, it) }

// TODO S isn't defined in kotlinx.html

inline fun RBuilder.styledSamp(block: StyledDOMBuilder<SAMP>.() -> Unit) = styledTag(block) { SAMP(emptyMap, it) }

inline fun RBuilder.styledSmall(block: StyledDOMBuilder<SMALL>.() -> Unit) = styledTag(block) { SMALL(emptyMap, it) }

inline fun RBuilder.styledSpan(block: StyledDOMBuilder<SPAN>.() -> Unit) = styledTag(block) { SPAN(emptyMap, it) }

inline fun RBuilder.styledStrong(block: StyledDOMBuilder<STRONG>.() -> Unit) = styledTag(block) { STRONG(emptyMap, it) }

inline fun RBuilder.styledSub(block: StyledDOMBuilder<SUB>.() -> Unit) = styledTag(block) { SUB(emptyMap, it) }

inline fun RBuilder.styledSup(block: StyledDOMBuilder<SUP>.() -> Unit) = styledTag(block) { SUP(emptyMap, it) }

inline fun RBuilder.styledTime(block: StyledDOMBuilder<TIME>.() -> Unit) = styledTag(block) { TIME(emptyMap, it) }

// TODO U isn't defined in kotlinx.html

inline fun RBuilder.styledVar(block: StyledDOMBuilder<VAR>.() -> Unit) = styledTag(block) { VAR(emptyMap, it) }

// TODO WBR isn't defined in kotlinx.html

/* Image and multimedia */

inline fun RBuilder.styledArea(
    shape: AreaShape? = null,
    alt: String? = null,
    block: StyledDOMBuilder<AREA>.() -> Unit
) = styledTag(block) { AREA(attributesMapOf("Shape", shape?.enumEncode(), "alt", alt), it) }

inline fun RBuilder.styledAudio(block: StyledDOMBuilder<AUDIO>.() -> Unit) = styledTag(block) { AUDIO(emptyMap, it) }

inline fun RBuilder.styledImg(alt: String? = null, src: String? = null, block: StyledDOMBuilder<IMG>.() -> Unit) =
    styledTag(block) { IMG(attributesMapOf("alt", alt, "src", src), it) }

inline fun RBuilder.styledMap(name: String? = null, block: StyledDOMBuilder<MAP>.() -> Unit) =
    styledTag(block) { MAP(attributesMapOf("name", name), it) }

// TODO TRACK isn't defined in kotlinx.html

inline fun RBuilder.styledVideo(block: StyledDOMBuilder<VIDEO>.() -> Unit) = styledTag(block) { VIDEO(emptyMap, it) }

/* Embedded content */

inline fun RBuilder.styledEmbed(block: StyledDOMBuilder<EMBED>.() -> Unit) = styledTag(block) { EMBED(emptyMap, it) }

inline fun RBuilder.styledIframe(sandbox: IframeSandbox? = null, content: String = "") =
    styledTag({ +content }) { IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode()), it) }

inline fun RBuilder.styledIframe(sandbox: IframeSandbox? = null, block: StyledDOMBuilder<IFRAME>.() -> Unit) =
    styledTag(block) { IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode()), it) }

inline fun RBuilder.styledObject(block: StyledDOMBuilder<OBJECT>.() -> Unit) = styledTag(block) { OBJECT(emptyMap, it) }

inline fun RBuilder.styledParam(
    name: String? = null,
    value: String? = null,
    block: StyledDOMBuilder<PARAM>.() -> Unit
) = styledTag(block) { PARAM(attributesMapOf("name", name, "value", value), it) }

inline fun RBuilder.styledPicture(block: StyledDOMBuilder<PICTURE>.() -> Unit) =
    styledTag(block) { PICTURE(emptyMap, it) }

// TODO PORTAL isn't defined in kotlinx.html

inline fun RBuilder.styledSource(block: StyledDOMBuilder<SOURCE>.() -> Unit) = styledTag(block) { SOURCE(emptyMap, it) }

/* SVG and MathML */

inline fun RBuilder.styledSvg(content: String = "") = styledTag({ +content }) { SVG(emptyMap, it) }
inline fun RBuilder.styledSvg(block: StyledDOMBuilder<SVG>.() -> Unit) = styledTag(block) { SVG(emptyMap, it) }

inline fun RBuilder.styledMath(block: StyledDOMBuilder<MATH>.() -> Unit) = styledTag(block) { MATH(emptyMap, it) }

/* Scripting */

inline fun RBuilder.styledCanvas(content: String = "") = styledTag({ +content }) { CANVAS(emptyMap, it) }
inline fun RBuilder.styledCanvas(block: StyledDOMBuilder<CANVAS>.() -> Unit) = styledTag(block) { CANVAS(emptyMap, it) }

inline fun RBuilder.styledNoscript(block: StyledDOMBuilder<NOSCRIPT>.() -> Unit) =
    styledTag(block) { NOSCRIPT(emptyMap, it) }

inline fun RBuilder.styledScript(
    type: String? = null,
    src: String? = null,
    block: StyledDOMBuilder<SCRIPT>.() -> Unit
) = styledTag(block) { SCRIPT(attributesMapOf("type", type, "src", src), it) }

/* Demarcating edits */

inline fun RBuilder.styledDel(block: StyledDOMBuilder<DEL>.() -> Unit) = styledTag(block) { DEL(emptyMap, it) }

inline fun RBuilder.styledIns(block: StyledDOMBuilder<INS>.() -> Unit) = styledTag(block) { INS(emptyMap, it) }

/* Table content */

inline fun RBuilder.styledCaption(block: StyledDOMBuilder<CAPTION>.() -> Unit) =
    styledTag(block) { CAPTION(emptyMap, it) }

inline fun RBuilder.styledCol(block: StyledDOMBuilder<COL>.() -> Unit) = styledTag(block) { COL(emptyMap, it) }

inline fun RBuilder.styledColgroup(block: StyledDOMBuilder<COLGROUP>.() -> Unit) =
    styledTag(block) { COLGROUP(emptyMap, it) }

inline fun RBuilder.styledTable(block: StyledDOMBuilder<TABLE>.() -> Unit) = styledTag(block) { TABLE(emptyMap, it) }

inline fun RBuilder.styledTbody(block: StyledDOMBuilder<TBODY>.() -> Unit) = styledTag(block) { TBODY(emptyMap, it) }

inline fun RBuilder.styledTd(block: StyledDOMBuilder<TD>.() -> Unit) = styledTag(block) { TD(emptyMap, it) }

inline fun RBuilder.styledTfoot(block: StyledDOMBuilder<TFOOT>.() -> Unit) = styledTag(block) { TFOOT(emptyMap, it) }

inline fun RBuilder.styledTh(scope: ThScope? = null, block: StyledDOMBuilder<TH>.() -> Unit) =
    styledTag(block) { TH(attributesMapOf("scope", scope?.enumEncode()), it) }

inline fun RBuilder.styledThead(block: StyledDOMBuilder<THEAD>.() -> Unit) = styledTag(block) { THEAD(emptyMap, it) }

inline fun RBuilder.styledTr(block: StyledDOMBuilder<TR>.() -> Unit) = styledTag(block) { TR(emptyMap, it) }

/* Forms */

inline fun RBuilder.styledButton(
    formEncType: ButtonFormEncType? = null,
    formMethod: ButtonFormMethod? = null,
    type: ButtonType? = null,
    block: StyledDOMBuilder<BUTTON>.() -> Unit
) = styledTag(block) {
    BUTTON(
        attributesMapOf(
            "formenctype",
            formEncType?.enumEncode(),
            "formmethod",
            formMethod?.enumEncode(),
            "type",
            type?.enumEncode()
        ), it
    )
}

inline fun RBuilder.styledDatalist(block: StyledDOMBuilder<DATALIST>.() -> Unit) =
    styledTag(block) { DATALIST(emptyMap, it) }

inline fun RBuilder.styledFieldset(block: StyledDOMBuilder<FIELDSET>.() -> Unit) =
    styledTag(block) { FIELDSET(emptyMap, it) }

inline fun RBuilder.styledForm(
    action: String? = null,
    encType: FormEncType? = null,
    method: FormMethod? = null,
    block: StyledDOMBuilder<FORM>.() -> Unit
) = styledTag(block) {
    FORM(
        attributesMapOf(
            "action",
            action,
            "enctype",
            encType?.enumEncode(),
            "method",
            method?.enumEncode()
        ), it
    )
}

inline fun RBuilder.styledInput(
    type: InputType? = null,
    formEncType: InputFormEncType? = null,
    formMethod: InputFormMethod? = null,
    name: String? = null,
    block: StyledDOMBuilder<INPUT>.() -> Unit
) = styledTag(block) {
    INPUT(
        attributesMapOf(
            "type",
            type?.enumEncode(),
            "formenctype",
            formEncType?.enumEncode(),
            "formmethod",
            formMethod?.enumEncode(),
            "name",
            name
        ), it
    )
}

inline fun RBuilder.styledLabel(block: StyledDOMBuilder<LABEL>.() -> Unit) = styledTag(block) { LABEL(emptyMap, it) }

inline fun RBuilder.styledLegend(block: StyledDOMBuilder<LEGEND>.() -> Unit) = styledTag(block) { LEGEND(emptyMap, it) }

inline fun RBuilder.styledMeter(block: StyledDOMBuilder<METER>.() -> Unit) = styledTag(block) { METER(emptyMap, it) }

inline fun RBuilder.styledOptgroup(label: String? = null, block: StyledDOMBuilder<OPTGROUP>.() -> Unit) =
    styledTag(block) { OPTGROUP(attributesMapOf("label", label), it) }

inline fun RBuilder.styledOption(content: String = "") = styledTag({ +content }) { OPTION(emptyMap, it) }
inline fun RBuilder.styledOption(block: StyledDOMBuilder<OPTION>.() -> Unit) = styledTag(block) { OPTION(emptyMap, it) }

inline fun RBuilder.styledOutput(block: StyledDOMBuilder<OUTPUT>.() -> Unit) = styledTag(block) { OUTPUT(emptyMap, it) }

inline fun RBuilder.styledProgress(block: StyledDOMBuilder<PROGRESS>.() -> Unit) =
    styledTag(block) { PROGRESS(emptyMap, it) }

inline fun RBuilder.styledSelect(block: StyledDOMBuilder<SELECT>.() -> Unit) = styledTag(block) { SELECT(emptyMap, it) }

inline fun RBuilder.styledTextarea(
    rows: String? = null,
    cols: String? = null,
    wrap: TextAreaWrap? = null,
    content: String = ""
) = styledTag({ +content }) { TEXTAREA(attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode()), it) }

inline fun RBuilder.styledTextarea(
    rows: String? = null,
    cols: String? = null,
    wrap: TextAreaWrap? = null,
    block: StyledDOMBuilder<TEXTAREA>.() -> Unit
) = styledTag(block) { TEXTAREA(attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode()), it) }

/* Interactive elements */

inline fun RBuilder.styledDetails(block: StyledDOMBuilder<DETAILS>.() -> Unit) =
    styledTag(block) { DETAILS(emptyMap, it) }

inline fun RBuilder.styledDialog(block: StyledDOMBuilder<DIALOG>.() -> Unit) = styledTag(block) { DIALOG(emptyMap, it) }

// TODO MENU isn't defined in kotlinx.html

inline fun RBuilder.styledSummary(block: StyledDOMBuilder<SUMMARY>.() -> Unit) =
    styledTag(block) { SUMMARY(emptyMap, it) }

/* Web Components */

// TODO SLOT isn't defined in kotlinx.html

// TODO TEMPLATE isn't defined in kotlinx.html
