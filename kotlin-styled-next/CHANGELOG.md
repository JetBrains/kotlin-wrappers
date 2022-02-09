## 1.1.0

We have noticed that using a single stylesheet is detrimental to performance. Specifically, we were witnessing that
style recalculation took around 30 ms whenever a stylesheet was modified in a complex web application. In this version
we have introduced rule partitioning: once 50 rules (50 is an empirical number) are added to a stylesheet, a new
stylesheet is created. This helped reduce style recalculation time by an order of magnitude. Additionally, as
kotlin-styled-next removes unused rules when the browser is idle, stylesheet compression was implemented: successive
style sheets with less than 50 rules in total are combined into one stylesheet. Without compression we would end up with
lots and lots of stylesheets with just a handful of rules. Kudos to [Vlad](https://github.com/Recognized) for
implementing this!

## 1.0

First public release. This is the version that successfully
replaced [kotlin-styled](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-styled)
in [JetBrains Space](https://www.jetbrains.com/space/) without any regressions in functionality or performance. Kudos
to [Konstantin](https://github.com/tretikoff) for the implementation and [Akif](https://github.com/Skolotsky) for the
ideas and guidance!