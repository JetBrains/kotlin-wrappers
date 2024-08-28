<#import "includes/page_metadata.ftl" as page_metadata>
<#import "includes/header.ftl" as header>
<#import "includes/footer.ftl" as footer>
<!DOCTYPE html>
<html class="no-js">
<head>
    <meta property="og:site_name" content="Kotlin Wrappers">
    <meta property="og:title" content="API Reference">
    <meta property="og:type" content="website">
    <meta property="og:image" content="/kotlin-wrappers/images/social-preview.png">
    <meta property="og:image:alt" content="Kotlin Wrappers">
    <meta property="og:image:width" content="1200">
    <meta property="og:image:height" content="600">
    <meta property="og:url" content="https://jetbrains.github.io/kotlin-wrappers/">
    <meta property="twitter:card" content="summary_large_image">
    <meta property="twitter:title" content="Kotlin Wrappers">
    <meta property="twitter:description" content="API Reference">
    <meta property="twitter:image:src" content="/kotlin-wrappers/images/social-preview.png">
    <meta name="viewport" content="width=device-width, initial-scale=1" charset="UTF-8">
    <@page_metadata.display/>
    <@template_cmd name="pathToRoot"><script>var pathToRoot = "${pathToRoot}";</script></@template_cmd>
    <script>document.documentElement.classList.replace("no-js","js");</script>
    <#-- This script doesn't need to be there but it is nice to have
    since app in dark mode doesn't 'blink' (class is added before it is rendered) -->
    <script>const storage = localStorage.getItem("dokka-dark-mode")
    if (storage == null) {
        const osDarkSchemePreferred = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches
        if (osDarkSchemePreferred === true) {
            document.getElementsByTagName("html")[0].classList.add("theme-dark")
        }
    } else {
        const savedDarkMode = JSON.parse(storage)
        if(savedDarkMode === true) {
            document.getElementsByTagName("html")[0].classList.add("theme-dark")
        }
    }
    </script>
    <#-- Resources (scripts, stylesheets) are handled by Dokka.
    Use customStyleSheets and customAssets to change them. -->
    <@resources/>
</head>
<body>
    <div class="root">
        <@header.display/>
        <div id="container">
            <div class="sidebar" id="leftColumn">
                <div class="sidebar--inner" id="sideMenu"></div>
            </div>
            <div id="main">
                <@content/>
                <@footer.display/>
            </div>
        </div>
    </div>
</body>
</html>
